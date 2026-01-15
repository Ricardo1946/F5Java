package SentenciaDeDecision;

import org.w3c.dom.ls.LSOutput;

/**
 * El ciclo for se utiliza para ejecutar repetitivamente un bloque
 * de codigo un numero especifico de veces.
 * Es especialemente util cuando se conoce de antemano cuantas veces
 * se debe repetir un accion.
 */

public class cicloFor {

    public static void main(String[] args) {

        System.out.println("***Ciclo For  ***");
        for (var contador = 1; contador <= 50; contador++){
            System.out.println(contador + " ");
        }
    }
}
