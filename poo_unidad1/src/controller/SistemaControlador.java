package controller;

import model.GestorArchivos;
import model.Pelicula;
import model.SerieDeTV;
import view.Menu;

import java.util.ArrayList;
import java.util.List;

public class SistemaControlador {
    private GestorArchivos gestorArchivos;
    private Menu menu;
    private List<Pelicula> peliculas;
    private List<SerieDeTV> series;

    public SistemaControlador() {
        this.gestorArchivos = new GestorArchivos();
        this.menu = new Menu();
        // Cargar datos existentes al iniciar el programa
        this.peliculas = gestorArchivos.cargarPeliculas();
        this.series = gestorArchivos.cargarSeries();
    }

    public void iniciar() {
        boolean continuar = true;
        while (continuar) {
            int opcion = menu.mostrarMenuPrincipal();
            switch (opcion) {
                case 1:
                    agregarPelicula();
                    break;
                case 2:
                    agregarSerie();
                    break;
                case 3:
                    listarPeliculas();
                    break;
                case 4:
                    listarSeries();
                    break;
                case 5:
                    guardarYSalir();
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private void agregarPelicula() {
        String titulo = menu.pedirDato("Título");
        int duracion = menu.pedirEntero("Duración (min)");
        String genero = menu.pedirDato("Género");
        String estudio = menu.pedirDato("Estudio");

        Pelicula p = new Pelicula(titulo, duracion, genero, estudio);
        peliculas.add(p);
        System.out.println("--- Película agregada correctamente ---");
    }

    private void agregarSerie() {
        String titulo = menu.pedirDato("Título");
        int duracion = menu.pedirEntero("Duración (min)");
        String genero = menu.pedirDato("Género");
        int temporadas = menu.pedirEntero("Num. Temporadas");

        SerieDeTV s = new SerieDeTV(titulo, duracion, genero, temporadas);
        series.add(s);
        System.out.println("--- Serie agregada correctamente ---");
    }

    private void listarPeliculas() {
        System.out.println("\n--- LISTA DE PELÍCULAS ---");
        for (Pelicula p : peliculas) {
            p.mostrarDetalles(); // Usa el método que ya tienes en tu modelo
            System.out.println("-----------------");
        }
    }
    
    private void listarSeries() {
        System.out.println("\n--- LISTA DE SERIES ---");
        for (SerieDeTV s : series) {
            s.mostrarDetalles();
            System.out.println("-----------------");
        }
    }

    private void guardarYSalir() {
        gestorArchivos.guardarPeliculas(peliculas);
        gestorArchivos.guardarSeries(series);
        System.out.println("Datos guardados. ¡Hasta luego!");
    }
}