package Operadores;

import java.util.Scanner;

public class SistemaDescuentosVIP {

    public static void main(String[] args) {

        System.out.println("SISTEMA DE DESCUENTOS VIP");
        final var n_productos_des = 10;
        var consola = new Scanner(System.in);

        System.out.print("Cuantos productos compraste hoy?");
        var cantidadProductos = Integer.parseInt(consola.nextLine());

        System.out.print("Tienes membresia de la tiendad");
        var tieneMembrecia = Boolean.parseBoolean(consola.nextLine());

        var esElegibleDescuento = cantidadProductos >= n_productos_des && tieneMembrecia;

        System.out.print("Tienes Acceso al descuento VIP ? " + esElegibleDescuento);

    }

}
