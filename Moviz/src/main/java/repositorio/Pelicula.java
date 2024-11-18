package repositorio;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Pelicula extends Entidades {

	private int idPelicula;
	private String nombre;
	private int anioEstreno;
	private String genero;
	private String duracion;
	private BigDecimal puntuacion;
	private String sinopsis;
	private InputStream imagen;

	public Pelicula() {
	}

	public Pelicula(int idPelicula, String nombre, int anioEstreno, String genero, String duracion,
			BigDecimal puntuacion, String sinopsis, InputStream imagen) {
		this.idPelicula = idPelicula;
		this.nombre = nombre;
		this.anioEstreno = anioEstreno;
		this.genero = genero;
		this.duracion = duracion;
		this.puntuacion = puntuacion;
		this.sinopsis = sinopsis;
		this.imagen = imagen;
	}

	public Pelicula(int idPelicula, String nombre) {
		this.idPelicula = idPelicula;
		this.nombre = nombre;
	}

	@Override
	public Object[] toArray() {
		return new Object[] { getIdPelicula(), getNombre() };
	}

	public static Pelicula toPelicula(List<Object> datos) {
		return new Pelicula((Integer) datos.get(0), (String) datos.get(1));
	}

	public static List<String> getTitulos() {
		List<String> columnas = new ArrayList<>();
		columnas.add("Id Pelicula");
		columnas.add("Nombre");
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

	public int getAnioEstreno() {
		return anioEstreno;
	}

	public void setAnioEstreno(int anioEstreno) {
		this.anioEstreno = anioEstreno;
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

	public BigDecimal getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(BigDecimal puntuacion) {
		this.puntuacion = puntuacion;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public InputStream getImagen() {
		return imagen;
	}

	public void setImagen(InputStream imagen) {
		this.imagen = imagen;
	}
}
