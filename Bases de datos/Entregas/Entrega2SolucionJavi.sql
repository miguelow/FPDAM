CREATE DATABASE IF NOT EXISTS ag2_proyectos;

use ag2_proyectos;

DROP TABLE asignacion;
DROP TABLE empleados;
DROP TABLE departamentos;
DROP TABLE proyectos;

/*DESACTIVAMOS LAS RESTRICCIONES DE INTEGRIDAD REFERENCIAL */
SET foreign_key_checks = 0;


CREATE TABLE IF NOT EXISTS empleados(
	idempleado INT(11) NOT NULL,
    nombre VARCHAR(25) NOT NULL,
    apellidos VARCHAR(25) NOT NULL,
    sexo CHAR(1) DEFAULT " ",
    municipio VARCHAR(50)  DEFAULT " ",
    fecha_nac DATE,
    sueldo INT(11) NOT NULL,
    idpto INT(11) NOT NULL
);

CREATE TABLE IF NOT EXISTS proyectos(
idproyecto INT(11) NOT NULL,
nombre VARCHAR(25),
fecha_ini DATE,
fecha_fin DATE
);

CREATE TABLE IF NOT EXISTS departamentos(
idpto INT(11) NOT NULL,
nombre VARCHAR(25),
presupuestos INT(11)
);

CREATE TABLE IF NOT EXISTS asignacion(
idempleado INT(11) NOT NULL,
idproyecto INT(11) NOT NULL
);

ALTER TABLE departamentos
	ADD PRIMARY KEY (idpto);

ALTER TABLE proyectos
	ADD PRIMARY KEY (idproyecto);
    
ALTER TABLE empleados
	ADD PRIMARY KEY (idempleado, nombre);

ALTER TABLE empleados
	ADD CONSTRAINT idpto_fk  FOREIGN KEY (idpto) 
    REFERENCES departamentos(idpto) 
    ON DELETE NO ACTION
    ON UPDATE CASCADE;
    
ALTER TABLE asignacion
	ADD CONSTRAINT idempleado_fk FOREIGN KEY (idempleado) REFERENCES empleados(idempleado)
		ON DELETE CASCADE
        ON UPDATE CASCADE,
    ADD CONSTRAINT idproyecto_fk FOREIGN KEY (idproyecto) REFERENCES proyectos(idproyecto)
		ON DELETE NO ACTION
        ON UPDATE CASCADE;


INSERT INTO empleados(idempleado, nombre, apellidos, sexo, fecha_nac, sueldo, municipio, idpto)
	VALUES(10478, 'Alberto', 'Pérez López', 'M', '1965-09-12', 1500, 'Madrid', 1),
		(10479, 'Gloria', 'Ruiz Ruiz', 'F', '1968-06-12', 1650, 'Sevilla', 2),
		(10480, 'Antonio', 'García Montero', 'M', '1969-10-12', 1350, 'Madrid', 1),
		(10481, 'Ana', 'López Ramírez', 'F', '1970-05-12', 1250, 'Sevilla', 3),
		(10482, 'Eduardo', 'Chicón Terrales', 'M', '1920-05-12', 1470, 'Córdoba', 2);
        
INSERT INTO proyectos (idproyecto, nombre, fecha_ini, fecha_fin)
	VALUES(1, 'SINUBE', '2018-09-12', '2019-09-12'),
		(2, 'TRASPI', '2017-09-12', '2019-09-12'),
		(3, 'RUNTA', '2016-09-12', '2019-09-12'),
		(4, 'CARTAL', '2019-05-12', '2019-09-12');
        
INSERT INTO departamentos (idpto, nombre, presupuestos)
	VALUES(1, 'I+D', 50000),
		(2, 'Diseño', 25000),
		(3, 'Ventas', 15000),
		(4, 'Marketing', 10000);
        
