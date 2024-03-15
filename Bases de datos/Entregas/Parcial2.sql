CREATE DATABASE IF NOT EXISTS Parcial2;
USE Parcial2;
SET foreign_key_checks = 0;
CREATE TABLE centros (
    NumCentro INT NOT NULL,
    NombreCentro VARCHAR(255),
    DirCentro VARCHAR(255)
);

CREATE TABLE departamentos (
    NumDep INT NOT NULL,
    DirDep INT,
    TipoDirDep CHAR(1),
    Presu FLOAT,
    NombreDep VARCHAR(255),
    DependenciaDep INT
);

CREATE TABLE empleados (
    NumEmpl INT NOT NULL,
    ExtenTel INT,
    FechaNac DATE,
    FechInc DATE,
    SalarioEmp FLOAT,
    ComisionEmp FLOAT,
    NumHijosEmp INT,
    NombreEmp VARCHAR(255)
);

-- Alteramos las tablas añadiendo las PK y FK 
ALTER TABLE centros
	ADD PRIMARY KEY (NumCentro);
ALTER TABLE departamentos
	ADD PRIMARY KEY (NumDep);
ALTER TABLE empleados
	ADD PRIMARY KEY (NumEmpl);
    
ALTER TABLE departamentos
	ADD CONSTRAINT NumCentro_fk  FOREIGN KEY (NumCentro) 
    REFERENCES centros(NumCentro) 
    ON DELETE NO ACTION
    ON UPDATE CASCADE,
    ADD CONSTRAINT DependenciaDep_fk  FOREIGN KEY (DependenciaDep) 
    REFERENCES departamentos(DependenciaDep) 
    ON DELETE NO ACTION
    ON UPDATE CASCADE;
    
ALTER TABLE empleados
	ADD CONSTRAINT NumDep_fk  FOREIGN KEY (NumDep) 
    REFERENCES departamentos(NumDep) 
    ON DELETE NO ACTION
    ON UPDATE CASCADE;
    
INSERT INTO departamentos (NumDep, DirDep, TipoDirDep, Presu, NombreDep, DependenciaDep)
VALUES(100, 10, 'P', 260, 'DIRECCIÓN GENERAL', NULL),
    (110, 20, 'P', 180, 'DIRECC.COMERCIAL', 100),
    (111, 20, 'F', 180, 'SECTOR INDUSTRIAL', 110),
    (112, 20, 'P', 270, 'SECTOR SERVICIOS', 110),
    (120, 10, 'F', 150, 'ORGANIZACIÓN', 100),
    (121, 10, 'P', 150, 'PERSONAL', 120),
    (122, 10, 'P', 350, 'PROCESO DE DATOS', 120),
    (130, 10, 'P', 310, 'FINANZAS', 100);

        
INSERT INTO centros (NumCentro, NombreCentro, DirCentro)
	VALUES(10, "SEDE CENTRAL", "C/ ATOCHA, 820, MADRID"),
        (20, "RELACIÓN CON CLIENTES", "C/ ATOCHA, 405, MADRID");
        
