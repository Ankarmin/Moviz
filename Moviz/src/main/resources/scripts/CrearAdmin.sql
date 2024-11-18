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

