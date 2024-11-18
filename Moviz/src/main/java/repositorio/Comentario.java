package repositorio;

import java.util.ArrayList;
import java.util.List;

public class Comentario extends Entidades {
	private int idComentario;
	private int idPelicula;
	private String user;
	private String comentario;
	private int puntuacion;

	public Comentario() {
	}

	public Comentario(int idComentario, int idPelicula, String user, String comentario, int puntuacion) {
		this.idComentario = idComentario;
		this.idPelicula = idPelicula;
		this.user = user;
		this.comentario = comentario;
		this.puntuacion = puntuacion;
	}

	@Override
	public Object[] toArray() {
		return new Object[] { getIdComentario(), getIdPelicula(), getUser(), getComentario(), getPuntuacion() };
	}

	public static Comentario toComentario(List<Object> datos) {
		return new Comentario((Integer) datos.get(0), (Integer) datos.get(1), (String) datos.get(2),
				(String) datos.get(3), (Integer) datos.get(4));
	}

	public static List<String> getColumnas() {
		List<String> columnas = new ArrayList<>();
		columnas.add("Id Comentario");
		columnas.add("Id Pelicula");
		columnas.add("Usuario");
		columnas.add("Comentario");
		columnas.add("Puntuación");
		return columnas;
	}

	public int getIdComentario() {
		return idComentario;
	}

	public void setIdComentario(int idComentario) {
		this.idComentario = idComentario;
	}

	public int getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
}
