package Modelo;

import java.util.List;

import DBRepositorio.Pelicula;
import DBRepositorio.PeliculaRepositorio;

public class BuscadorDePeliculasModelo {

	private PeliculaRepositorio peliculaRepositorio;

	public BuscadorDePeliculasModelo(PeliculaRepositorio peliculaRepositorio) {
		this.peliculaRepositorio = peliculaRepositorio;
	}

	public List<Pelicula> obtenerTodos() {
		return peliculaRepositorio.obtenerTodos();
	}
}
