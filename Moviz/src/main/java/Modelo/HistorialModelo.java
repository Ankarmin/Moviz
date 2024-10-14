package Modelo;

import DBRepositorio.PeliculaRepositorio;

public class HistorialModelo {

	private PeliculaRepositorio peliculaRepositorio;

	public HistorialModelo(PeliculaRepositorio peliculaRepositorio) {
		this.peliculaRepositorio = peliculaRepositorio;
	}

	public PeliculaRepositorio getPeliculaRepositorio() {
		return peliculaRepositorio;
	}
}
