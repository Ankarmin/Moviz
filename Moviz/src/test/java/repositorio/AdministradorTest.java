package repositorio;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class AdministradorTest {

	@Test
	void testConstructorAndGetters() {
		Administrador admin = new Administrador(1, 100);
		assertEquals(1, admin.getIdAdmin());
		assertEquals(100, admin.getIdUsuario());
	}

	@Test
	void testSettersAndGetters() {
		Administrador admin = new Administrador();
		admin.setIdAdmin(2);
		admin.setIdUsuario(200);
		assertEquals(2, admin.getIdAdmin());
		assertEquals(200, admin.getIdUsuario());
	}

	@Test
	void testToArray() {
		Administrador admin = new Administrador(3, 300);
		Object[] expectedArray = { 3, 300 };
		assertArrayEquals(expectedArray, admin.toArray());
	}

	@Test
	void testToAdministrador() {
		List<Object> datos = new ArrayList<>();
		datos.add(4);
		datos.add(400);
		Administrador admin = Administrador.toAdministrador(datos);
		assertEquals(4, admin.getIdAdmin());
		assertEquals(400, admin.getIdUsuario());
	}

	@Test
	void testGetColumnas() {
		List<String> expectedColumns = new ArrayList<>();
		expectedColumns.add("Id Admin");
		expectedColumns.add("Id Usuario");
		assertEquals(expectedColumns, Administrador.getColumnas());
	}
}
