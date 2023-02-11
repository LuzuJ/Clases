--
-- pat_mic : 20.ene.2k23
-- script de base de datos
--
.tables

-- if exist Drop TABLE Sexo;

CREATE TABLE Sexo 
(
    IdSexo INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT
    ,Nombre         VARCHAR (100)
    ,Estado         VARCHAR(1) NOT NULL DEFAULT('A')
);

SELECT  IdSexo,	Nombre,	Estado 
FROM    Sexo
WHERE   Estado ='A' ;

-- JOSUE PERALTA LLENE TABLA SEXO
INSERT INTO Sexo (NOMBRE) VALUES ("HEMBRA");
INSERT INTO Sexo (NOMBRE) VALUES ("MACHO");
INSERT INTO Sexo (NOMBRE) VALUES ("SIN SEXO");
select * from sexo;