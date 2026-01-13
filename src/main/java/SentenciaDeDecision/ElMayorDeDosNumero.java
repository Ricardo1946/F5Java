package SentenciaDeDecision;

import java.util.Scanner;

/*
 * El mayor de 2 Numeros
 * Crear un programa para indicar cual es el mayor de dos numeros.
 * El programa debe pedir al usuario dos numero enteros
 * Posteriormente se deben comparar y mandar a imprimir el numero mayor.
 */
public class ElMayorDeDosNumero {

    public static void main(String[] args) {
        System.out.println("** Mayor de dos numeros ");
        var consola = new Scanner(System.in);

        System.out.println("Ingresa un numero principal : ");
        var numeroPrincipal = Integer.parseInt(consola.nextLine());

        System.out.println("Ingresa un numero secundario: ");
        var numeroSecundario = Integer.parseInt(consola.nextLine());

        if (numeroPrincipal > numeroSecundario) {
            System.out.println("El numero mayor es : " + numeroPrincipal);
        } else {
            System.out.println("El numero mayor es:  " + numeroSecundario);
        }
    }
}
