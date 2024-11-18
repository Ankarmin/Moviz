package repositorio;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class UsuarioTest {

	@Test
	void testConstructorAndGetters() {
		Usuario usuario = new Usuario(1, "testUser", "testPassword");
		assertEquals(1, usuario.getId());
		assertEquals("testUser", usuario.getUser());
		assertEquals("testPassword", usuario.getPassword());
	}

	@Test
	void testSettersAndGetters() {
		Usuario usuario = new Usuario();
		usuario.setId(2);
		usuario.setUser("newUser");
		usuario.setPassword("newPassword");
		assertEquals(2, usuario.getId());
		assertEquals("newUser", usuario.getUser());
		assertEquals("newPassword", usuario.getPassword());
	}

	@Test
	void testToArray() {
		Usuario usuario = new Usuario(3, "arrayUser", "arrayPassword");
		Object[] expectedArray = { 3, "arrayUser", "arrayPassword" };
		assertArrayEquals(expectedArray, usuario.toArray());
	}

	@Test
	void testToUsuario() {
		List<Object> datos = new ArrayList<>();
		datos.add(4);
		datos.add("toUsuarioUser");
		datos.add("toUsuarioPassword");
		Usuario usuario = Usuario.toUsuario(datos);
		assertEquals(4, usuario.getId());
		assertEquals("toUsuarioUser", usuario.getUser());
		assertEquals("toUsuarioPassword", usuario.getPassword());
	}

	@Test
	void testGetColumnas() {
		List<String> expectedColumns = new ArrayList<>();
		expectedColumns.add("Id");
		expectedColumns.add("Usuario");
		expectedColumns.add("Contraseña");
		assertEquals(expectedColumns, Usuario.getColumnas());
	}
}
