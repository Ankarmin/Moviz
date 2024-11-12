package Modelo;

import java.util.List;

import DBRepositorio.Pelicula;
import DBRepositorio.PeliculaFavorita;
import DBRepositorio.PeliculaFavoritaRepositorio;
import DBRepositorio.PeliculaRepositorio;

public class MenuUsuarioModelo {

	private final PeliculaRepositorio peliculaRepositorio;
	private final PeliculaFavoritaRepositorio peliculaFavoritaRepositorio;

	public MenuUsuarioModelo(PeliculaRepositorio peliculaRepositorio,
			PeliculaFavoritaRepositorio peliculaFavoritaRepositorio) {
		this.peliculaRepositorio = peliculaRepositorio;
		this.peliculaFavoritaRepositorio = peliculaFavoritaRepositorio;
	}

	public List<Pelicula> obtenerPeliculas() {
		return peliculaRepositorio.obtenerTodos();
	}

	public List<PeliculaFavorita> obtenerPeliculasFavoritas(int id) {
		return peliculaFavoritaRepositorio.obtenerTodosPorIdUsuario(id);
	}

	public Pelicula obtenerPelicula(int id) {
		return peliculaFavoritaRepositorio.obtenerPeliculaPorId(id);
	}
}
