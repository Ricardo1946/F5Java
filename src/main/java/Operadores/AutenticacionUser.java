package Operadores;

import java.util.Scanner;

/**
 * Ssitema de autenticacion
 * Crear un programa para validar el usuario y passwork proporcionando por el usuario.
 * Crea 2 constantes con los calores correctos y prosteriormente compara que el usuario y passwork proporcionados por el
 * usuario sean validos.
 * Debe solicitar el usuario y el passwork al usuario y si son iguales que los valores correctos almacenarlos en las constantes
 * debe imprimir true. De lo contrario debe imprimir false.
 */

public class AutenticacionUser {
    public static void main(String[] args) {

        final var usuarioValido = "Admin";
        final var passwordValido = "Bogota*2..";


        var console = new Scanner(System.in);
        System.out.println(" Sistema de autenticacion ");

        System.out.print("Cual es tu usuario :");
        var usuarioIngresado = console.nextLine();

        System.out.print("Cual es tu passwork? :");
        var passworkIngresado = console.nextLine();

        var sonDatosCorrectos = usuarioIngresado .equals(usuarioValido) && passworkIngresado.equals(passwordValido);
        System.out.println("Los datos son correctos: " + sonDatosCorrectos);
    }
}
