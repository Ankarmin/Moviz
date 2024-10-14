package Modelo;

import DBRepositorio.PeliculaRepositorio;

public class BuscadorDePeliculasModelo {

	private PeliculaRepositorio peliculaRepositorio;

	public BuscadorDePeliculasModelo(PeliculaRepositorio peliculaRepositorio) {
		this.peliculaRepositorio = peliculaRepositorio;
	}

	public PeliculaRepositorio getPeliculaRepositorio() {
		return peliculaRepositorio;
	}
}
