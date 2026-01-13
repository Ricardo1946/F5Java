package SentenciaDeDecision;
/*
 * BanK System
 * Considerano que estamos dentro de un sistema bancario, se solicita preguntar al usuario si desea continuar dentro del sistema.
 * Utilziando el operador not (!) para aplicar las siguientes condiciones.
 * Si no deseamos salir del sistema, imprimir continuamos dentro del sistema.
 */

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        System.out.println("** Systema Bancario **");

        System.out.print(" Desea salir del sistema (True/False)? ");
        var salirSistema = Boolean.parseBoolean(consola.nextLine());

        //Verificamos (aplicando una logica inversa)
        if(!salirSistema){
            System.out.println("Continuamos dentro del sistema ..");
        } else {
            System.out.println(" Saliendo del sistema ");
        }


    }

}
