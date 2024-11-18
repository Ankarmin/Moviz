package modelo;

import java.util.List;

import repositorio.Pelicula;
import repositorio.PeliculaRepositorio;

public class MenuBuscadorModelo {

	private PeliculaRepositorio peliculaRepositorio;

	public MenuBuscadorModelo(PeliculaRepositorio peliculaRepositorio) {
		this.peliculaRepositorio = peliculaRepositorio;
	}

	public List<Pelicula> busquedaPeliculas(String busqueda) {
		return peliculaRepositorio.busquedaPeliculas(busqueda);
	}
}
