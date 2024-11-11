package Modelo;

import java.util.List;

import DBRepositorio.Pelicula;
import DBRepositorio.PeliculaRepositorio;

public class MenuPeliculasModelo {
	private PeliculaRepositorio peliculaRepositorio;

	public MenuPeliculasModelo(PeliculaRepositorio peliculaRepositorio) {
		this.peliculaRepositorio = peliculaRepositorio;
	}

	public List<Pelicula> obtenerTodos() {
		return peliculaRepositorio.obtenerTodos();
	}
}