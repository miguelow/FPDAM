USE Entrega2;

SELECT * FROM empleados;
SELECT * FROM proyectos;
SELECT * From departamentos;
create view asignados as
SELECT * FROM asignacion;
-- Ejecuto las views
select * from asignados;
/*
Las views las usamos cuando hacemos unicamente consultar de datos, no modificaciones ni borrado
Cuando borramos o editamos datos hacemos uso de las transactions
poniendo al final de esta, commit si queremos que se ejecute o rollback si queremos ejecutar los comandos
pero sin que se ejecuten las instrucciones como tal
*/

/*
2 se necesita una lista de los proyectos (sólo indicando el nombre y la fecha de inicio) que empiezan a partir de Marzo.
En la cabecera de la columna de la fecha debe de poner “Fecha de inicio del proyecto”.
*/

create view proyectos_marzo as
select nombre as Nombre_proyecto, fecha_ini as Fecha_inicio_de_proyecto
from proyectos
where month(fecha_ini) >= 3
order by 1; -- Nos lo ordenaría por nombre en este caso
select * from proyectos_marzo;

/*
3 Listado de todos los empleados que tengan el apellido López, como primero o segundo apellido.alter
*/

create view empleados_lopez as 
select Nombre, Apellidos
from empleados
where Nombre or Apellidos like ('%López%');
select * from empleados_lopez;

/*
4 nombre del proyecto que tiene asignado el empleado “10480”, siguiendo estos pasos.
Son dos sentencias SELECT: Primero averigua el número de de proyecto del empleado “10480” 
luego cuando tengas el número de proyecto realizar la consulta sobre la tabla Proyectos.
*/

create view id_empleado as
select pro.idproyecto, asig.idempleado, pro.nombre
from asignacion as asig, proyectos as pro
where asig.idproyecto=pro.idproyecto
and asig.idempleado = 10480;
select * from id_empleado;

/*
6 Sacar un listado de los empleados que sean de Madrid o Córdoba. Realiza el select de dos maneras posibles
*/

create view madrid_cordoba as
-- forma 1 y menos rápida
select idempleado, nombre, apellidos, municipio
from empleados
where municipio like ('Madrid') || municipio like ('Córdoba');

-- forma 2 y con mejor eficiencia 
select *
from empleados
where municipio in ('Madrid', 'Córdoba');
select * from madrid_cordoba;

/*
7 Sacar un listado de los empleados que tengan un sueldo entre 1300 y 1550 Euros 
*/

create view sueldo_tramos as
select *
from empleados
where sueldo between 1300 and 1550;

select * from sueldo_tramos;

/*
8 Ordena los empleados por fecha de nacimiento descendente y sólo los que hayan nacido después de 1976
*/

create view mas1976 as 
select *
from empleados
where year(fecha_nac)>1976
order by fecha_nac desc;

select * from mas1976;

/*
9 Se ha detectado un error y es necesario sumar 5000 Euros al presupuesto del departamento de Marketing. 
Modifícalo sin tener que volver a insertar de nuevo el registro.
*/

SET SQL_SAFE_UPDATES = 0;
start transaction;
-- select @@autocommit; -- Si está a 1 es un problema
-- set autocommit=off; -- Este comando lo pone a 0
update departamentos
set presupuestos = presupuestos + 500
where nombre = 'Marketing';
-- commit; -- commit permite que se termine de ejecutar la ransacción
rollback; 

-- Verificamos 
select iddpto, nombre, presupuestos
from departamentos
where nombre like ('Marketing');

/*
10 Se va a cambiar de proyecto a “Alberto Pérez López”. Modifícalo para que tenga asignado el proyecto “RUNTA”
Primero encontramos el ID de Alberto Pérez López
*/

start transaction;
update asignacion
-- Anidar subconsulta en el SET
set idproyecto = 
	(select idproyecto
    from proyectos
    where nombre like 'Runta')
where idempleado in
-- Anidar subconsulta en pertenencia IN
	(select idempleado
    from empleados
    where nombre like 'Alberto'
    and apellidos like 'Pérez López');
commit;

-- Verifico
				

/*
11 “Antonio García Montero” ya no seguirá en el proyecto que tenía asignado y por lo tanto hay que quitarle esa asignación. 
Hazlo en dos pasos al igual que en la consulta 4.
*/

start transaction;
DELETE FROM asignacion
WHERE idempleado LIKE (SELECT idempleado FROM empleados WHERE nombre LIKE "Antonio" AND apellidos LIKE "García Montero");
 
 SELECT * FROM asignacion;
 commit;

/*
12 Sacar todos los empleados del departamento de Diseño y que ganen más de 1500 Euros
*/

select * from empleados
where iddpto in (
	select iddpto
    from departamentos
    where nombre like 'Diseño'
    )
and (sueldo > 1500);

/*
13 Incrementar en un 5% el sueldo de los empleados que pertenezcan al departamento de I+D y que ganen menos de 1400 Euros
*/

-- Vemos de donde partimos
select emp.nombre, emp.apellidos, dep.nombre, emp.sueldo
from empleados as emp, departamentos as dep
where emp.idempleado = dep.iddpto
and dep.nombre like 'I+D';

start transaction;
update empleados
set sueldo = sueldo * 1.05
where iddpto in (
	select iddpto
    from departamentos
    where nombre like 'I+D'
    )
and (sueldo < 1400);
commit;


