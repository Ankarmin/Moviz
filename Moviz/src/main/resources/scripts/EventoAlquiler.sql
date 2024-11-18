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

-- SIMULAR EVENTO DE ELIMINAR UN ALQUILER AUTOMATICAMENTE
INSERT INTO peliculaalquilada (idPelicula, idUsuario, fechaAlquiler, fechaDevolucion)
VALUES (1, 32, CURDATE() - INTERVAL 10 DAY, CURDATE() - INTERVAL 3 DAY);

SELECT * FROM peliculaalquilada WHERE fechaDevolucion < CURDATE();

ALTER EVENT eliminar_peliculas_vencidas
ON SCHEDULE EVERY 1 MINUTE;

SELECT * FROM peliculaalquilada WHERE fechaDevolucion < CURDATE();

ALTER EVENT eliminar_peliculas_vencidas
ON SCHEDULE EVERY 1 DAY;