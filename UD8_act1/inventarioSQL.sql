DROP DATABASE IF EXISTS unidad8act1;
create database unidad8act1;
use unidad8act1;

CREATE TABLE Tipos (
    Id INT PRIMARY KEY ,
    Nombre VARCHAR(100) NOT NULL
);

CREATE TABLE Inventario (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Referencia VARCHAR(50) NOT NULL unique,
    Nombre VARCHAR(100) NOT NULL,
    Descripcion TEXT,
    Tipo INT NOT NULL,
    Cantidad INT NOT NULL,
    Precio DOUBLE NOT NULL,
    Descuento INT,
    IVA INT,
    AplicarDto BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (Tipo) REFERENCES Tipos(Id)
);

INSERT INTO Tipos (Id, Nombre) VALUES
(1, 'Fútbol'),
(2, 'Baloncesto'),
(3, 'Tenis'),
(4, 'Natación'),
(5, 'Ciclismo');


INSERT INTO Inventario (Referencia, Nombre, Descripcion, Tipo, Cantidad, Precio, Descuento, IVA, AplicarDto) VALUES
('FUTB001', 'Balón de Fútbol', 'Balón oficial de cuero tamaño 5', 1, 50, 25.99, 10, 21, TRUE),
('FUTB002', 'Espinilleras', 'Protección para piernas con ajuste elástico', 1, 30, 15.50, 5, 21, TRUE),
('BASK001', 'Balón de Baloncesto', 'Balón profesional de caucho', 2, 40, 30.75, 8, 21, TRUE),
('BASK002', 'Red de Baloncesto', 'Red de nylon resistente para aro', 2, 20, 10.99, 0, 21, FALSE),
('TENI001', 'Raqueta de Tenis', 'Raqueta de grafito con cuerda sintética', 3, 25, 75.00, 15, 21, TRUE),
('TENI002', 'Pelotas de Tenis', 'Pack de 3 pelotas de alta duración', 3, 60, 12.99, 5, 21, TRUE),
('NATA001', 'Gorro de Natación', 'Gorro de silicona para competición', 4, 35, 8.50, 0, 21, FALSE),
('NATA002', 'Gafas de Natación', 'Gafas antiempañantes con ajuste ergonómico', 4, 30, 19.99, 10, 21, TRUE),
('CICL001', 'Casco de Ciclismo', 'Casco aerodinámico con ajuste trasero', 5, 15, 45.99, 10, 21, TRUE),
('CICL002', 'Guantes de Ciclismo', 'Guantes acolchados transpirables', 5, 40, 20.50, 5, 21, TRUE);

select * from Inventario;