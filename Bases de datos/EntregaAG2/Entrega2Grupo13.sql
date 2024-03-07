CREATE DATABASE IF NOT EXISTS actividad;
USE actividad;
CREATE TABLE asignacion(
Idempleado int(11),
Idproyecto int(11)
);
CREATE TABLE empleados(
IdEmpleado int(11),
Nombre varchar(25),
Apellidos varchar(25),
Sexo char(1),
Municipio varchar(50),
Fecha_nac date,
Sueldo int(11),
IdDpto int(11)
);
CREATE TABLE proyectos(
Idproyecto int(11),
nombre varchar(25),
fecha_ini date,
fecha_fin date
);
CREATE TABLE departamentos(
IdDpto int(11),
nombre varchar(25),
presupuestos int(11)
);
-- Bulk insert
INSERT INTO asignacion(Idempleado,Idproyecto)
VALUES 
(10478,1),
(10480,3),
(10481,1),
(10482,2);
-- Bulk insert
INSERT INTO departamentos(IdDpto,Nombre,Presupuestos)
VALUES 
(1,'I+D',50000),
(2,'Diseño',25000),
(3,'ventas',15000),
(4,'Marketing',10000);
-- Bulk insert
INSERT INTO empleados(IdEmpleado,Nombre,Apellidos,Sexo,Fecha_Nac,Sueldo,Municipio,IdDpto)
VALUES 
(10478,'Alberto','Perez Lopez','M','1965-09-12',1500,'Madrid',1),
(10479,'Gloria','Ruiz Ruiz','F','1968-06-12',1650,'Sevilla',2),
(10400,'Antonio','Garcia Montero','M','1969-10-12',1350,'Madrid',1),
(10481,'Ana','López Ramírez','F','1970-05-12',1250,'Sevilla',3),
(10482,'Eduardo','Chicón Terrales','M','1920-05-12',1470,'Córdoba',2);
-- Bulk insert
INSERT INTO proyectos(Idproyecto,nombre,fecha_ini,fecha_fin)
VALUES 
(1,'SINUBE','2018-09-12','2019-09-12'),
(2,'TRASPI','2017-09-12','2019-09-12'),
(3,'RUNTA','2016-09-12','2019-09-12'),
(4,'CARTAL','2019-05-12','2019-09-12');

ALTER TABLE departamentos
ADD PRIMARY KEY(IdDpto);

ALTER TABLE empleados
ADD PRIMARY KEY (IdEmpleado);

ALTER TABLE proyectos
ADD PRIMARY KEY (Idproyecto);

ALTER TABLE asignacion
ADD CONSTRAINT asignacion_ibfk_2
FOREIGN KEY (Idproyecto)
REFERENCES proyectos(Idproyecto)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE empleados
ADD CONSTRAINT departamentos_ibfk_1
FOREIGN KEY (IdDpto)
REFERENCES departamentos(IdDpto)
ON DELETE NO ACTION
ON UPDATE NO ACTION;
 
 -- 1 Todos los datos de las 4 tablas.
SELECT *
FROM  asignacion;
SELECT *
FROM departamentos;
SELECT *
FROM empleados;
SELECT *
FROM proyectos;

-- 2 e necesita una lista de los proyectos (sólo indicando el nombre y la fecha de inicio) que empiezan a partir de Marzo.
-- En la cabecera de la columna de la fecha debe de poner “Fecha de inicio del proyecto”.
SELECT nombre, fecha_ini AS 'Fecha inicio de proyecto'
FROM proyectos
WHERE MONTH(fecha_ini) >= 3;

-- 3 Listado de todos los empleados que tengan el apellido López, como primero o segundo apellido.alter
SELECT *
FROM empleados
WHERE Apellidos LIKE '%López%';

-- 4 nombre del proyecto que tiene asignado el empleado “10480”, siguiendo estos pasos.
-- Son dos sentencias SELECT: Primero averigua el número de de proyecto del empleado “10480” 
-- luego cuando tengas el número de proyecto realizar la consulta sobre la tabla Proyectos.
SELECT Idproyecto
FROM asignacion
WHERE Idempleado = 10480;

SELECT nombre
FROM proyectos
WHERE Idproyecto = (SELECT Idproyecto FROM asignacion WHERE Idempleado = 10480);

-- 6 Sacar un listado de los empleados que sean de Madrid o Córdoba. Realiza el select de dos maneras posibles
-- 6 Forma 1 
SELECT *
FROM empleados
WHERE Municipio LIKE 'Madrid' OR Municipio LIKE 'Córdoba';
-- 6 Forma 2
SELECT*
FROM empleados
WHERE Municipio = 'Madrid'OR Municipio ='Córdoba';

-- 7 Sacar un listado de los empleados que tengan un sueldo entre 1300 y 1550 Euros 
SELECT *
FROM empleados
WHERE Sueldo BETWEEN 1300 AND 1550;

-- 8 Ordena los empleados por fecha de nacimiento descendente y sólo los que hayan nacido después de 1976
SELECT *
FROM empleados
WHERE YEAR(Fecha_nac) > 1976
ORDER BY Fecha_nac DESC;

-- 9 Se ha detectado un error y es necesario sumar 5000 Euros al presupuesto del departamento de Marketing. 
-- Modifícalo sin tener que volver a insertar de nuevo el registro.
UPDATE departamentos
SET presupuestos = presupuestos + 5000
WHERE nombre = 'Marketing' AND IdDpto = 4;

-- 10 Se va a cambiar de proyecto a “Alberto Pérez López”. Modifícalo para que tenga asignado el proyecto “RUNTA”
-- Primero encontramos el ID de Alberto Pérez López
SELECT IdEmpleado
FROM empleados
WHERE Nombre = 'Alberto' AND Apellidos = 'Perez Lopez';
-- Segundo encontramos el ID del proyecto RUNTA
SELECT Idproyecto
FROM proyectos
WHERE nombre = 'RUNTA';
-- Actualizamos la tabla asignación
UPDATE asignacion
SET Idproyecto = (SELECT Idproyecto FROM proyectos WHERE nombre = 'RUNTA')
WHERE Idempleado = (SELECT IdEmpleado FROM empleados WHERE Nombre = 'Alberto' AND Apellidos = 'Perez Lopez');

-- 11 “Antonio García Montero” ya no seguirá en el proyecto que tenía asignado y por lo tanto hay que quitarle esa asignación. 
-- Hazlo en dos pasos al igual que en la consulta 4.
-- Paso 1
SELECT IdEmpleado
FROM empleados
WHERE Nombre = 'Antonio' AND Apellidos = 'Garcia Montero';
-- Paso 2
DELETE FROM asignacion
WHERE Idempleado = (SELECT IdEmpleado FROM empleados WHERE Nombre = 'Antonio' AND Apellidos = 'Garcia Montero');

-- 12 Sacar todos los empleados del departamento de Diseño y que ganen más de 1500 Euros
SELECT empleados.*
FROM empleados
JOIN departamentos ON empleados.IdDpto = departamentos.IdDpto
WHERE departamentos.nombre = 'Diseño' AND empleados.Sueldo > 1500;

-- 13 Incrementar en un 5% el sueldo de los empleados que pertenezcan al departamento de I+D y que ganen menos de 1400 Euros
UPDATE empleados
JOIN departamentos ON empleados.IdDpto = departamentos.IdDpto
SET Sueldo = Sueldo * 1.05
WHERE departamentos.nombre = 'I+D' AND Sueldo < 1400;