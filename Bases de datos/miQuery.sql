
/*
FORMATO DE SELECCIÓN:

SELECT 
	nombre_de_columnas AS alias,
    FUNCIÓN_AGREGACIÓN(columna_que_quieras_agregar) AS alias,
FROM 
	tabla_origen
WHERE 
	condicion
	AND (segunda condición)
GROUP BY 
	nombre_columna_agrupación
HAVING 
	(condición_group_by)
ODER BY 
	nombre_columna TIPO_ORDEN;

Consultar apuntes del 13 de Febrero (BBDD 13-02 Primeras Querys)
para más detalles sobre las consultas.
    
*/



SELECT dni as javier
FROM clientes as cli;

/* Eso es poner un alias, para que en la salida se vea distinto
*/

SELECT distinct(direccion) as casa
FROM clientes as cli;

/*
El DISTINCT lo vamos a usar mucho para sacar elementos
distintos de una base de datos.

Al final el punto es hacer consultar coherentes
*/

use pepe;
SELECT distinct(credito) 
FROM clientes as cli
WHERE (credito >=500) 
and nombre LIKE "%A%"
and nombre (is not "Antonio")
and (fecha_de_alta is not null);


order by credito asc, APELLIDOS desc;

/*el order by, seguido del campo y un asc o desc,
nos ordenará los resultados.*/

/*CAMPOS AGREGADOS Al utilizar el símbolo (*) con el astericos
seguido del campo, nos va a contar el número de nulos*/

