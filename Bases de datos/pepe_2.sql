create database if not exists pepe;
use pepe;

/*
En el archivo anterior veíamos los problemas de crear las claves dnetro del mismo
CREATE TABLE. Para empezar, te obliga a seguir un orden, y en segundo lugar falla el diccionario.

Existe un comando para desactivar todas las clvaves ajenas y quitar las restricciones,
aunque para hacer eso se romperá la integridad de los datos y corromperá las tablas.
SET FOREIGN_KEY_CHECKS = 0; Y mandamos a la mierda la integridad de todo. 

Alternativamente esto lo haremos con el ALTER TABLE poniendo en enable un uneable cada clave ajena de forma individual.
*/
CREATE TABLE if not exists directores (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    apellido VARCHAR(50)
);

CREATE TABLE if not exists Sucursales (
    nSucursal INT PRIMARY KEY,
    Nombre VARCHAR(100),
    Direccion VARCHAR(255),
    Director INT,
    -- Esto es lo que hará que el diccionario se lo trague, el constaint. FORMA RECOMENDADA!!!!!!
    constraint Sucursales_Director_FK1 FOREIGN KEY (Director) REFERENCES directores(id)
);

CREATE TABLE if not exists clientes (
    DNI CHAR(9) PRIMARY KEY,
    Nombre VARCHAR(50) NOT NULL,
    Apellidos VARCHAR(100) NOT NULL,
    Direccion VARCHAR(255) DEFAULT "",
    Fecha DATE DEFAULT NULL,
    Credito DECIMAL(10,2) DEFAULT NULL,
    nSucursal INT DEFAULT NULL,
    constraint Clientes_Sucursales_fk1 foreign key(nSucursal) references Sucursales(nSucursal) ON DELETE cascade  ON UPDATE cascade-- FORMA NO RECOMENDADA 
); 

/*
CLÁUSULAS DE CONSISTENCIA. Esto se refiere a la propagación ON DELETE o ON UPDATE. Estas son las opciones:
-ON DELETE CASCADE - > fumigas por delante
-ON DELETE SET NULL - > se ponen valores nulos.
-ON DELETE SET DEFAULT -> Restaura a un valor por defecto, -1 para que se sepa que viene de un cascade
-ON DELERETE.... no hacer nada? -> Si no pones nada, es lo qu hará.
*/