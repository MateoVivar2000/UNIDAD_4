package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Asegúrate de que Pelicula y SerieDeTV estén en el paquete model, 
// si no, eclipse te pedirá importarlas.

public class GestorArchivos {

    // Nombres de los archivos
    private static final String ARCHIVO_PELICULAS = "peliculas.csv";
    private static final String ARCHIVO_SERIES = "series.csv";

    // ==========================================
    // SECCIÓN DE PELÍCULAS
    // ==========================================
    
    public void guardarPeliculas(List<Pelicula> listaPeliculas) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(ARCHIVO_PELICULAS, false))) {
            for (Pelicula p : listaPeliculas) {
                // Formato: Título, Duración, Género, Estudio
                pw.println(p.getTitulo() + "," + 
                           p.getDuracionEnMinutos() + "," + 
                           p.getGenero() + "," + 
                           p.getEstudio());
            }
            System.out.println("Películas guardadas en " + ARCHIVO_PELICULAS);
        } catch (IOException e) {
            System.err.println("Error al guardar películas: " + e.getMessage());
        }
    }

    public List<Pelicula> cargarPeliculas() {
        List<Pelicula> lista = new ArrayList<>();
        File archivo = new File(ARCHIVO_PELICULAS);

        if (!archivo.exists()) return lista;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length >= 4) {
                    String titulo = datos[0];
                    int duracion = Integer.parseInt(datos[1].trim());
                    String genero = datos[2];
                    String estudio = datos[3];

                    Pelicula p = new Pelicula(titulo, duracion, genero, estudio);
                    lista.add(p);
                }
            }
        } catch (Exception e) {
            System.err.println("Error al cargar películas: " + e.getMessage());
        }
        return lista;
    }

    // ==========================================
    // SECCIÓN DE SERIES
    // ==========================================

    public void guardarSeries(List<SerieDeTV> listaSeries) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(ARCHIVO_SERIES, false))) {
            for (SerieDeTV s : listaSeries) {
                // Formato: Título, Duración, Género, NumTemporadas
                pw.println(s.getTitulo() + "," + 
                           s.getDuracionEnMinutos() + "," + 
                           s.getGenero() + "," + 
                           s.getNumTemporadas());
            }
            System.out.println("Series guardadas en " + ARCHIVO_SERIES);
        } catch (IOException e) {
            System.err.println("Error al guardar series: " + e.getMessage());
        }
    }

    public List<SerieDeTV> cargarSeries() {
        List<SerieDeTV> lista = new ArrayList<>();
        File archivo = new File(ARCHIVO_SERIES);

        if (!archivo.exists()) return lista;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length >= 4) {
                    String titulo = datos[0];
                    int duracion = Integer.parseInt(datos[1].trim());
                    String genero = datos[2];
                    int numTemporadas = Integer.parseInt(datos[3].trim());

                    SerieDeTV s = new SerieDeTV(titulo, duracion, genero, numTemporadas);
                    lista.add(s);
                }
            }
        } catch (Exception e) {
            System.err.println("Error al cargar series: " + e.getMessage());
        }
        return lista;
    }
}