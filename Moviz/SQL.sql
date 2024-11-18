USE db_moviz;

-- TABLA usuario
CREATE TABLE usuario (
  id INT NOT NULL AUTO_INCREMENT,
  user VARCHAR(50) NOT NULL,
  password VARCHAR(50) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY (user)
);

-- TABLA administrador
CREATE TABLE administrador (
  idAdmin INT NOT NULL AUTO_INCREMENT,
  idUsuario INT NOT NULL,
  PRIMARY KEY (idAdmin),
  FOREIGN KEY (idUsuario) REFERENCES usuario (id) ON DELETE CASCADE
);

-- TABLA cliente
CREATE TABLE cliente (
  idCliente INT NOT NULL AUTO_INCREMENT,
  idUsuario INT NOT NULL,
  email VARCHAR(100) NOT NULL,
  PRIMARY KEY (idCliente),
  FOREIGN KEY (idUsuario) REFERENCES usuario (id) ON DELETE CASCADE
);

-- TABLA pelicula
CREATE TABLE pelicula (
  idPelicula INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(50) NOT NULL,
  añoEstreno YEAR NOT NULL CHECK (añoEstreno >= 1980),
  genero VARCHAR(50) NOT NULL,
  duracion TIME NOT NULL,
  puntuacion DECIMAL(3, 1) NOT NULL DEFAULT 0 CHECK (puntuacion BETWEEN 0 AND 5),
  sinopsis TEXT,
  imagen LONGBLOB,
  PRIMARY KEY (idPelicula),
  UNIQUE KEY (nombre),
  KEY (puntuacion),
  KEY (añoEstreno)
);

-- TABLA comentario
CREATE TABLE comentario (
  idComentario INT NOT NULL AUTO_INCREMENT,
  idPelicula INT NOT NULL,
  user VARCHAR(50) NOT NULL,
  comentario TEXT NOT NULL,
  puntuacion TINYINT NOT NULL CHECK (puntuacion BETWEEN 1 AND 5),
  PRIMARY KEY (idComentario),
  FOREIGN KEY (idPelicula) REFERENCES pelicula (idPelicula) ON DELETE CASCADE,
  FOREIGN KEY (user) REFERENCES usuario (user) ON DELETE CASCADE
);

-- TABLA peliculaalquilada
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

-- TABLA peliculafavorita
CREATE TABLE peliculafavorita (
	idPeliculaFavorita INT NOT NULL AUTO_INCREMENT,
    idPelicula INT NOT NULL,
    idUsuario INT NOT NULL,
    PRIMARY KEY (idPeliculaFavorita),
	FOREIGN KEY (idPelicula) REFERENCES pelicula (idPelicula) ON DELETE CASCADE,
	FOREIGN KEY (idUsuario) REFERENCES usuario (id) ON DELETE CASCADE
	);
    
-- CREAR EL EVENTO PARA ELIMINAR REGISTROS PASADA LA FECHA DE DEVOLUCIÓN
SET GLOBAL event_scheduler = ON;

CREATE EVENT eliminar_peliculas_vencidas
ON SCHEDULE EVERY 1 DAY
DO
  DELETE FROM peliculaalquilada
  WHERE fechaDevolucion < CURDATE();
  
-- VERIFICAR SI EL EVENTO ESTÁ CREADO
SHOW VARIABLES LIKE 'event_scheduler';
SHOW EVENTS;
  
-- TRIGGER PARA ACTUALIZA PUNTUACIÓN DESPUÉS DE INSERTAR UN COMENTARIO
DELIMITER $$
CREATE TRIGGER actualizar_puntuacion_pelicula
AFTER INSERT ON comentario
FOR EACH ROW
BEGIN
    DECLARE promedio_puntuacion DECIMAL(3, 2);

    SELECT AVG(puntuacion)
    INTO promedio_puntuacion
    FROM comentario
    WHERE idPelicula = NEW.idPelicula;

    UPDATE pelicula
    SET puntuacion = ROUND(promedio_puntuacion, 1)
    WHERE idPelicula = NEW.idPelicula;
END$$
DELIMITER ;

-- TRIGGER PARA ACTUALIZA PUNTUACIÓN DESPUÉS DE ELIMINAR UN COMENTARIO
DELIMITER $$
CREATE TRIGGER actualizar_puntuacion_pelicula_delete
AFTER DELETE ON comentario
FOR EACH ROW
BEGIN
  DECLARE promedio_puntuacion DECIMAL(3, 2);

  SELECT AVG(puntuacion)
  INTO promedio_puntuacion
  FROM comentario
  WHERE idPelicula = OLD.idPelicula;

  UPDATE pelicula
  SET puntuacion = ROUND(promedio_puntuacion, 1)
  WHERE idPelicula = OLD.idPelicula;
END$$
DELIMITER ;

-- VERIFICAR SI LOS TRIGGERS ESTÁN CREADOS
SHOW TRIGGERS WHERE `Trigger` LIKE 'actualizar_puntuacion_pelicula';
SHOW TRIGGERS WHERE `Trigger` LIKE 'actualizar_puntuacion_pelicula_delete';