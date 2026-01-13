package Operadores;

import java.util.Scanner;

/**
 * Sistema Prestamos de Libros
 * Se pide crear un sistema para una biblioteca, lo cual desea prestar libros si cumple,
 * con cualquiera de la siguiente condiciones:
 * - El usuario tiene credencial de estudiante.
 * - El usuario vive a no mas de 3 km a la redonda.
 * SI cumple con cualquiera de estas condicionales se le puede prestar el libro.
 */
public class PrestamoLibros {

    public static void main(String[] args) {

        System.out.println(" Systema Prestamos de Libros  ");

        final var DISTANCIA_KM = 3;
        var consola = new Scanner(System.in);

        System.out.print("Cuentas con credencial de estudiante (true/false)? ");
        var tienesCredencial = Boolean.parseBoolean(consola.nextLine());

        System.out.println("A cuantos kilometros vives de la biblioteca? ");
        var distanciaBilbiotecaKm = Integer.parseInt(consola.nextLine());

        var eseElegiblePrestamos = tienesCredencial || distanciaBilbiotecaKm <= DISTANCIA_KM;

        System.out.println("Eres elegible para prestamo de libros? " + eseElegiblePrestamos);
    }
}
