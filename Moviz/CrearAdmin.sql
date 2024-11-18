-- CREAR UN ADMINISTRADOR
INSERT INTO usuario (user, password)
VALUES ('piña', 'piña');

INSERT INTO administrador (idUsuario)
VALUES (LAST_INSERT_ID());

select * from usuario;
select * from administrador;
select * from cliente;
select * from comentario;
select * from pelicula;
select * from peliculaalquilada;
select * from peliculafavorita;

DELETE FROM pelicula WHERE idPelicula BETWEEN 308 AND 327;
DELETE FROM pelicula WHERE idPelicula = 328;

-- SIMULAR EVENTO DE ELIMINAR UN ALQUILER AUTOMATICAMENTE
INSERT INTO peliculaalquilada (idPelicula, idUsuario, fechaAlquiler, fechaDevolucion)
VALUES (1, 32, CURDATE() - INTERVAL 10 DAY, CURDATE() - INTERVAL 3 DAY);

SELECT * FROM peliculaalquilada WHERE fechaDevolucion < CURDATE();

ALTER EVENT eliminar_peliculas_vencidas
ON SCHEDULE EVERY 1 MINUTE;

SELECT * FROM peliculaalquilada WHERE fechaDevolucion < CURDATE();

ALTER EVENT eliminar_peliculas_vencidas
ON SCHEDULE EVERY 1 DAY;