INSERT INTO empleados (NumEmpl, ExtenTel, FechaNac, FechInc, SalarioEmp, ComisionEmp, NumHijosEmp, NombreEmp, NumDep)
VALUES
    (110, 350, '1970-11-10', '1985-02-15', 1800, NULL, 3, 'CESAR', 121),
    (120, 840, '1968-06-09', '1988-10-01', 1900, 110, 1, 'MARIO', 112),
    (130, 810, '1965-09-09', '1981-02-01', 1500, 110, 2, 'LUCIANO', 112),
    (150, 340, '1972-08-10', '1997-01-15', 2600, NULL, 0, 'JULIO', 121),
    (160, 740, '1980-07-09', '2005-11-11', 1800, 110, 2, 'AUREO', 111),
    (180, 508, '1974-10-18', '1996-03-18', 2800, 50, 2, 'MARCOS', 110),
    (190, 350, '1972-05-12', '1992-02-11', 1750, NULL, 4, 'JULIANA', 121),
    (210, 200, '1970-09-28', '1999-01-22', 1910, NULL, 2, 'PILAR', 100),
    (240, 760, '1967-02-26', '1989-02-24', 1700, 100, 3, 'LAVINIA', 111),
    (250, 250, '1976-10-27', '1997-03-01', 2700, NULL, 0, 'ADRIANA', 100),
    (260, 220, '1973-12-03', '2001-07-12', 720, NULL, 6, 'ANTONIO', 100),
    (270, 800, '1975-05-21', '2003-09-10', 1910, 80, 3, 'OCTAVIO', 112),
    (280, 410, '1978-01-10', '2010-10-08', 1500, NULL, 5, 'DOROTEA', 130),
    (285, 620, '1979-10-25', '2011-02-15', 1910, NULL, 0, 'OTILIA', 122),
    (290, 910, '1967-11-30', '1988-02-14', 1790, NULL, 3, 'GLORIA', 120),
    (310, 480, '1976-11-21', '2001-01-15', 1950, NULL, 0, 'AUGUSTO', 130),
    (320, 620, '1977-12-25', '2003-02-05', 2400, NULL, 2, 'CORNELIO', 122),
    (330, 850, '1958-08-19', '1980-03-01', 1700, 90, 0, 'AMELIA', 112),
    (350, 610, '1979-04-13', '1999-09-10', 2700, NULL, 1, 'AURELIO', 122),
    (360, 750, '1978-10-29', '1998-10-10', 1800, 100, 2, 'DORINDA', 111),
    (370, 360, '1977-06-22', '2000-01-20', 1860, NULL, 1, 'FABIOLA', 121),
    (380, 880, '1978-03-30', '1999-01-01', 1100, NULL, 0, 'MICAELA', 112),
    (390, 500, '1976-02-19', '2010-10-08', 1290, NULL, 1, 'CARMEN', 110),
    (400, 780, '1979-08-18', '2011-11-01', 1150, NULL, 0, 'LUCRECIA', 111),
    (410, 660, '1968-07-14', '1989-10-13', 1010, NULL, 0, 'AZUCENA', 122),
    (420, 450, '1966-10-22', '1988-11-19', 2400, NULL, 0, 'CLAUDIA', 130),
    (430, 650, '1967-10-26', '1988-11-19', 1260, NULL, 1, 'VALERIANA', 122),
    (440, 760, '1966-09-26', '1986-02-28', 1260, 100, 0, 'LIVIA', 111),
    (450, 880, '1966-10-21', '1986-02-28', 1260, 100, 0, 'SABINA', 112),
    (480, 760, '1965-04-04', '1986-02-28', 1260, 100, 1, 'DIANA', 111),
    (490, 880, '1964-06-06', '1988-01-01', 1090, 100, 0, 'HORACIO', 112),
    (500, 750, '1965-10-08', '1987-01-01', 1200, 100, 0, 'HONORIA', 111),
    (510, 550, '1966-05-04', '1986-11-01', 1200, NULL, 1, 'ROMULO', 110),
    (550, 780, '1970-01-10', '1998-01-21', 600, 120, 0, 'SANCHO', 111);
    
-- 1
CREATE VIEW vista_departamentos_salario AS
SELECT 
    (SELECT NombreCentro FROM centros WHERE centros.NumCentro = departamentos.NumCentro) AS Nombre_Centro,
    (SELECT MAX(SalarioEmp) FROM empleados WHERE empleados.NumDep = departamentos.NumDep) AS Max_Salario
FROM departamentos
WHERE departamentos.Presu < 35000
  AND (SELECT MAX(SalarioEmp) FROM empleados WHERE empleados.NumDep = departamentos.NumDep) > 1500;

SELECT * FROM vista_departamentos_salario;
-- 2
SELECT 
    (SELECT departamentos.NombreDep FROM departamentos WHERE departamentos.NumDep = departamentos.DependenciaDep) AS Nombre_Departamento_Dependiente,
    departamentos.NombreDep AS Nombre_Departamento,
    departamentos.Presu AS Presupuesto
FROM 
    departamentos
WHERE 
    departamentos.DependenciaDep IN (
        SELECT NumDep FROM departamentos WHERE Presu < 30000
    )
ORDER BY 
    departamentos.NombreDep;
-- 3
SELECT 
    Nombre_Departamento,
    Salario_Medio_Departamento
FROM (
    SELECT 
        departamentos.NombreDep AS Nombre_Departamento,
        (SELECT AVG(SalarioEmp) FROM empleados WHERE empleados.NumDep = departamentos.NumDep) AS Salario_Medio_Departamento,
        (SELECT AVG(SalarioEmp) FROM empleados) AS Salario_Medio_Empresa
    FROM 
        departamentos
) AS Departamentos_Salarios
WHERE 
    Salario_Medio_Departamento > Salario_Medio_Empresa;
-- 4

-- 6
SELECT 
    NombreEmp,
    NumHijosEmp
FROM 
    empleados
WHERE 
    NumDep = 100
ORDER BY 
    NombreEmp ASC;
-- 7

-- 9
SELECT 
    NumDep,
    NombreDep
FROM 
    departamentos 
WHERE 
    NOT EXISTS (
        SELECT 
            1 
        FROM 
            empleados e 
        WHERE 
            e.NumDep = d.NumDep
    );





    

 
