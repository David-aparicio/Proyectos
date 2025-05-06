DROP DATABASE IF EXISTS VideoDaw;
CREATE DATABASE VideoDaw;
USE VideoDaw;


CREATE TABLE Videodaw (
    cif VARCHAR(9) PRIMARY KEY,
    direccion TEXT,
    fechaAlta TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE Cliente (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    dni VARCHAR(40) NOT NULL UNIQUE,
    nombre VARCHAR(100) NOT NULL,
    direccion TEXT,
    fechaNacimiento DATE,
    fechadeCreacionUsuario TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Géneros para películas
CREATE TABLE GeneroPelicula (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL UNIQUE
);

-- Tabla de películas
CREATE TABLE Pelicula (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(100) NOT NULL,
    genero_id INT,
    fechaRegistro TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    fechaAlquilada TIMESTAMP NULL,
    isAlquilada BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (genero_id) REFERENCES GeneroPelicula(Id)
);


CREATE TABLE GeneroVideojuego (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL UNIQUE
);


CREATE TABLE Videojuego (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(100) NOT NULL,
    genero_id INT,
    fechaRegistro TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    fechaAlquilada TIMESTAMP NULL,
    isAlquilada BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (genero_id) REFERENCES GeneroVideojuego(Id)
);
INSERT INTO GeneroPelicula (nombre) VALUES 
('Acción'),
('Comedia'),
('Drama'),
('Ciencia Ficción'),
('Terror'),
('Animación');

INSERT INTO GeneroVideojuego (nombre) VALUES 
('Aventura'),
('RPG'),
('Estrategia'),
('Deportes'),
('Simulación'),
('Shooter');
