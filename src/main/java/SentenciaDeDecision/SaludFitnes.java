package SentenciaDeDecision;
/*
 * Aplicacion de salud y fitnes:
 *  Se solicita que la applicacion de salud y fitnes que solicite los siguiente:
 *  - Nombre del usuario
 *  - Pasos caminados en el dia
 * Adeas definiremos las siguientes constantes:
 *  - META_PASOS_DIARIO = 10000
 *  - CALORIAS_POR_PASO = 0.04 //valor aproximado en kilocalorias
 *
 * Con los valores anteiores debemos calcualr las calorias, quemada segun los pasos caminados
 * calorias_quemadas = pasos_diarios * CALORIAS_POR_PASO
 * y verificaremos si se cumpli la meta de pasos a diario
 * meta_alcanzada = pasos_diarios >= META_PASOS_DIARIO
 */

import java.util.Scanner;

public class SaludFitnes {
    public static void main(String[] args) {

        System.out.println("** Salud y Fitnes ***");

        // Constantes
        final var META_PASOS_DIARIO = 10000;
        final var CALORIAS_POR_PASO = 0.4;

        //Pedimos los valores al usuairo
        var consola = new Scanner(System.in);

        System.out.println("Cual es tu nombre: ");
        var nombreUsuario = consola.nextLine();

        System.out.println("Cuantos pasos has caminado hoy ? ");
        var pasosDiarios = Integer.parseInt(consola.nextLine());

        //Verificar si el usuario alcanzo la meta de pasos diarios
        var metaAlcanzada = (pasosDiarios >= META_PASOS_DIARIO) ? "Si: :)" : "No .(";

        //Calculamos las calorias quemadas
        var caroliasQuemada = pasosDiarios * CALORIAS_POR_PASO;

        //Mostramos la informacion
        System.out.printf("""
                %nUsuario: %s
                Pasos dados hoy: %d
                Calorias quemadas: %.2f kcal
                Meta de pasos diarios alcanzada: %s
                -----------------------------------
                La meta de pasos diarios es de: %d pasos
                """, nombreUsuario, pasosDiarios, caroliasQuemada, metaAlcanzada, META_PASOS_DIARIO);

    }
}
