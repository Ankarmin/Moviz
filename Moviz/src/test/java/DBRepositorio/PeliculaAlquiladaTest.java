package DBRepositorio;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PeliculaAlquiladaTest {

    private PeliculaAlquilada peliculaAlquilada;
    private Date fechaAlquiler;
    private Date fechaDevolucion;

    @BeforeEach
    void setUp() {
        // INICIALIZA UN OBJETO PELICULAALQUILADA ANTES DE CADA TEST
        fechaAlquiler = new Date();
        fechaDevolucion = new Date();
        peliculaAlquilada = new PeliculaAlquilada(1, 10, "usuarioEjemplo", fechaAlquiler, fechaDevolucion);
    }

    @Test
    void testConstructor() {
        // PRUEBA EL CONSTRUCTOR CON PARÁMETROS
        PeliculaAlquilada peliculaAlquiladaTest = new PeliculaAlquilada(1, 10, "usuarioEjemplo", fechaAlquiler, fechaDevolucion);
        assertEquals(1, peliculaAlquiladaTest.getIdPrestamo());
        assertEquals(10, peliculaAlquiladaTest.getIdPelicula());
        assertEquals("usuarioEjemplo", peliculaAlquiladaTest.getUsuario());
        assertEquals(fechaAlquiler, peliculaAlquiladaTest.getFechaAlquiler());
        assertEquals(fechaDevolucion, peliculaAlquiladaTest.getFechaDevolucion());
    }

    @Test
    void testSettersAndGetters() {
        // PRUEBAS PARA LOS SETTERS Y GETTERS
        peliculaAlquilada.setIdPrestamo(2);
        peliculaAlquilada.setIdPelicula(20);
        peliculaAlquilada.setUsuario("nuevoUsuario");
        Date nuevaFechaAlquiler = new Date();
        Date nuevaFechaDevolucion = new Date();
        peliculaAlquilada.setFechaAlquiler(nuevaFechaAlquiler);
        peliculaAlquilada.setFechaDevolucion(nuevaFechaDevolucion);

        assertEquals(2, peliculaAlquilada.getIdPrestamo());
        assertEquals(20, peliculaAlquilada.getIdPelicula());
        assertEquals("nuevoUsuario", peliculaAlquilada.getUsuario());
        assertEquals(nuevaFechaAlquiler, peliculaAlquilada.getFechaAlquiler());
        assertEquals(nuevaFechaDevolucion, peliculaAlquilada.getFechaDevolucion());
    }

    @Test
    void testToArray() {
        // PRUEBA PARA EL MÉTODO TOARRAY
        Object[] expectedArray = {1, 10, "usuarioEjemplo", fechaAlquiler, fechaDevolucion};
        assertArrayEquals(expectedArray, peliculaAlquilada.toArray());
    }

    @Test
    void testToPeliculaAlquilada() {
        // PRUEBA PARA EL MÉTODO ESTÁTICO TOPELICULAALQUILADA
        List<Object> datos = new ArrayList<>();
        datos.add(2);
        datos.add(20);
        datos.add("nuevoUsuario");
        datos.add(fechaAlquiler);
        datos.add(fechaDevolucion);

        PeliculaAlquilada peliculaFromList = PeliculaAlquilada.toPeliculaAlquilada(datos);
        assertEquals(2, peliculaFromList.getIdPrestamo());
        assertEquals(20, peliculaFromList.getIdPelicula());
        assertEquals("nuevoUsuario", peliculaFromList.getUsuario());
        assertEquals(fechaAlquiler, peliculaFromList.getFechaAlquiler());
        assertEquals(fechaDevolucion, peliculaFromList.getFechaDevolucion());
    }

    @Test
    void testGetColumnas() {
        // PRUEBA PARA EL MÉTODO ESTÁTICO GETCOLUMNAS
        List<String> columnas = PeliculaAlquilada.getColumnas();
        assertEquals(5, columnas.size());
        assertEquals("Id Préstamo", columnas.get(0));
        assertEquals("Id Película", columnas.get(1));
        assertEquals("Usuario", columnas.get(2));
        assertEquals("Fecha de Alquiler", columnas.get(3));
        assertEquals("Fecha de Devolucion", columnas.get(4));
    }
}
