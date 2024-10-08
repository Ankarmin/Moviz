package DBRepositorio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PeliculaAlquilada extends Entidades {
	private int idPrestamo;
	private int idPelicula;
	private String usuario;
	private Date fechaAlquiler;
	private Date fechaDevolucion;

	public PeliculaAlquilada() {
	}

	public PeliculaAlquilada(int idPrestamo, int idPelicula, String usuario, Date fechaAlquiler, Date fechaDevolucion) {
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
				(Date) datos.get(3), (Date) datos.get(4));
	}

	public static List<String> getColumnas() {
		List<String> columnas = new ArrayList<>();
		columnas.add("Id Préstamo");
		columnas.add("Id Película");
		columnas.add("Usuario");
		columnas.add("Fecha de Alquiler");
		columnas.add("Fecha de Devolucion");
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

	public Date getFechaAlquiler() {
		return fechaAlquiler;
	}

	public void setFechaAlquiler(Date fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}

	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
}
