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
  SET puntuacion = IFNULL(ROUND(promedio_puntuacion, 1), 0)
  WHERE idPelicula = OLD.idPelicula;
END$$
DELIMITER ;

-- VERIFICAR SI LOS TRIGGERS ESTÁN CREADOS
SHOW TRIGGERS WHERE `Trigger` LIKE 'actualizar_puntuacion_pelicula';
SHOW TRIGGERS WHERE `Trigger` LIKE 'actualizar_puntuacion_pelicula_delete';