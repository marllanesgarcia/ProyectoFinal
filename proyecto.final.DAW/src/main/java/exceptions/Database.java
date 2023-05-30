package exceptions;

public class Database {

	/*
	 * 
	 * 
	 *-- drop database if exists proyectofinaldaw;
-- create database proyectofinaldaw;
use proyectofinaldaw;

create table usuario(
password varchar (30) not null,
usuario varchar (80) not null,
email varchar (150) primary key  
);

create table jugador(
    region varchar(30),
    edad numeric(12),
    altura DECIMAL(3,2),
    genero varchar(30),
    elemento varchar(30),
	vida numeric(12),
    talento varchar(30),
	arma varchar(30)
);

drop table jugador;
-- Tabla Arma
	CREATE TABLE Arma (
    nombre varchar(30),
    fuerza INT,
    peso TINYINT
);

-- Tabla Talento
CREATE TABLE Talento (
    habilidadEspecial VARCHAR(255),
    duracion TINYINT
);
drop table talento;
-- Tabla Respuesta
CREATE TABLE Respuesta (
    id INT PRIMARY KEY,
    descripcion VARCHAR(255),
    esCorrecta BOOLEAN,
    pregunta_id INT
);

-- Tabla Pregunta
CREATE TABLE Pregunta (
    id INT PRIMARY KEY,
    descripcion VARCHAR(255)
);

-- Tabla Historia
	CREATE TABLE Historia (
    id INT PRIMARY KEY,
    descripcion VARCHAR(255),
    titulo VARCHAR(255)
);


-- Armas
INSERT INTO Arma (nombre, fuerza, peso)
VALUES
  ('espada corta', 100, 20),
  ('chancla', 10, 1),
  ('bazooka', 800, 7),
  ('escupitajo', 50, 0);

-- Talento
INSERT INTO Talento (habilidadEspecial, duracion)
VALUES
('Cubierta Proyectora',10),
('Llamas Fervientes',12),
('Aguas Medicinales',15),
('Vientos impetuosos',5);

-- Jugador
INSERT INTO Jugador (region)
VALUES
('Asia'), ('Asia'),('África'),
('América del Norte'),('América del Sur'),
('Antártida'),('Europa'),('Oceanía');

INSERT INTO Jugador (genero)
VALUES
('Lumine'),('Aether');

INSERT INTO Jugador (elemento)
VALUES 
('AIRE'),('HIELO'),('ELECTRO'),
 ('AGUA'),('PLANTA'),('ROCA');
 
 
 -- ACTUALIZACION 30/05
 
 
 CREATE TABLE Enemigo(
 nombre varchar(20),
 vida numeric(12), 
 elemento varchar(30),
 fuerza byte
 );
 
 -Insertar
 
INSERT INTO Enemigo (nombre, vida, elemento, fuerza)
VALUES ('Lawachurl Electroyelmo', 120, 'ELECTRO', 50);
INSERT INTO Enemigo (nombre, vida, elemento, fuerza)
VALUES ('Sabueso Acechador', 80, 'ROCA', 20);
INSERT INTO Enemigo (nombre, vida, elemento, fuerza)
VALUES ('Maga de Cicin', 30, 'HIELO', 15);
INSERT INTO Enemigo (nombre, vida, elemento, fuerza)
VALUES ('Samurai Kairagi', 90, 'AGUA', 30);
INSERT INTO Enemigo (nombre, vida, elemento, fuerza)
VALUES ('Megaflora', 35, 'PLANTA', 25);
INSERT INTO Enemigo (nombre, vida, elemento, fuerza)
VALUES ('Slime', 10, 'AIRE', 5);
 
	 * 
	 * 
	 */
	
}
