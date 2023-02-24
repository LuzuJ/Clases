/* Copyright (C) 2K23, pat_mic
------------------------------
Creacion de la tabla Localidad con datos
30.ene.2k23
Version 1.0
*/

DROP TABLE IF EXISTS LOCALIDAD;
CREATE TABLE IF NOT EXISTS LOCALIDAD
(    ID_LOCALIDAD       INTEGER PRIMARY KEY AUTOINCREMENT
    ,ID_LOCALIDAD_PADRE INTEGER NULL
    ,ID_LOCALIDAD_TIPO  INTEGER NULL
    ,NOMBRE             VARCHAR(20) NOT NULL
    ,OBSERVACION        VARCHAR(100)DEFAULT('')
    ,FECHA_CREACION     VARCHAR(20) DEFAULT(datetime('now'))
    ,FECHA_MODIFICA     VARCHAR(20) DEFAULT(datetime('now'))
    ,ESTADO             VARCHAR(1)  DEFAULT('A')
    ,FOREIGN KEY(ID_LOCALIDAD_PADRE)    REFERENCES LOCALIDAD(ID_LOCALIDAD)
    ,FOREIGN KEY(ID_LOCALIDAD_TIPO)     REFERENCES LOCALIDAD(ID_LOCALIDAD)
);
------------------------------------------------------------------------
INSERT INTO LOCALIDAD   (ID_LOCALIDAD_PADRE, ID_LOCALIDAD_TIPO, NOMBRE )
            VALUES      (NULL, NULL, 'PAIS'); 
INSERT INTO LOCALIDAD   (ID_LOCALIDAD_PADRE, ID_LOCALIDAD_TIPO, NOMBRE )
            VALUES      (1, NULL, 'PROVINCIA'); 
INSERT INTO LOCALIDAD   (ID_LOCALIDAD_PADRE, ID_LOCALIDAD_TIPO, NOMBRE )
            VALUES      (2, NULL, 'CANTON'); 
INSERT INTO LOCALIDAD   (ID_LOCALIDAD_PADRE, ID_LOCALIDAD_TIPO, NOMBRE )
            VALUES      (3, NULL, 'PARROQUIA');
------------------------------------------------------------------------
INSERT INTO LOCALIDAD   (ID_LOCALIDAD_PADRE, ID_LOCALIDAD_TIPO, NOMBRE )
            VALUES      (NULL, 1,   'Ecuador');
INSERT INTO LOCALIDAD   (ID_LOCALIDAD_PADRE, ID_LOCALIDAD_TIPO, NOMBRE )
            VALUES      (NULL, 1,   'Colombia');
------------------------------------------------------------------------
INSERT INTO LOCALIDAD   (ID_LOCALIDAD_PADRE, ID_LOCALIDAD_TIPO, NOMBRE )
            VALUES      (5,    2,   'Loja');
INSERT INTO LOCALIDAD   (ID_LOCALIDAD_PADRE, ID_LOCALIDAD_TIPO, NOMBRE )
            VALUES      (5,    2,   'Pichincha');
------------------------------------------------------------------------
INSERT INTO LOCALIDAD   (ID_LOCALIDAD_PADRE, ID_LOCALIDAD_TIPO, NOMBRE )
            VALUES      (7,    2,   'Loja');
INSERT INTO LOCALIDAD   (ID_LOCALIDAD_PADRE, ID_LOCALIDAD_TIPO, NOMBRE )
            VALUES      (8,    2,   'Quito');
------------------------------------------------------------------------
SELECT * FROM LOCALIDAD;
