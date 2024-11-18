package modelo;

import java.util.List;

import repositorio.Pelicula;
import repositorio.PeliculaFavorita;
import repositorio.PeliculaFavoritaRepositorio;

public class MenuFavoritasModelo {

	private PeliculaFavoritaRepositorio peliculaFavoritaRepositorio;

	public MenuFavoritasModelo(PeliculaFavoritaRepositorio peliculaFavoritaRepositorio) {
		this.peliculaFavoritaRepositorio = peliculaFavoritaRepositorio;
	}

	public List<PeliculaFavorita> obtenerPeliculasFavoritas(Integer id) {
		return peliculaFavoritaRepositorio.obtenerTodosPorIdUsuario(id);
	}

	public Pelicula obtenerPelicula(int id) {
		return peliculaFavoritaRepositorio.obtenerPeliculaPorId(id);
	}
}
