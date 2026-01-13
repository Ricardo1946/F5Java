package SentenciaDeDecision;

import java.util.Scanner;

/**
 * Tienda Online
 * Crear un sistema que ofrezca descuentos dependiendo del monto de la compra, o si es miembro de la tienda.
 * Se deben  revisar las siguientes condiciones:
 * 1. Si ha comprado mas de $1.000 y es miembro -> Descuento de 10%
 * 2. Si solo es miembro de la tienda -> Descuento del 5%
 * 3. Si no es miembro ni compro mas de $1.000 -> Descuento del 0%.
 */

public class TiendaLineaDesc {
    public static void main(String[] args) {

        final var MONTO_COMPRA_DESC = 1000.00;

        var consola = new Scanner(System.in);
        System.out.println("Tienda en linea con Descuentos ");

        System.out.println(" Cual fue el monto de tu compra: ");
        var montoCompra = Double.parseDouble(consola.nextLine());

        System.out.println("Eres miembro de la tienda (true/false) ?");
        var eresMiembro = Boolean.parseBoolean(consola.nextLine());

        var descuento = 0.0;

        if (montoCompra >= MONTO_COMPRA_DESC && eresMiembro) {
            descuento = 0.1;
        } else if (eresMiembro) {
            descuento = 0.5;
        } else {
            descuento = 0;
        }
        // Hacemos los calculos respectivos para obtener el monoto final.
        if (descuento != 0) {
            var montoDescuento = montoCompra * descuento;
            var montoFinal = montoCompra - montoDescuento;

            System.out.printf("""
                    %nFelicidades! , has obtenido un descuento del  %.0f%
                    Monto de la compra: $%2.f
                    Monto del descuento: $%.2f
                    Monto final de la compra con descuento: $%.2f%n 
                    """, descuento * 100, montoCompra, montoDescuento, montoFinal);
        } else {
            System.out.printf("""
                    %nNo obtuviste ningun tipo de descuento.
                    Te invitamos a hacerle miembro de la tienda!
                    Monto final de la compra: $%.2f%
                    """, montoCompra);
        }
    }
}
