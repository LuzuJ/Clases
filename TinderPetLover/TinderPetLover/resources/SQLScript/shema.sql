/**
*   pat_mic : 20.ene.2k23
*   script de base de datos
 crear la estructura de la base de datos
 - tablas
 - vistas
 - procedures
 - function
 - ...

CRUD
CREATE  --> Insert
READ    --> leer
UPDATE  --> actu+alziar
DELETE  --> borrar
*/

-- revisar el entorno de trabajo
.version
.database
.show

.tables

DROP TABLE PERSONA;
DROP TABLE MascotaTipo;

CREATE TABLE MascotaTipo
(
    IdMascotaTipo   INTEGER PRIMARY KEY AUTOINCREMENT,
    Nombre          VARCHAR(10) NOT NULL,
    Estado          VARCHAR(1) NOT NULL DEFAULT('A')
);

CREATE TABLE Sexo 
(
    IdSexo INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT
    ,Nombre         VARCHAR (100)
    ,Estado         VARCHAR(1) NOT NULL DEFAULT('A')
);

-- JOSUE PERALTA LLENE TABLA SEXO
INSERT INTO Sexo (NOMBRE) VALUES ("HEMBRA");
INSERT INTO Sexo (NOMBRE) VALUES ("MACHO");
INSERT INTO Sexo (NOMBRE) VALUES ("SIN SEXO");
select * from sexo;
--Jonathan Luzuriaga :v y los copiones 
DROP TABLE Mascota;
PRAGMA foreign_keys = ON;
CREATE TABLE Mascota
(
     IdMascota      INTEGER PRIMARY KEY AUTOINCREMENT
    ,IdMascotaTipo  INTEGER NOT NULL
    ,IdSexo         INTEGER NOT NULL
    ,Nombre          VARCHAR (100) NOT NULL
    ,Edad            INTEGER NOT NULL
    ,Estado          VARCHAR(1) NOT NULL DEFAULT('A')
    -- -- Claves foreanas
    -- ,CONSTRAINT fk_IdMascotaTipo
    --  FOREIGN KEY (IdMascotaTipo) REFERENCES MascotaTipo(IdMascotaTipo)
    --  ON UPDATE RESTRICT
    ,CONSTRAINT fk_IdSexo
     FOREIGN KEY (IdSexo)        REFERENCES Sexo(IdSexo)
    --  ON UPDATE  
    --  ON DELETE
);


