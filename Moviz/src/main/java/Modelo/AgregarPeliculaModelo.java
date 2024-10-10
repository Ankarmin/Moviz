package Modelo;

import DBRepositorio.Pelicula;
import DBRepositorio.PeliculaRepositorio;

public class AgregarPeliculaModelo {

	private final PeliculaRepositorio peliculaRepositorio;

	public AgregarPeliculaModelo(PeliculaRepositorio peliculaRepositorio) {
		this.peliculaRepositorio = peliculaRepositorio;
	}

	public void agregarPelicula(Pelicula pelicula) {
		peliculaRepositorio.agregar(pelicula);
	}
}
