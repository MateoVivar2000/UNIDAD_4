package poo_unidad1;

import static org.junit.Assert.*;
import org.junit.Test;
import model.Pelicula;

public class PeliculaTest {

    @Test
    public void testCrearPelicula() {
        // Probamos que el constructor asigne bien los valores
        Pelicula p = new Pelicula("Titanic", 195, "Romance", "Paramount");
        
        assertEquals("Titanic", p.getTitulo());
        assertEquals(195, p.getDuracionEnMinutos());
        assertEquals("Romance", p.getGenero());
        assertEquals("Paramount", p.getEstudio());
    }
}