INSERT INTO asignacion (idempleado,idproyecto)
VALUES (10478, 1),
	(10480, 3),
	(10481, 1),
	(10482, 2);


/*REESTABLECEMOS LAS RESTRICCIONES DE INTEGRIDAD REFERENCIAL */
SET foreign_key_checks = 1;
COMMIT;

    /*______________________CONSULTA 1______________________*/
/*
SELECT * FROM empleados;
SELECT * FROM proyectos;
SELECT * From departamentos;
SELECT * FROM asignacion;
*/





/*______________________CONSULTA 2______________________*/
SELECT nombre, fecha_ini AS "Fecha de inicio del proyecto" FROM proyectos
	WHERE MONTH(fecha_ini) > 3;

/*______________________CONSULTA 3______________________*/
SELECT * FROM empleados
WHERE apellidos LIKE "%López%";

/*______________________CONSULTA 4 y 5______________________*/

SELECT nombre FROM proyectos
WHERE idproyecto IN (SELECT idproyecto FROM asignacion
			WHERE idempleado = 10480);
            
/*______________________CONSULTA 6______________________*/

SELECT * FROM empleados
	WHERE municipio IN (SELECT municipio FROM empleados WHERE municipio LIKE "Madrid") ||
    municipio IN (SELECT municipio FROM empleados WHERE municipio LIKE "Cordoba");


SELECT * FROM empleados 
	WHERE municipio LIKE "Madrid" OR municipio LIKE "Cordoba";


/*______________________CONSULTA 7______________________*/

SELECT * FROM empleados
	WHERE sueldo > 1300 and sueldo <  1550;
    

/*______________________CONSULTA 8______________________*/
/*No hay empleados que nazcan después de 1976, así que hemos puesto 1966*/
SELECT * from empleados 
	WHERE YEAR(fecha_nac) > 1966
    ORDER BY fecha_nac DESC;

/*______________________CONSULTA 9______________________*/

UPDATE departamentos
	SET presupuestos = presupuestos + 5000
	WHERE nombre LIKE "Marketing";
SELECT nombre, presupuestos FROM departamentos
	WHERE nombre LIKE "Marketing";

/*______________________CONSULTA 10______________________*/
/*10.	Se va a cambiar de proyecto a “Alberto Pérez López”.
 Modifícalo para que tenga asignado el proyecto “RUNTA”.*/
 
 SELECT * FROM asignacion;
 UPDATE asignacion
	SET idproyecto = (SELECT idproyecto FROM proyectos WHERE nombre LIKE "Runta")
    WHERE idempleado in (SELECT idempleado FROM empleados WHERE nombre LIKE "Alberto" AND apellidos LIKE "Pérez López");


 
 /*______________________CONSULTA 11______________________*/
 /*Por motivos de logística “Antonio García Montero” ya no seguirá en el proyecto que tenía asignado y por lo tanto hay que quitarle esa asignación. */
 
 DELETE FROM asignacion
 WHERE idempleado LIKE (SELECT idempleado FROM empleados WHERE nombre LIKE "Antonio" AND apellidos LIKE "García Montero");
 
 SELECT * FROM asignacion;
 
  /*______________________CONSULTA 12______________________*/
 /*Sacar todos los empleados del departamento de Diseño y que ganen más de 1500 Euros.*/
 
DELETE FROM empleados 
WHERE sueldo > 1500 AND 
idpto IN (SELECT idpto FROM departamentos WHERE nombre LIKE "Diseño");
 
 SELECT * FROM empleados;
 
 
   /*______________________CONSULTA 13______________________*/
 /*Incrementar en un 5% el sueldo de los empleados que pertenezcan al departamento de I+D y que ganen menos de 1400 Euros. */

 
 UPDATE empleados
 SET sueldo =  sueldo + (sueldo/100*5)
 WHERE sueldo < 1400 AND
 idpto IN (SELECT idpto FROM departamentos WHERE nombre LIKE "I+D");




