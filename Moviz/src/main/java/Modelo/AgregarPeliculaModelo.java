package Modelo;

import DBRepositorio.Pelicula;
import DBRepositorio.PeliculaRepositorio;

public class AgregarPeliculaModelo {

	private final PeliculaRepositorio peliculaRepositorio;

	public AgregarPeliculaModelo(PeliculaRepositorio peliculaRepositorio) {
		this.peliculaRepositorio = peliculaRepositorio;
	}

	public boolean agregarPelicula(Pelicula pelicula) {
		return peliculaRepositorio.agregar(pelicula);
	}

	public boolean validarDatos(Pelicula pelicula) {
		// VALIDAR QUE EL NOMBRE NO ESTÉ VACÍO Y NO SUPERE LOS 50 CARACTERES
		if (pelicula.getNombre() == null || pelicula.getNombre().isEmpty()) {
			System.out.println("El nombre no puede estar vacío.");
			return false;
		}
		if (pelicula.getNombre().length() > 50) {
			System.out.println("El nombre no puede exceder los 50 caracteres.");
			return false;
		}

		// VALIDAR QUE EL AÑO DE ESTRENO SEA UN NÚMERO ENTERO
		try {
			@SuppressWarnings("unused")
			int anioEstreno = pelicula.getAnioEstreno();
		} catch (NumberFormatException e) {
			System.out.println("El año de estreno debe ser un número entero.");
			return false;
		}

		// VALIDAR QUE EL AÑO DE ESTRENO SEA POSITIVO Y DENTRO DE UN RANGO RAZONABLE
		int anioActual = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
		if (pelicula.getAnioEstreno() < 1890 || pelicula.getAnioEstreno() > anioActual) {
			System.out.println("El año de estreno debe estar entre 1890 y " + anioActual);
			return false;
		}

		// VALIDAR QUE EL GÉNERO NO ESTÉ VACÍO Y NO SEA IGUAL A "-SELECCIONAR-"
		if (pelicula.getGenero() == null || pelicula.getGenero().isEmpty()
				|| pelicula.getGenero().equals("-Seleccionar-")) {
			System.out.println("Debe escoger un género válido.");
			return false;
		}

		// VALIDAR QUE LA DURACIÓN NO ESTÉ VACÍA Y ESTÉ EN FORMATO CORRECTO (HH:MM:SS)
		if (pelicula.getDuracion() == null || pelicula.getDuracion().isEmpty()) {
			System.out.println("La duración no puede estar vacía.");
			return false;
		}
		if (!pelicula.getDuracion().matches("^\\d{2}:\\d{2}:\\d{2}$")) {
			System.out.println("La duración debe estar en el formato HH:MM:SS.");
			return false;
		}

		// VALIDAR QUE LA SINOPSIS NO EXCEDA UN LÍMITE DE CARACTERES SI ES NECESARIO
		if (pelicula.getSinopsis() != null && pelicula.getSinopsis().length() > 1000) {
			System.out.println("La sinopsis no puede exceder los 1000 caracteres.");
			return false;
		}

		// VALIDAR QUE EL ARCHIVO DE IMAGEN NO SEA NULO (SI ES REQUERIDO)
		if (pelicula.getImagen() == null) {
			System.out.println("Debes subir una imagen.");
			return false;
		}

		// SI TODAS LAS VALIDACIONES PASAN
		return true;
	}
}
