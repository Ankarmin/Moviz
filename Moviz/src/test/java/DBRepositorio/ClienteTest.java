package DBRepositorio;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTest {

    private Cliente cliente;

    @BeforeEach
    void setUp() {
        // INICIALIZA UN OBJETO CLIENTE ANTES DE CADA TEST
        cliente = new Cliente(1, 100, "email@example.com");
    }

    @Test
    void testConstructor() {
        // PRUEBA EL CONSTRUCTOR CON PARÁMETROS
        Cliente clienteTest = new Cliente(1, 100, "email@example.com");
        assertEquals(1, clienteTest.getIdCliente());
        assertEquals(100, clienteTest.getIdUsuario());
        assertEquals("email@example.com", clienteTest.getEmail());
    }

    @Test
    void testSettersAndGetters() {
        // PRUEBAS PARA LOS SETTERS Y GETTERS
        cliente.setIdCliente(2);
        cliente.setIdUsuario(200);
        cliente.setEmail("newemail@example.com");

        assertEquals(2, cliente.getIdCliente());
        assertEquals(200, cliente.getIdUsuario());
        assertEquals("newemail@example.com", cliente.getEmail());
    }

    @Test
    void testToArray() {
        // PRUEBA PARA EL MÉTODO TOARRAY
        Object[] expectedArray = {1, 100, "email@example.com"};
        assertArrayEquals(expectedArray, cliente.toArray());
    }

    @Test
    void testToCliente() {
        // PRUEBA PARA EL MÉTODO ESTÁTICO TOCLIENTE
        List<Object> datos = new ArrayList<>();
        datos.add(2);
        datos.add(200);
        datos.add("newemail@example.com");

        Cliente clienteFromList = Cliente.toCliente(datos);
        assertEquals(2, clienteFromList.getIdCliente());
        assertEquals(200, clienteFromList.getIdUsuario());
        assertEquals("newemail@example.com", clienteFromList.getEmail());
    }

    @Test
    void testGetColumnas() {
        // PRUEBA PARA EL MÉTODO ESTÁTICO GETCOLUMNAS
        List<String> columnas = Cliente.getColumnas();
        assertEquals(3, columnas.size());
        assertEquals("Id Cliente", columnas.get(0));
        assertEquals("Id Usuario", columnas.get(1));
        assertEquals("Email", columnas.get(2));
    }
}
