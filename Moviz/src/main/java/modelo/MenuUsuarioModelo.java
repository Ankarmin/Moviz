package modelo;

import java.util.List;

import repositorio.Pelicula;
import repositorio.PeliculaFavorita;
import repositorio.PeliculaFavoritaRepositorio;
import repositorio.PeliculaRepositorio;

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

	public List<PeliculaFavorita> obtenerPeliculasFavoritas(Integer id) {
		return peliculaFavoritaRepositorio.obtenerTodosPorIdUsuario(id);
	}

	public Pelicula obtenerPelicula(Integer id) {
		return peliculaFavoritaRepositorio.obtenerPeliculaPorId(id);
	}
}
