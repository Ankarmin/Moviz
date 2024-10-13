package DBRepositorio;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AdministradorTest {

	private Administrador administrador;

	@BeforeEach
	void setUp() {
		// INICIALIZA UN OBJETO ADMINISTRADOR ANTES DE CADA TEST
		administrador = new Administrador(1, 100);
	}

	@Test
	void testConstructor() {
		// PRUEBA EL CONSTRUCTOR CON PARÁMETROS
		Administrador admin = new Administrador(1, 100);
		assertEquals(1, admin.getIdAdmin());
		assertEquals(100, admin.getIdUsuario());
	}

	@Test
	void testSettersAndGetters() {
		// PRUEBAS PARA LOS SETTERS Y GETTERS
		administrador.setIdAdmin(2);
		administrador.setIdUsuario(200);

		assertEquals(2, administrador.getIdAdmin());
		assertEquals(200, administrador.getIdUsuario());
	}

	@Test
	void testToArray() {
		// PRUEBA PARA EL MÉTODO TOARRAY
		Object[] expectedArray = { 1, 100 };
		assertArrayEquals(expectedArray, administrador.toArray());
	}

	@Test
	void testToAdministrador() {
		// PRUEBA PARA EL MÉTODO ESTÁTICO TOADMINISTRADOR
		List<Object> datos = new ArrayList<>();
		datos.add(2);
		datos.add(200);

		Administrador adminFromList = Administrador.toAdministrador(datos);
		assertEquals(2, adminFromList.getIdAdmin());
		assertEquals(200, adminFromList.getIdUsuario());
	}

	@Test
	void testGetColumnas() {
		// PRUEBA PARA EL MÉTODO ESTÁTICO GETCOLUMNAS
		List<String> columnas = Administrador.getColumnas();
		assertEquals(2, columnas.size());
		assertEquals("Id Admin", columnas.get(0));
		assertEquals("Id Usuario", columnas.get(1));
	}

}
