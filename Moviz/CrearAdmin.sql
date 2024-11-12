use db_moviz;

-- Paso 1: Crear el usuario
INSERT INTO usuario (user, password)
VALUES ('piña', 'piña');

-- Paso 2: Asignar el usuario como administrador
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