--Gabriel Jaya (Marca Registrada)
INSERT INTO Mascota(IdMascotaTipo, IdSexo, Nombre, Edad)        VALUES (1,2,"Luzu",4);
INSERT INTO Mascota(IdMascotaTipo, IdSexo, Nombre, Edad)        VALUES (2,1,"Eva",2);
INSERT INTO Mascota(IdMascotaTipo, IdSexo, Nombre, Edad)        VALUES (2,122,"Pepe",3);
INSERT INTO Mascota(IdMascotaTipo, IdSexo, Nombre, Edad, Estado)    VALUES (2,2,"Dani",3,'X');
select * from Mascota;
select * from Sexo;
-- Sebastian Guerra (No copiar // Derechos Registrados // Cualquier intento de copia sera denunciado ante la ley)

INSERT INTO Mascota (IdMascotaTipo, IdSexo, Nombre, Edad, Estado) VALUES  (1, 1, "Pepe", 3, 'A');
INSERT INTO Mascota ( IdMascotaTipo, IdSexo, Nombre, Edad, Estado) VALUES ( 1, 2, "Poliperro", 2, 'A');
INSERT INTO Mascota ( IdMascotaTipo, IdSexo, Nombre, Edad, Estado) VALUES ( 1, 3, "Poliperro2", 6, 'B');

-- Estefano Proaño

INSERT INTO Mascota (IdMascotaTipo, IdSexo, Nombre, Edad) VALUES (1,1,"Nala", 2);
INSERT INTO Mascota (IdMascotaTipo, IdSexo, Nombre, Edad) VALUES (2,2,"Coco", 2);
INSERT INTO Mascota (IdMascotaTipo, IdSexo, Nombre, Edad) VALUES (3,2,"Simba", 2);

-- Luis Rocha (No copiar // Derechos Registrados // Cualquier intento de copia sera denunciado ante la ley)
INSERT INTO Mascota(IdMascotaTipo, IdSexo, Nombre, Edad, Estado      ) VALUES (3,1, "Davicho", 19);
INSERT INTO Mascota(IdMascotaTipo, IdSexo, Nombre, Edad, Estado      ) VALUES (1,3, "Luchito", 21);
INSERT INTO Mascota(IdMascotaTipo, IdSexo, Nombre, Edad, Estado      ) VALUES (12,1, "Pepito", 9);

-- David Quille
INSERT INTO Mascota(IdMascotaTipo, IdSexo, Nombre, Edad, Estado      ) VALUES (3,1, "juancho", 9);
INSERT INTO Mascota(IdMascotaTipo, IdSexo, Nombre, Edad, Estado      ) VALUES (5,3, "lupita", 2);
INSERT INTO Mascota(IdMascotaTipo, IdSexo, Nombre, Edad, Estado      ) VALUES (1,1, "toño", 9);

-- Emilio Armas
INSERT INTO Mascota(IdMascotaTipo, IdSexo, Nombre, Edad, Estado      ) VALUES (1,1, "Raya", 4);
INSERT INTO Mascota(IdMascotaTipo, IdSexo, Nombre, Edad, Estado      ) VALUES (3,1, "Dory", 1);
INSERT INTO Mascota(IdMascotaTipo, IdSexo, Nombre, Edad, Estado      ) VALUES (5,2, "Rocky",8);

-- Anthony Morales 
INSERT INTO MASCOTA (IdMascotaTipo, IdSexo, Nombre, Edad, Estado     ) VALUES (1,2, "MalumaBaby", 6)
INSERT INTO MASCOTA (IdMascotaTipo, IdSexo, Nombre, Edad, Estado     ) VALUES (2,1, "Anuel", 3)
INSERT INTO MASCOTA (IdMascotaTipo, IdSexo, Nombre, Edad, Estado     ) VALUES (5,2, "Mufasa", 9)

-- Damaris Suquillo
INSERT INTO Mascota (IdMascotaTipo, IdSexo, Nombre, Edad, Estado    ) VALUES  (9, 1, "Lucy", 3);
INSERT INTO Mascota ( IdMascotaTipo, IdSexo, Nombre, Edad, Estado   ) VALUES  (10, 2, "Lupe", 2);
INSERT INTO Mascota ( IdMascotaTipo, IdSexo, Nombre, Edad, Estado   ) VALUES  (11, 3, "Chico", 6, 'X');

-- ANAEL MOLINA
INSERT INTO Mascota (IdMascotaTipo, IdSexo,Nombre, Edad, Estado) VALUES(40,1, "Bruno",2,'X');
INSERT INTO Mascota (IdMascotaTipo, IdSexo,Nombre, Edad, Estado) VALUES(45,2, "Akira",1);
INSERT INTO Mascota (IdMascotaTipo, IdSexo,Nombre, Edad, Estado) VALUES(45,2, "Qucky",7);
-- Josue Peralta
--Gabriel Jaya (Marca Registrada)
INSERT INTO Mascota(IdMascotaTipo, IdSexo, Nombre, Edad)            VALUES (1,2,"ROCKY",4);
INSERT INTO Mascota(IdMascotaTipo, IdSexo, Nombre, Edad)            VALUES (2,2,"DAMARIS",2);
INSERT INTO Mascota(IdMascotaTipo, IdSexo, Nombre, Edad, Estado)    VALUES (2,A",3,');
--Mercedes Martinez 

INSERT INTO Mascota(IdMascotaTipo, IdSexo, Nombre, Edad, Estado      ) VALUES (12,1, "Oso", 4,'B');
INSERT INTO Mascota(IdMascotaTipo, IdSexo, Nombre, Edad, Estado      ) VALUES (14,1, "Pepe", 5,'A');
INSERT INTO Mascota(IdMascotaTipo, IdSexo, Nombre, Edad, Estado      ) VALUES (15,1, "Nino", 6, 'A');

-- Alejo Aleman "Sex Enjoyer"

INSERT INTO Mascota (IdMascotaTipo, IdSexo, Nombre, Edad) VALUES (1,1,"ElPepe", 2);
INSERT INTO Mascota (IdMascotaTipo, IdSexo, Nombre, Edad) VALUES (2,2,"C", 2);
INSERT INTO Mascota (IdMascotaTipo, IdSexo, Nombre, Edad) VALUES (3,2,"Simba", 2);

INSERT INTO MascotaTipo ( Nombre, Estado)  VALUES ( "Perros", "A");  
INSERT INTO MascotaTipo ( Nombre)          VALUES ( "Gatos");
INSERT INTO MascotaTipo ( Nombre)          VALUES ( "Peces");
INSERT INTO MascotaTipo ( Nombre)          VALUES ( "Cuyes");
INSERT INTO MascotaTipo ( Nombre)          VALUES ( "Leona");
--DELETE FROM MascotaTipo WHERE IdMascotaTipo > 9;
SELECT * from MascotaTipo;

UPDATE MascotaTipo SET Estado = "X" 
WHERE IdMascotaTipo in (6,12);

SELECT * from MascotaTipo 
WHERE Nombre like '%e%';


-- DROP TABLE T1;
-- DROP TABLE T2;

INSERT INTO PERSONA (ID,    NOMBRE,     APELLIDO)   VALUES  (1, "Pepe ",  "perez");
INSERT INTO PERSONA (ID,    NOMBRE,     APELLIDO)   VALUES  (2, "Ana",  "Suarez");
INSERT INTO PERSONA (ID,    NOMBRE,     APELLIDO)   VALUES  (3, "Juan",  "Sanchez");
INSERT INTO PERSONA (ID,    NOMBRE,     APELLIDO)   VALUES  (4, "Lucas Juan",  "Montalvo");

SELECT ID,    NOMBRE,     APELLIDO FROM PERSONA;

SELECT ID,    NOMBRE,     APELLIDO 
FROM PERSONA
WHERE ID = 2;

SELECT ID,    NOMBRE,     APELLIDO 
FROM PERSONA
WHERE NOMBRE LIKE '%JUAN%';

----------------------------------------------
CREATE TABLE PET
(
    ID          INTEGER PRIMARY KEY,
    NOMBRE      VARCHAR(10),
    EDAD        INTEGER 
);
--DROP TABLE PET;
INSERT INTO PET (ID,    NOMBRE,     EDAD)   VALUES  (1, "VALUMA", 1);
INSERT INTO PET (ID,    NOMBRE,     EDAD)   VALUES  (2, "JUANA",  2);
INSERT INTO PET (ID,    NOMBRE,     EDAD)   VALUES  (3, "COMOTU", 3);
SELECT * FROM PET;
------------------------------------------------