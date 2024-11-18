package modelo;

import repositorio.Pelicula;
import repositorio.PeliculaAlquilada;
import repositorio.PeliculaAlquiladaRepositorio;
import repositorio.PeliculaFavorita;
import repositorio.PeliculaFavoritaRepositorio;
import repositorio.PeliculaRepositorio;

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

	public Pelicula obtenerPorId(Integer id) {
		return peliculaRepositorio.obtenerPorId(id);
	}

	public boolean agregarFavorita(PeliculaFavorita peliculaFavorita) {
		return peliculaFavoritaRepositorio.agregar(peliculaFavorita);
	}

	public boolean agregarAlquiler(PeliculaAlquilada peliculaAlquilada) {
		return peliculaAlquiladaRepositorio.agregar(peliculaAlquilada);
	}

	public boolean verificarFavoritos(Integer idPelicula, Integer idUsuario) {
		return peliculaFavoritaRepositorio.esFavorita(idPelicula, idUsuario);
	}

	public PeliculaFavorita obtenerPeliculaFavorita(Integer idPelicula, Integer idUsuario) {
		return peliculaFavoritaRepositorio.obtenerPorUsuarioYPelicula(idPelicula, idUsuario);
	}

	public boolean eliminarFavoritos(Integer id) {
		return peliculaFavoritaRepositorio.eliminar(id);
	}

	public boolean verificarAlquiler(Integer idPelicula, Integer idUsuario) {
		return peliculaAlquiladaRepositorio.esAlquilada(idPelicula, idUsuario);
	}

	public boolean verificarLimiteAlquiler(Integer idUsuario) {
		return peliculaAlquiladaRepositorio.limiteAlquiler(idUsuario);
	}
}