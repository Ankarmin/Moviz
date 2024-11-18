package repositorio;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class PeliculaFavoritaTest {

    @Test
    void testConstructorAndGetters() {
        PeliculaFavorita peliculaFavorita = new PeliculaFavorita(1, 101, 1001);
        assertEquals(1, peliculaFavorita.getIdPeliculaFavorita());
        assertEquals(101, peliculaFavorita.getIdPelicula());
        assertEquals(1001, peliculaFavorita.getIdUsuario());
    }

    @Test
    void testSettersAndGetters() {
        PeliculaFavorita peliculaFavorita = new PeliculaFavorita();
        peliculaFavorita.setIdPeliculaFavorita(2);
        peliculaFavorita.setIdPelicula(202);
        peliculaFavorita.setIdUsuario(2002);
        assertEquals(2, peliculaFavorita.getIdPeliculaFavorita());
        assertEquals(202, peliculaFavorita.getIdPelicula());
        assertEquals(2002, peliculaFavorita.getIdUsuario());
    }

    @Test
    void testToArray() {
        PeliculaFavorita peliculaFavorita = new PeliculaFavorita(3, 303, 3003);
        Object[] expectedArray = {3, 303, 3003};
        assertArrayEquals(expectedArray, peliculaFavorita.toArray());
    }

    @Test
    void testToCliente() {
        List<Object> datos = new ArrayList<>();
        datos.add(4);
        datos.add(404);
        datos.add(4004);
        PeliculaFavorita peliculaFavorita = PeliculaFavorita.toCliente(datos);
        assertEquals(4, peliculaFavorita.getIdPeliculaFavorita());
        assertEquals(404, peliculaFavorita.getIdPelicula());
        assertEquals(4004, peliculaFavorita.getIdUsuario());
    }

    @Test
    void testGetColumnas() {
        List<String> expectedColumns = new ArrayList<>();
        expectedColumns.add("Id Pelicula Favorita");
        expectedColumns.add("Id Pelicula");
        expectedColumns.add("Id Usuario");
        assertEquals(expectedColumns, PeliculaFavorita.getColumnas());
    }
}
