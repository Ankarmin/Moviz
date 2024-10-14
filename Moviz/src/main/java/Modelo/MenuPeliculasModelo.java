package Modelo;

import DBRepositorio.PeliculaRepositorio;

public class MenuPeliculasModelo {
	private PeliculaRepositorio peliculaRepositorio;

	public MenuPeliculasModelo(PeliculaRepositorio peliculaRepositorio) {
		this.peliculaRepositorio = peliculaRepositorio;
	}

	public PeliculaRepositorio getPeliculaRepositorio() {
		return peliculaRepositorio;
	}
}