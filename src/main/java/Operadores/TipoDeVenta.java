package Operadores;

import java.util.Scanner;

/**
 * Generacion de Venta
 * Supongamos que compramos varios articulos en el supermercado y queremos obtener el ticket de venta
 * total incluyendo impuestos
 *
 * El sistema solicitara el precio de cada producto a comprar y el usuario debera indicar su precio
 * (valor  de tipo con punto decimal)
 * El sistema debe realizar la suma de cada producto, calcular el impuesto y finalmente
 * imprimir el total de la compra.
 */


public class TipoDeVenta {

    public static void main(String[] args) {

        System.out.println(" Generacion de ticket de venta Desayunos: ");
        var console = new Scanner(System.in);

        System.out.print("Precio de la leche: ");
        var precioLeche = Double.parseDouble(console.nextLine());

        System.out.print("Precio del Pan: ");
        var precioPan = Double.parseDouble(console.nextLine());

        System.out.print("Precio de la panela: ");
        var precioPanela = Double.parseDouble(console.nextLine());

        System.out.print("Precio de los huevos: ");
        var precioHuevos = Double.parseDouble(console.nextLine());

        System.out.print("Precio de la tomate: ");
         var precioTomate = Double.parseDouble(console.nextLine());

        System.out.print("Precio de la cebolla: ");
        var precioCebolla = Double.parseDouble(console.nextLine());

        System.out.print("Precio de la aceite: ");
        var precioAceite = Double.parseDouble(console.nextLine());

        // Calculo del subtotal (sin impuestos)
        var subtotal = precioLeche + precioPan + precioPanela + precioHuevos
                + precioTomate + precioCebolla + precioAceite;

        //Calculo con impuestos (16%)
        var impuestos  = subtotal * 0.16;

        //Calculo total de la compra (con impuestos)
        var costoTotalCompra = subtotal + impuestos;

        //Imprimir el tiket de venta
        System.out.printf("""
                %nTicket de venta 
                ---------------------------
                Subtotal:  $%.2f
                Impuesto (16%%): $%.2f
                Costo total de la compra: $%.2f
                """, subtotal, impuestos, costoTotalCompra);










    }
}
