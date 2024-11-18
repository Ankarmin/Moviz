package modelo;

import java.util.List;

import repositorio.Pelicula;
import repositorio.PeliculaRepositorio;

public class BuscadorDePeliculasModelo {

	private PeliculaRepositorio peliculaRepositorio;

	public BuscadorDePeliculasModelo(PeliculaRepositorio peliculaRepositorio) {
		this.peliculaRepositorio = peliculaRepositorio;
	}

	public List<Pelicula> obtenerTodos() {
		return peliculaRepositorio.obtenerTodos();
	}
}
