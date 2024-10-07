package DBRepositorio;

import java.util.ArrayList;
import java.util.List;

public class Pelicula extends Entidades {

	private int idPelicula;
	private String nombre;
	private int añoEstreno;
	private String genero;
	private int duracion;
	private int puntuacion;
	private String sinopsis;

	public Pelicula() {
	}

	public Pelicula(int idPelicula, String nombre, int añoEstreno, String genero, int duracion, int puntuacion,
			String sinopsis) {
		this.idPelicula = idPelicula;
		this.nombre = nombre;
		this.añoEstreno = añoEstreno;
		this.genero = genero;
		this.duracion = duracion;
		this.puntuacion = puntuacion;
		this.sinopsis = sinopsis;
	}

	@Override
	public Object[] toArray() {
		return new Object[] { getId(), getNombre(), getAñoEstreno(), getGenero(), getDuracion(), getPuntuacion(),
				getSinopsis() };
	}

	public static Pelicula toPelicula(List<Object> datos) {
		return new Pelicula((Integer) datos.get(0), (String) datos.get(1), (Integer) datos.get(2),
				(String) datos.get(3), (Integer) datos.get(4), (Integer) datos.get(5), (String) datos.get(6));
	}

	public static List<String> getColumnas() {
		List<String> columnas = new ArrayList<>();
		columnas.add("Id de Película");
		columnas.add("Película");
		columnas.add("Año de Estreno");
		columnas.add("Género");
		columnas.add("Duración");
		columnas.add("Puntuación");
		columnas.add("Sinopsis");

		return columnas;
	}

	public int getId() {
		return idPelicula;
	}

	public void setId(int id) {
		this.idPelicula = id;
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

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public float getPuntuacion() {
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

}
