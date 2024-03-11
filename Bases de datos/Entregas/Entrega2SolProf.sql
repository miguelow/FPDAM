USE Entrega2;

SELECT * FROM empleados;
SELECT * FROM proyectos;
SELECT * From departamentos;
create view asignados as
SELECT * FROM asignacion;
-- Ejecuto las views
select * from asignados;

/*
2 se necesita una lista de los proyectos (sólo indicando el nombre y la fecha de inicio) que empiezan a partir de Marzo.
En la cabecera de la columna de la fecha debe de poner “Fecha de inicio del proyecto”.
*/

-- 3 Listado de todos los empleados que tengan el apellido López, como primero o segundo apellido.alter

/*
4 nombre del proyecto que tiene asignado el empleado “10480”, siguiendo estos pasos.
Son dos sentencias SELECT: Primero averigua el número de de proyecto del empleado “10480” 
luego cuando tengas el número de proyecto realizar la consulta sobre la tabla Proyectos.
*/


/*
6 Sacar un listado de los empleados que sean de Madrid o Córdoba. Realiza el select de dos maneras posibles
*/

/*
7 Sacar un listado de los empleados que tengan un sueldo entre 1300 y 1550 Euros 
*/

/*
8 Ordena los empleados por fecha de nacimiento descendente y sólo los que hayan nacido después de 1976
*/

/*
9 Se ha detectado un error y es necesario sumar 5000 Euros al presupuesto del departamento de Marketing. 
Modifícalo sin tener que volver a insertar de nuevo el registro.
*/

/*
10 Se va a cambiar de proyecto a “Alberto Pérez López”. Modifícalo para que tenga asignado el proyecto “RUNTA”
Primero encontramos el ID de Alberto Pérez López
*/

/*
11 “Antonio García Montero” ya no seguirá en el proyecto que tenía asignado y por lo tanto hay que quitarle esa asignación. 
Hazlo en dos pasos al igual que en la consulta 4.
*/

/*
12 Sacar todos los empleados del departamento de Diseño y que ganen más de 1500 Euros
*/

/*
13 Incrementar en un 5% el sueldo de los empleados que pertenezcan al departamento de I+D y que ganen menos de 1400 Euros
*/