package poo_unidad1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import model.SerieDeTV;

public class SerieTest {

    @Test
    public void testCrearSerie() {
        // Constructor: Título, Duración, Género, Temporadas
        SerieDeTV s = new SerieDeTV("Breaking Bad", 45, "Drama", 5);
        
        assertEquals("Breaking Bad", s.getTitulo());
        assertEquals(45, s.getDuracionEnMinutos());
        assertEquals("Drama", s.getGenero());
        assertEquals(5, s.getNumTemporadas());
    }
}