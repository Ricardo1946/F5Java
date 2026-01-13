package tipoDeDatos;

import java.util.Scanner;

public class recetaDeCocina {
    public static void main(String[] args) {

        System.out.println("** Receta de cocina **");

        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, ingrese el nombre de la receta:");
        String nombreReceta = input.nextLine();
        System.out.println("Ingrese el número de ingredientes principales:");
        String ingredientesPrincipales = input.nextLine();
        System.out.println("Ingrese el tiempo de preparación (en minutos):");
        String tiempoPreparacion = input.nextLine();
        System.out.println("Ingrese el nivel de dificultad (fácil, medio, difícil):");
        String nivelDificultad = input.nextLine();
        System.out.println("Ingrese el número de porciones:");
        String numeroPorciones = input.nextLine();
        System.out.println("\n--- Resumen de la Receta ---");

        System.out.println("Nombre de la receta: " + nombreReceta);
        System.out.println("Ingredientes principales: " + ingredientesPrincipales);
        System.out.println("Tiempo de preparación: " + tiempoPreparacion + " minutos");
        System.out.println("Nivel de dificultad: " + nivelDificultad);
        System.out.println("Número de porciones: " + numeroPorciones);
        input.close();
    }
}
