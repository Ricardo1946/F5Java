package SentenciaDeDecision;

import java.util.Scanner;

/**
 * Sistema reseerva Hotel
 * Se solicita crear un sistema de reservacion de un hotel
 * Se debe pedir la siguiente informacion al usuario.
 *  - Nombre del cliente
 *  - Dias de estadia en el Hotel
 *  - Cuato con vista al mar?
 *  El hotel tiene las siguientes tarifas:
 *      - Cuarto sin vista al mar $ 150.50 por dia.
 *      - Cuarto con vista al mar $ 190.50 por dia.
 *
 *  El sistema debe calcular el costo total de la estadia,
 *  dependiendo si escogio un cuarto con vista al mar o no.
 *  Ademas  de indicar si escogio un cuarto con vista al mar o no.
 */

public class SistemReservaHotel {
    public static void main(String[] args) {

        System.out.println("** Sistema de reserva de hotel **");
        var consola = new Scanner(System.in);

        final var TARIFA_DIARIA_SIN_MAR = 150.50;
        final var TARIFA_DIARIA_CON_MAR = 190.50;


        System.out.println("Por favor, indicanos tu nombre : ");
        var nombre = new String(consola.nextLine());

        System.out.println("Por favor, indicanos los dias de estadia: ");
        var diasEstadia = Integer.parseInt(consola.nextLine());

        System.out.println("Con vista al mar (true/ false) ? ");
        var vistaAlmar = Boolean.parseBoolean(consola.nextLine());

        //cALCULO DE COSTO TOTAL DE LA ESTADIA
        var costoTotal = 0.0;

        if (vistaAlmar){
            costoTotal = diasEstadia * TARIFA_DIARIA_CON_MAR;
        } else {
            costoTotal = diasEstadia * TARIFA_DIARIA_SIN_MAR;

        }
        //Mostrar los detalles de la reserva.
        System.out.printf("""
                %n------ Detalles de la Reservacion ----------
                Cliente: %s
                Dias de estadias: %d
                Costo total: $%.2f
                Habitacion con vista al mar: %s
                """, nombre, diasEstadia, costoTotal, vistaAlmar ? "Si :)" : "No :(");
    }
}
