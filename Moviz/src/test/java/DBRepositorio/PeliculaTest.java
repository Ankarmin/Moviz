package DBRepositorio;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PeliculaTest {

    private Pelicula pelicula;
    private FileInputStream imagenTest;

    @BeforeEach
    void setUp() {
        // INICIALIZA UN OBJETO PELICULA ANTES DE CADA TEST
        imagenTest = null; // PUEDE SER UN MOCK SI ES NECESARIO
        pelicula = new Pelicula(1, "Pelicula Ejemplo", 2022, "Acción", "120 min", 8, "Una película de acción", imagenTest);
    }

    @Test
    void testConstructor() {
        // PRUEBA EL CONSTRUCTOR CON PARÁMETROS
        Pelicula peliculaTest = new Pelicula(1, "Pelicula Ejemplo", 2022, "Acción", "120 min", 8, "Una película de acción", imagenTest);
        assertEquals(1, peliculaTest.getIdPelicula());
        assertEquals("Pelicula Ejemplo", peliculaTest.getNombre());
        assertEquals(2022, peliculaTest.getAnioEstreno());
        assertEquals("Acción", peliculaTest.getGenero());
        assertEquals("120 min", peliculaTest.getDuracion());
        assertEquals(8, peliculaTest.getPuntuacion());
        assertEquals("Una película de acción", peliculaTest.getSinopsis());
        assertEquals(imagenTest, peliculaTest.getImagen());
    }

    @Test
    void testSettersAndGetters() {
        // PRUEBAS PARA LOS SETTERS Y GETTERS
        pelicula.setIdPelicula(2);
        pelicula.setNombre("Nueva Película");
        pelicula.setAnioEstreno(2023);
        pelicula.setGenero("Drama");
        pelicula.setDuracion("130 min");
        pelicula.setPuntuacion(9);
        pelicula.setSinopsis("Una película dramática");
        pelicula.setImagen(null); // PRUEBA CON UNA IMAGEN NULL

        assertEquals(2, pelicula.getIdPelicula());
        assertEquals("Nueva Película", pelicula.getNombre());
        assertEquals(2023, pelicula.getAnioEstreno());
        assertEquals("Drama", pelicula.getGenero());
        assertEquals("130 min", pelicula.getDuracion());
        assertEquals(9, pelicula.getPuntuacion());
        assertEquals("Una película dramática", pelicula.getSinopsis());
        assertNull(pelicula.getImagen());
    }

    @Test
    void testToArray() {
        // PRUEBA PARA EL MÉTODO TOARRAY
        Object[] expectedArray = {1, "Pelicula Ejemplo", 2022, "Acción", "120 min", 8, "Una película de acción", imagenTest};
        assertArrayEquals(expectedArray, pelicula.toArray());
    }

    @Test
    void testToPelicula() {
        // PRUEBA PARA EL MÉTODO ESTÁTICO TOPELICULA
        List<Object> datos = new ArrayList<>();
        datos.add(2);
        datos.add("Otra Película");
        datos.add(2021);
        datos.add("Comedia");
        datos.add("90 min");
        datos.add(7);
        datos.add("Una película divertida");
        datos.add(null); // PRUEBA CON UNA IMAGEN NULL

        Pelicula peliculaFromList = Pelicula.toPelicula(datos);
        assertEquals(2, peliculaFromList.getIdPelicula());
        assertEquals("Otra Película", peliculaFromList.getNombre());
        assertEquals(2021, peliculaFromList.getAnioEstreno());
        assertEquals("Comedia", peliculaFromList.getGenero());
        assertEquals("90 min", peliculaFromList.getDuracion());
        assertEquals(7, peliculaFromList.getPuntuacion());
        assertEquals("Una película divertida", peliculaFromList.getSinopsis());
        assertNull(peliculaFromList.getImagen());
    }

    @Test
    void testGetColumnas() {
        // PRUEBA PARA EL MÉTODO ESTÁTICO GETCOLUMNAS
        List<String> columnas = Pelicula.getColumnas();
        assertEquals(8, columnas.size());
        assertEquals("Id Pelicula", columnas.get(0));
        assertEquals("Nombre", columnas.get(1));
        assertEquals("Año Estreno", columnas.get(2));
        assertEquals("Género", columnas.get(3));
        assertEquals("Duración", columnas.get(4));
        assertEquals("Puntuación", columnas.get(5));
        assertEquals("Sinopsis", columnas.get(6));
        assertEquals("Imagen", columnas.get(7));
    }
}
