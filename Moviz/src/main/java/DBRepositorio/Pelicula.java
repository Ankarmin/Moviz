package DBRepositorio;

import java.util.ArrayList;
import java.util.List;

public class Pelicula extends Entidades {

	private int idPelicula;
	private String nombre;
	private int añoEstreno;
	private String genero;
	private String duracion;
	private int puntuacion;
	private String sinopsis;
	private byte[] imagen;

	public Pelicula() {
	}

	public Pelicula(int idPelicula, String nombre, int añoEstreno, String genero, String duracion, int puntuacion,
			String sinopsis, byte[] imagen) {
		this.idPelicula = idPelicula;
		this.nombre = nombre;
		this.añoEstreno = añoEstreno;
		this.genero = genero;
		this.duracion = duracion;
		this.puntuacion = puntuacion;
		this.sinopsis = sinopsis;
		this.imagen = imagen;
	}

	@Override
	public Object[] toArray() {
		return new Object[] { getIdPelicula(), getNombre(), getAñoEstreno(), getGenero(), getDuracion(),
				getPuntuacion(), getSinopsis(), getImagen() };
	}

	public static Pelicula toPelicula(List<Object> datos) {
		return new Pelicula((Integer) datos.get(0), (String) datos.get(1), (Integer) datos.get(2),
				(String) datos.get(3), (String) datos.get(4), (Integer) datos.get(5), (String) datos.get(6),
				(byte[]) datos.get(7));
	}

	public static List<String> getColumnas() {
		List<String> columnas = new ArrayList<>();
		columnas.add("Id Pelicula");
		columnas.add("Nombre");
		columnas.add("Año Estreno");
		columnas.add("Género");
		columnas.add("Duración");
		columnas.add("Puntuación");
		columnas.add("Sinopsis");
		columnas.add("Imagen");
		return columnas;
	}

	public int getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAñoEstreno() {
		return añoEstreno;
	}

	public void setAñoEstreno(int añoEstreno) {
		this.añoEstreno = añoEstreno;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}
}
