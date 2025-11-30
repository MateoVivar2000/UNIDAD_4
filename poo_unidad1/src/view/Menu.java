package view;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    // Muestra las opciones
    public int mostrarMenuPrincipal() {
        System.out.println("\n=== GESTOR DE CONTENIDOS AUDIOVISUALES ===");
        System.out.println("1. Agregar Película");
        System.out.println("2. Agregar Serie");
        System.out.println("3. Listar Películas");
        System.out.println("4. Listar Series");
        System.out.println("5. Guardar y Salir");
        System.out.print("Seleccione una opción: ");
        return leerEntero();
    }

    // Métodos auxiliares para pedir datos
    public String pedirDato(String mensaje) {
        System.out.print(mensaje + ": ");
        return scanner.nextLine();
    }

    public int pedirEntero(String mensaje) {
        System.out.print(mensaje + ": ");
        return leerEntero();
    }

    private int leerEntero() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingrese un número válido.");
            return -1;
        }
    }
}