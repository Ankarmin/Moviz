package DBRepositorio;

import java.util.ArrayList;
import java.util.List;

public class PeliculaFavorita extends Entidades {

	private int idPeliculaFavorita;
	private int idPelicula;
	private int idUsuario;

	public PeliculaFavorita() {

	}

	public PeliculaFavorita(int idPeliculaFavorita, int idPelicula, int idUsuario) {
		this.idPeliculaFavorita = idPeliculaFavorita;
		this.idPelicula = idPelicula;
		this.idUsuario = idUsuario;
	}

	@Override
	public Object[] toArray() {
		return new Object[] { getIdPeliculaFavorita(), getIdPelicula(), getIdUsuario() };
	}

	public static PeliculaFavorita toCliente(List<Object> datos) {
		return new PeliculaFavorita((Integer) datos.get(0), (Integer) datos.get(1), (Integer) datos.get(2));
	}

	public static List<String> getColumnas() {
		List<String> columnas = new ArrayList<>();
		columnas.add("Id Pelicula Favorita");
		columnas.add("Id Pelicula");
		columnas.add("Id Usuario");
		return columnas;
	}

	public int getIdPeliculaFavorita() {
		return idPeliculaFavorita;
	}

	public void setIdPeliculaFavorita(int idPeliculaFavorita) {
		this.idPeliculaFavorita = idPeliculaFavorita;
	}

	public int getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
}
