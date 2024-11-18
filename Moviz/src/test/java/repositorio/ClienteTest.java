package repositorio;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ClienteTest {

	@Test
	void testConstructorAndGetters() {
		Cliente cliente = new Cliente(1, 101, "test@example.com");
		assertEquals(1, cliente.getIdCliente());
		assertEquals(101, cliente.getIdUsuario());
		assertEquals("test@example.com", cliente.getEmail());
	}

	@Test
	void testSettersAndGetters() {
		Cliente cliente = new Cliente();
		cliente.setIdCliente(2);
		cliente.setIdUsuario(202);
		cliente.setEmail("another@example.com");
		assertEquals(2, cliente.getIdCliente());
		assertEquals(202, cliente.getIdUsuario());
		assertEquals("another@example.com", cliente.getEmail());
	}

	@Test
	void testToArray() {
		Cliente cliente = new Cliente(3, 303, "arraytest@example.com");
		Object[] expectedArray = { 3, 303, "arraytest@example.com" };
		assertArrayEquals(expectedArray, cliente.toArray());
	}

	@Test
	void testToCliente() {
		List<Object> datos = new ArrayList<>();
		datos.add(4);
		datos.add(404);
		datos.add("toCliente@example.com");
		Cliente cliente = Cliente.toCliente(datos);
		assertEquals(4, cliente.getIdCliente());
		assertEquals(404, cliente.getIdUsuario());
		assertEquals("toCliente@example.com", cliente.getEmail());
	}

	@Test
	void testGetColumnas() {
		List<String> expectedColumns = new ArrayList<>();
		expectedColumns.add("Id Cliente");
		expectedColumns.add("Id Usuario");
		expectedColumns.add("Email");
		assertEquals(expectedColumns, Cliente.getColumnas());
	}
}
