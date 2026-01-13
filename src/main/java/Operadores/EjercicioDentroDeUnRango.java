package Operadores;

import java.util.Scanner;

public class EjercicioDentroDeUnRango {

    public static void main(String[] args) {
        final var MINIMO = 0;
        final var MAXIMO = 5;

        //SOLICITAR UN NÚMERO
        System.out.print("Porporciona un dato entre 0 y 5: ");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine());
        // verificar si el dato esta dentro del rango
        var estaDentroDelRango = dato >= MINIMO && dato <= MAXIMO;
        System.out.println("estaDentroRango?  " + estaDentroDelRango);

    }
}
