package DBRepositorio;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuarioTest {

    private Usuario usuario;

    @BeforeEach
    void setUp() {
        // INICIALIZA UN OBJETO USUARIO ANTES DE CADA TEST
        usuario = new Usuario(1, "usuarioEjemplo", "password123");
    }

    @Test
    void testConstructor() {
        // PRUEBA EL CONSTRUCTOR CON PARÁMETROS
        Usuario usuarioTest = new Usuario(1, "usuarioEjemplo", "password123");
        assertEquals(1, usuarioTest.getId());
        assertEquals("usuarioEjemplo", usuarioTest.getUser());
        assertEquals("password123", usuarioTest.getPassword());
    }

    @Test
    void testSettersAndGetters() {
        // PRUEBAS PARA LOS SETTERS Y GETTERS
        usuario.setId(2);
        usuario.setUser("nuevoUsuario");
        usuario.setPassword("nuevaPassword");

        assertEquals(2, usuario.getId());
        assertEquals("nuevoUsuario", usuario.getUser());
        assertEquals("nuevaPassword", usuario.getPassword());
    }

    @Test
    void testToArray() {
        // PRUEBA PARA EL MÉTODO TOARRAY
        Object[] expectedArray = {1, "usuarioEjemplo", "password123"};
        assertArrayEquals(expectedArray, usuario.toArray());
    }

    @Test
    void testToUsuario() {
        // PRUEBA PARA EL MÉTODO ESTÁTICO TOUSUARIO
        List<Object> datos = new ArrayList<>();
        datos.add(2);
        datos.add("otroUsuario");
        datos.add("otraPassword");

        Usuario usuarioFromList = Usuario.toUsuario(datos);
        assertEquals(2, usuarioFromList.getId());
        assertEquals("otroUsuario", usuarioFromList.getUser());
        assertEquals("otraPassword", usuarioFromList.getPassword());
    }

    @Test
    void testGetColumnas() {
        // PRUEBA PARA EL MÉTODO ESTÁTICO GETCOLUMNAS
        List<String> columnas = Usuario.getColumnas();
        assertEquals(3, columnas.size());
        assertEquals("Id", columnas.get(0));
        assertEquals("Usuario", columnas.get(1));
        assertEquals("Contraseña", columnas.get(2));
    }
}
