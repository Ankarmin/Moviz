package repositorio;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class PeliculaTest {

	@Test
	void testConstructorAndGetters() {
		InputStream image = new ByteArrayInputStream(new byte[] { 1, 2, 3 });
		BigDecimal puntuacion = new BigDecimal("9.0");
		Pelicula pelicula = new Pelicula(1, "Pelicula Test", 2024, "Drama", "120 min", puntuacion, "Sinopsis Test",
				image);
		assertEquals(1, pelicula.getIdPelicula());
		assertEquals("Pelicula Test", pelicula.getNombre());
		assertEquals(2024, pelicula.getAnioEstreno());
		assertEquals("Drama", pelicula.getGenero());
		assertEquals("120 min", pelicula.getDuracion());
		assertEquals(puntuacion, pelicula.getPuntuacion());
		assertEquals("Sinopsis Test", pelicula.getSinopsis());
		assertEquals(image, pelicula.getImagen());
	}

	@Test
	void testSettersAndGetters() {
		InputStream image = new ByteArrayInputStream(new byte[] { 4, 5, 6 });
		BigDecimal puntuacion = new BigDecimal("8.0");
		Pelicula pelicula = new Pelicula();
		pelicula.setIdPelicula(2);
		pelicula.setNombre("Nueva Pelicula");
		pelicula.setAnioEstreno(2023);
		pelicula.setGenero("Acción");
		pelicula.setDuracion("90 min");
		pelicula.setPuntuacion(puntuacion);
		pelicula.setSinopsis("Nueva Sinopsis");
		pelicula.setImagen(image);
		assertEquals(2, pelicula.getIdPelicula());
		assertEquals("Nueva Pelicula", pelicula.getNombre());
		assertEquals(2023, pelicula.getAnioEstreno());
		assertEquals("Acción", pelicula.getGenero());
		assertEquals("90 min", pelicula.getDuracion());
		assertEquals(puntuacion, pelicula.getPuntuacion());
		assertEquals("Nueva Sinopsis", pelicula.getSinopsis());
		assertEquals(image, pelicula.getImagen());
	}

	@Test
	void testToArray() {
		InputStream image = new ByteArrayInputStream(new byte[] { 7, 8, 9 });
		BigDecimal puntuacion = new BigDecimal("7.0");
		Pelicula pelicula = new Pelicula(3, "Array Pelicula", 2025, "Comedia", "110 min", puntuacion, "Sinopsis Array",
				image);
		Object[] expectedArray = { 3, "Array Pelicula" };
		assertArrayEquals(expectedArray, pelicula.toArray());
	}

	@Test
	void testToPelicula() {
		InputStream image = new ByteArrayInputStream(new byte[] { 10, 11, 12 });
		List<Object> datos = new ArrayList<>();
		datos.add(4);
		datos.add("ToPelicula Test");
		datos.add(2026);
		datos.add("Terror");
		datos.add("100 min");
		datos.add(new BigDecimal("10.0"));
		datos.add("Sinopsis Top");
		datos.add(image);
		Pelicula pelicula = Pelicula.toPelicula(datos);
		assertEquals(4, pelicula.getIdPelicula());
		assertEquals("ToPelicula Test", pelicula.getNombre());
		assertEquals(2026, pelicula.getAnioEstreno());
		assertEquals("Terror", pelicula.getGenero());
		assertEquals("100 min", pelicula.getDuracion());
		assertEquals(new BigDecimal("10.0"), pelicula.getPuntuacion());
		assertEquals("Sinopsis Top", pelicula.getSinopsis());
		assertEquals(image, pelicula.getImagen());
	}

	@Test
	void testGetColumnas() {
		List<String> expectedColumns = new ArrayList<>();
		expectedColumns.add("Id Pelicula");
		expectedColumns.add("Nombre");
		assertEquals(expectedColumns, Pelicula.getTitulos());
	}
}
