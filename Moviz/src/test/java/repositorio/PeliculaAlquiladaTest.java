package repositorio;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

class PeliculaAlquiladaTest {

	@Test
	void testConstructorAndGetters() {
		Date alquiler = new Date();
		Date devolucion = new Date();
		PeliculaAlquilada peliculaAlquilada = new PeliculaAlquilada(1, 101, 1001, alquiler, devolucion);
		assertEquals(1, peliculaAlquilada.getIdPrestamo());
		assertEquals(101, peliculaAlquilada.getIdPelicula());
		assertEquals(1001, peliculaAlquilada.getIdUsuario());
		assertEquals(alquiler, peliculaAlquilada.getFechaAlquiler());
		assertEquals(devolucion, peliculaAlquilada.getFechaDevolucion());
	}

	@Test
	void testSettersAndGetters() {
		Date alquiler = new Date();
		Date devolucion = new Date();
		PeliculaAlquilada peliculaAlquilada = new PeliculaAlquilada();
		peliculaAlquilada.setIdPrestamo(2);
		peliculaAlquilada.setIdPelicula(202);
		peliculaAlquilada.setIdUsuario(2002);
		peliculaAlquilada.setFechaAlquiler(alquiler);
		peliculaAlquilada.setFechaDevolucion(devolucion);
		assertEquals(2, peliculaAlquilada.getIdPrestamo());
		assertEquals(202, peliculaAlquilada.getIdPelicula());
		assertEquals(2002, peliculaAlquilada.getIdUsuario());
		assertEquals(alquiler, peliculaAlquilada.getFechaAlquiler());
		assertEquals(devolucion, peliculaAlquilada.getFechaDevolucion());
	}

	@Test
	void testToArray() {
		Date alquiler = new Date();
		Date devolucion = new Date();
		PeliculaAlquilada peliculaAlquilada = new PeliculaAlquilada(3, 303, 3003, alquiler, devolucion);
		Object[] expectedArray = { 3, 303, 3003, alquiler, devolucion };
		assertArrayEquals(expectedArray, peliculaAlquilada.toArray());
	}

	@Test
	void testToPeliculaAlquilada() {
		Date alquiler = new Date();
		Date devolucion = new Date();
		List<Object> datos = new ArrayList<>();
		datos.add(4);
		datos.add(404);
		datos.add(4004);
		datos.add(alquiler);
		datos.add(devolucion);
		PeliculaAlquilada peliculaAlquilada = PeliculaAlquilada.toPeliculaAlquilada(datos);
		assertEquals(4, peliculaAlquilada.getIdPrestamo());
		assertEquals(404, peliculaAlquilada.getIdPelicula());
		assertEquals(4004, peliculaAlquilada.getIdUsuario());
		assertEquals(alquiler, peliculaAlquilada.getFechaAlquiler());
		assertEquals(devolucion, peliculaAlquilada.getFechaDevolucion());
	}

	@Test
	void testGetColumnas() {
		List<String> expectedColumns = new ArrayList<>();
		expectedColumns.add("Id Préstamo");
		expectedColumns.add("Id Película");
		expectedColumns.add("Usuario");
		expectedColumns.add("Fecha de Alquiler");
		expectedColumns.add("Fecha de Devolucion");
		assertEquals(expectedColumns, PeliculaAlquilada.getColumnas());
	}
}
