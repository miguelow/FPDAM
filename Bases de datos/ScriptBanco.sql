create DATABASE IF NOT EXISTS BANCO;
USE BANCO;
CREATE TABLE `clientes` (
  `DNI` char(9) NOT NULL,
  `NOMBRE` varchar(15) NOT NULL,
  `APELLIDOS` varchar(15) NOT NULL,
  `DIRECCION` varchar(50) DEFAULT ' ',
  `FECHA_DE_ALTA` date DEFAULT NULL,
  `CREDITO` int(11) DEFAULT NULL,
  `NSUCURSAL` int(11) DEFAULT NULL
);

INSERT INTO `clientes` (`DNI`, `NOMBRE`, `APELLIDOS`, `DIRECCION`, `FECHA_DE_ALTA`, `CREDITO`, `NSUCURSAL`) VALUES
('30515454K', 'Ana', 'Martín Martín', 'Calle del Socorro, 1', '2008-01-18', 1500, 1001),
('33358796A', 'Marta', 'López Ruiz', 'Calle Martinez, 76', '2014-09-17', 600, 1001),
('78458784B', 'Antonio', 'Castillo Mentas', 'Calle Soles, 14', NULL, 500, 1002);

CREATE TABLE `directores` (
  `ID` int(11) NOT NULL,
  `NOMBRE` varchar(15) DEFAULT NULL,
  `APELLIDOS` varchar(15) DEFAULT NULL,
  `SUELDO` float DEFAULT NULL
);


INSERT INTO `directores` (`ID`, `NOMBRE`, `APELLIDOS`, `SUELDO`) VALUES
(12, 'Alberto', 'Pérez Martín', 1800),
(13, 'Pedro', 'García Martín', 1900),
(15, 'Antonio', 'López López', 1500),
(20, 'Silvia', 'Martín Martín', 1300);


CREATE TABLE `sucursales` (
  `NSUCURSAL` int(11) NOT NULL,
  `NOMBRE` varchar(50) DEFAULT NULL,
  `DIRECCION` varchar(50) DEFAULT NULL,
  `DIRECTOR` int(11) DEFAULT NULL
) ;



INSERT INTO `sucursales` (`NSUCURSAL`, `NOMBRE`, `DIRECCION`, `DIRECTOR`) VALUES
(1001, 'Sucursal Centro', 'Avd. del Estilo, 45', 12),
(1002, 'Sucursal Oeste', 'Avd. Mediterráneo, 14', 15),
(1003, 'Sucursal Este', 'Calle Martínez, 45', 20),
(1004, 'Sucursal Norte', 'Calle Especias, 23', NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`DNI`),
  ADD KEY `DNI` (`DNI`),
  ADD KEY `NSUCURSAL` (`NSUCURSAL`);

--
-- Indices de la tabla `directores`
--
ALTER TABLE `directores`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `sucursales`
--
ALTER TABLE `sucursales`
  ADD PRIMARY KEY (`NSUCURSAL`),
  ADD KEY `DIRECTOR` (`DIRECTOR`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD CONSTRAINT `clientes_ibfk_1` FOREIGN KEY (`NSUCURSAL`) REFERENCES `sucursales` (`NSUCURSAL`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `sucursales`
--
ALTER TABLE `sucursales`
  ADD CONSTRAINT `sucursales_ibfk_1` FOREIGN KEY (`DIRECTOR`) REFERENCES `directores` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

