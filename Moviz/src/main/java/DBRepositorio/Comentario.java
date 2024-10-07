package DBRepositorio;

import java.util.ArrayList;
import java.util.List;

public class Comentario extends Entidades {

	private int idComentario;
	private int idPelicula; // Misma idPelicula de la entidad Pelicula
	private String usuario; // Mismo Usuario de la entidad Usuario
	private String comentario;
	private int puntuacion;

	public Comentario() {
	}

	public Comentario(int idComentario, int idPelicula, String usuario, String comentario, int puntuacion) {
		this.idComentario = idComentario;
		this.idPelicula = idPelicula;
		this.usuario = usuario;
		this.comentario = comentario;
		this.puntuacion = puntuacion;
	}

	@Override
	public Object[] toArray() {
		return new Object[] { getIdComentario(), getIdPelicula(), getUsuario(), getComentario(), getPuntuacion() };
	}

	public static Comentario toComentario(List<Object> datos) {
		return new Comentario((Integer) datos.get(0), (Integer) datos.get(1), (String) datos.get(2),
				(String) datos.get(3), (Integer) datos.get(4));
	}

	public static List<String> getColumnas() {
		List<String> columnas = new ArrayList<>();
		columnas.add("ID");
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

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
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
