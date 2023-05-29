drop database if exists proyectofinaldaw;
create database proyectofinaldaw;
use proyectofinaldaw;

create table usuario(
	password varchar (30) not null,
	nombre varchar (80) not null,
    email varchar (150) primary key  
);

create table jugador(
	region varchar(30),
    edad numeric(12),
    altura numeric(12),
    genero varchar(30),
    elemento varchar(30),
	vida numeric(12),
    talento varchar(30),
	arma varchar(30)
);
