package SentenciaDeDecision;

/*
 * Sistema de envios
 * Crea un programa para determinar el costo de envio de un paquete segun el destino (nacional o internacional ) y el pero del paquete.
 * paquete:
 *          costo tarifas : nacional = 10 x milla
 *                          Internacional = 20 x kilo
 * El programa debe solicitar 2 valores:
 *  1. Destino (nacional o internacional
 *  2. Peso (kilogramo) del paquete.
 * Al final debe imprimir el costo de envio del paquete.
 *
 *   Metodo strip = ayuda a quitar metodos en blanco de principio a fin
 *   Metodo toLowerCase = ayuda a obtener la informacion en minuscula.
 *
 */

import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {

        System.out.println("*** Sistema de envios *** ");

        //Definimos las tarifas de envio por kg
        final var TARIFA_NACIONAL = 10.0;
        final var TARIFA_INTERNACIONAL = 20.0;

        //Solicitamos los valores de destino y peso
        var consola = new Scanner(System.in);

        System.out.print("Ingresa el destino del paquete (nacional / internacional): ");
        var destino = consola.nextLine().strip().toLowerCase();

        System.out.print("Ingresa el peso del paquete ( en kg): ");
        var peso = Double.parseDouble(consola.nextLine());

        //Calculo del envio del paquete.
        Double costoEnvio = switch (destino) {
            case "nacional" -> peso * TARIFA_NACIONAL;
            case "Internacional" -> peso * TARIFA_INTERNACIONAL;
            default -> {
                System.out.println("Destino invalido. Ingresa nacional/internacional");
                yield null;
            }
        };

        //Mostramos el costo de envio
        if (costoEnvio != null ) {
            System.out.printf("El costo de envio de paquete es: $%.2f", costoEnvio);
        }





    }
}
