INSERT IGNORE INTO directores (nombre, apellido, sueldo) VALUES
('Juan', 'Pérez', 5000.00),
('María', 'González', 5500.00),
('Carlos', 'Martínez', 4800.00),
('Ana', 'Lópdirectoresez', 5200.00);

INSERT IGNORE INTO Sucursales (nSucursal, Nombre, Direccion, Director) VALUES
(1, 'Sucursal Central', 'Av. Principal 123', 1),
(2, 'Sucursal Norte', 'Calle Norteña 456', 2),
(3, 'Sucursal Sur', 'Calle Sureña 789', 3),
(4, 'Sucursal Este', 'Calle Oriental 012', 4);

INSERT IGNORE INTO clientes (DNI, Nombre, Apellidos, Direccion, Fecha, Credito, nSucursal) VALUES 
('123456789', 'Pedro', 'Gómez', 'Calle 1', '2023-05-15', 2000.00, 1),
('987654321', 'Laura', 'Fernández', 'Calle 2', '2023-07-20', 1500.00, 2),
('456789123', 'Pablo', 'Sánchez', 'Calle 3', '2023-09-10', 1800.00, 3),
('789123456', 'Sofía', 'Rodríguez', 'Calle 4', '2023-11-25', 2200.00, 4),
('321654987', 'Marta', 'López', 'Calle 5', '2024-01-03', 2500.00, 1);



SELECT * FROM Pepe.clientes;
SELECT * FROM Pepe.directores;
SELECT * FROM Pepe.sucursales;
