package Modelo;

import DBRepositorio.Pelicula;
import DBRepositorio.PeliculaAlquilada;
import DBRepositorio.PeliculaAlquiladaRepositorio;
import DBRepositorio.PeliculaFavorita;
import DBRepositorio.PeliculaFavoritaRepositorio;
import DBRepositorio.PeliculaRepositorio;

public class PeliculaModelo {

	private final PeliculaRepositorio peliculaRepositorio;
	private final PeliculaFavoritaRepositorio peliculaFavoritaRepositorio;
	private final PeliculaAlquiladaRepositorio peliculaAlquiladaRepositorio;

	public PeliculaModelo(PeliculaRepositorio peliculaRepositorio,
			PeliculaFavoritaRepositorio peliculaFavoritaRepositorio,
			PeliculaAlquiladaRepositorio peliculaAlquiladaRepositorio) {
		this.peliculaRepositorio = peliculaRepositorio;
		this.peliculaFavoritaRepositorio = peliculaFavoritaRepositorio;
		this.peliculaAlquiladaRepositorio = peliculaAlquiladaRepositorio;
	}

	public Pelicula obtenerPorId(int id) {
		Pelicula pelicula = peliculaRepositorio.obtenerPorId(id);
		return pelicula;
	}

	public boolean agregarFavorita(PeliculaFavorita peliculaFavorita) {
		return peliculaFavoritaRepositorio.agregar(peliculaFavorita);
	}

	public boolean agregarAlquiler(PeliculaAlquilada peliculaAlquilada) {
		return peliculaAlquiladaRepositorio.agregar(peliculaAlquilada);
	}

	public boolean verificarFavoritos(int idPelicula, int idUsuario) {
		return peliculaFavoritaRepositorio.esFavorita(idPelicula, idUsuario);
	}

	public PeliculaFavorita obtenerPeliculaFavorita(int idPelicula, int idUsuario) {
		return peliculaFavoritaRepositorio.obtenerPorUsuarioYPelicula(idPelicula, idUsuario);
	}

	public boolean eliminarFavoritos(int id) {
		return peliculaFavoritaRepositorio.eliminar(id);
	}

	public boolean verificarAlquiler(int idPelicula, int idUsuario) {
		return peliculaAlquiladaRepositorio.esAlquilada(idPelicula, idUsuario);
	}

	public boolean verificarLimiteAlquiler(int idUsuario) {
		return peliculaAlquiladaRepositorio.limiteAlquiler(idUsuario);
	}
}