-- Crear el esquema de la base de datos con UTF-8
CREATE SCHEMA `db_moviz` DEFAULT CHARACTER SET utf8;
USE db_moviz;

-- Tabla usuario
CREATE TABLE usuario (
  id INT NOT NULL AUTO_INCREMENT,
  user VARCHAR(50) NOT NULL,
  password VARCHAR(50) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY (user)
);

-- Tabla administrador
CREATE TABLE administrador (
  idAdmin INT NOT NULL AUTO_INCREMENT,
  idUsuario INT NOT NULL,
  PRIMARY KEY (idAdmin),
  FOREIGN KEY (idUsuario) REFERENCES usuario (id) ON DELETE CASCADE
);

-- Tabla cliente
CREATE TABLE cliente (
  idCliente INT NOT NULL AUTO_INCREMENT,
  idUsuario INT NOT NULL,
  email VARCHAR(100) NOT NULL,
  PRIMARY KEY (idCliente),
  FOREIGN KEY (idUsuario) REFERENCES usuario (id) ON DELETE CASCADE
);

-- Tabla pelicula
CREATE TABLE pelicula (
  idPelicula INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(50) NOT NULL,
  añoEstreno YEAR NOT NULL,
  genero VARCHAR(50) NOT NULL,
  duracion INT NOT NULL,
  puntuacion TINYINT NOT NULL CHECK (puntuacion BETWEEN 1 AND 5),
  sinopsis TEXT,
  imagen LONGBLOB,
  PRIMARY KEY (idPelicula),
  UNIQUE KEY (nombre),
  KEY (puntuacion),
  KEY (añoEstreno)
);

-- Tabla comentario
CREATE TABLE comentario (
  idComentario INT NOT NULL AUTO_INCREMENT,
  idPelicula INT NOT NULL,
  idUsuario INT NOT NULL,
  comentario TEXT NOT NULL,
  puntuacion TINYINT NOT NULL CHECK (puntuacion BETWEEN 1 AND 5),
  PRIMARY KEY (idComentario),
  FOREIGN KEY (idPelicula) REFERENCES pelicula (idPelicula) ON DELETE CASCADE,
  FOREIGN KEY (idUsuario) REFERENCES usuario (id) ON DELETE CASCADE
);

-- Tabla peliculaalquilada
CREATE TABLE peliculaalquilada (
  idPrestamo INT NOT NULL AUTO_INCREMENT,
  idPelicula INT NOT NULL,
  idUsuario INT NOT NULL,
  fechaAlquiler DATE NOT NULL,
  fechaDevolucion DATE DEFAULT (DATE_ADD(fechaAlquiler, INTERVAL 7 DAY)),
  PRIMARY KEY (idPrestamo),
  FOREIGN KEY (idPelicula) REFERENCES pelicula (idPelicula) ON DELETE CASCADE,
  FOREIGN KEY (idUsuario) REFERENCES usuario (id) ON DELETE CASCADE
);

-- Habilitar eventos en MySQL
SET GLOBAL event_scheduler = ON;

-- Crear el evento para eliminar registros cuando la fecha de devolución haya pasado
CREATE EVENT eliminar_peliculas_vencidas
ON SCHEDULE EVERY 1 DAY
DO
  DELETE FROM peliculaalquilada
  WHERE fechaDevolucion < CURDATE();
