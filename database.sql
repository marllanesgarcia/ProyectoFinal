drop database if exists proyectofinaldaw;
create database proyectofinaldaw;
use proyectofinaldaw;

create table usuario(
	password varchar (30) not null,
	nombre varchar (80) not null,
    email varchar (150) primary key  
);


