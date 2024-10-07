package DBRepositorio;

import java.util.ArrayList;
import java.util.List;

public class PeliculaAlquilada extends Entidades {

	private int idPrestamo;
	private int idPelicula; // Misma idPelicula de la entidad Pelicula
	private String usuario; // Mismo Usuario de la entidad Usuario
	private String fechaAlquiler;
	private String fechaDevolucion;

	public PeliculaAlquilada() {

	}

	public PeliculaAlquilada(int idPrestamo, int idPelicula, String usuario, String fechaAlquiler,
			String fechaDevolucion) {
		super();
		this.idPrestamo = idPrestamo;
		this.idPelicula = idPelicula;
		this.usuario = usuario;
		this.fechaAlquiler = fechaAlquiler;
		this.fechaDevolucion = fechaDevolucion;
	}

	@Override
	public Object[] toArray() {
		return new Object[] { getIdPrestamo(), getIdPelicula(), getUsuario(), getFechaAlquiler(),
				getFechaDevolucion() };
	}

	public static PeliculaAlquilada toPeliculaAlquilada(List<Object> datos) {
		return new PeliculaAlquilada((Integer) datos.get(0), (Integer) datos.get(1), (String) datos.get(2),
				(String) datos.get(3), (String) datos.get(4));
	}

	public static List<String> getColumnas() {
		List<String> columnas = new ArrayList<>();
		columnas.add("Id Prestamo");
		columnas.add("Id Película");
		columnas.add("Usuario");
		columnas.add("Fecha de Alquiler");
		columnas.add("Fecha de Devolución");

		return columnas;
	}

	public int getIdPrestamo() {
		return idPrestamo;
	}

	public void setIdPrestamo(int idPrestamo) {
		this.idPrestamo = idPrestamo;
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

	public String getFechaAlquiler() {
		return fechaAlquiler;
	}

	public void setFechaAlquiler(String fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}

	public String getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(String fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

}
