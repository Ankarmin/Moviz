package modelo;

import java.util.List;

import repositorio.Pelicula;
import repositorio.PeliculaRepositorio;

public class MenuPeliculasModelo {
	private PeliculaRepositorio peliculaRepositorio;

	public MenuPeliculasModelo(PeliculaRepositorio peliculaRepositorio) {
		this.peliculaRepositorio = peliculaRepositorio;
	}

	public List<Pelicula> obtenerTodos() {
		return peliculaRepositorio.obtenerTodos();
	}

	public List<Pelicula> obtenerPorAnio(Integer anioInicio, Integer anioFin) {
		return peliculaRepositorio.obtenerPorAnio(anioInicio, anioFin);
	}

	public List<Pelicula> obtenerPorGenero(String genero) {
		return peliculaRepositorio.obtenerPorGenero(genero);
	}

	public List<Pelicula> obtenerPorPuntuacion(Integer puntuacionMin, Integer puntuacionMax) {
		return peliculaRepositorio.obtenerPorPuntuacion(puntuacionMin, puntuacionMax);
	}
}