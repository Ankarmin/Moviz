package modelo;

import repositorio.PeliculaRepositorio;

public class MenuEliminarPeliculaModelo {

	private final PeliculaRepositorio peliculaRepositorio;

	public MenuEliminarPeliculaModelo(PeliculaRepositorio peliculaRepositorio) {
		this.peliculaRepositorio = peliculaRepositorio;
	}

	public boolean eliminarPelicula(Integer id) {
		return peliculaRepositorio.eliminar(id);
	}
}
