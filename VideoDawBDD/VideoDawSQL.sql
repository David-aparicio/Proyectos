DROP DATABASE IF EXISTS VideoDaw;
create database VideoDaw;
use VideoDaw;

create table Videodaw (
	cif varchar(9),
    fechaRegistro timestamp,
    nombre varchar(100)
);
create table Cliente (
	Id INT PRIMARY KEY AUTO_INCREMENT,
	dni varchar(40)not null unique,
	nombre varchar(100) not null,
	direccion text,
	fechaNacimiento date,
	fechadeCreacionUsuario timestamp
);
CREATE TABLE GeneroPelicula (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL UNIQUE
);

create table Pelicula (
	Id INT PRIMARY KEY AUTO_INCREMENT,
	codigo varchar(40) not null unique,
	titulo varchar(100) not null,
	genero_id INT,
    fechaRegistro timestamp,
    fechaAlquilda timestamp,
    isAlquilada bool,
	FOREIGN KEY (genero_id) REFERENCES GeneroPelicula(Id)
);

CREATE TABLE GeneroVideojuego (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE Videojuego (
	Id int primary key auto_increment,
    codigo varchar(40) not null unique,
	titulo varchar(100) not null,
	genero_id INT,
    fechaRegistro timestamp,
    fechaAlquilada timestamp,
    isAlquida bool,    
	FOREIGN KEY (genero_id) REFERENCES GeneroVideojuego(Id)
);

INSERT INTO Cliente (dni, nombre, direccion, fechaNacimiento, fechadeCreacionUsuario) VALUES
('12345678A', 'Juan Pérez', 'Calle Falsa 123, Madrid', '1990-04-15', NOW()),
('87654321B', 'Laura Gómez', 'Avenida Siempre Viva 742, Barcelona', '1985-08-22', NOW()),
('45678912C', 'Carlos Ruiz', 'Calle Luna 5, Valencia', '1992-12-03', NOW());

INSERT INTO GeneroPelicula (nombre) VALUES
('Acción'),
('Comedia'),
('Drama'),
('Ciencia Ficción');

INSERT INTO Pelicula (codigo, titulo, genero_id, fechaRegistro, fechaAlquilda, isAlquilada) VALUES
('PEL-001', 'La jungla de cristal', 1, NOW(), NULL, FALSE),
('PEL-002', 'Algo pasa con Mery', 2, NOW(), NULL, FALSE),
('PEL-003', 'El drama de Ana', 3, NOW(), NULL, FALSE),
('PEL-004', 'Interestelar', 4, NOW(), NULL, FALSE);

INSERT INTO GeneroVideojuego (nombre) VALUES
('Aventura'),
('Shooter'),
('RPG'),
('Deportes');

INSERT INTO Videojuego (codigo, titulo, genero_id, fechaRegistro, fechaAlquilada, isAlquida) VALUES
('VID-001', 'Zelda: Breath of the Wild', 1, NOW(), NULL, FALSE),
('VID-002', 'Call of Duty: Espinosa at War', 2, NOW(), NULL, FALSE),
('VID-003', 'Final Fantasy XV', 3, NOW(), NULL, FALSE),
('VID-004', 'FIFA 25', 4, NOW(), NULL, FALSE);
