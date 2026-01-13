package Operadores;

/**
 * Los operadores unarios se aplican a un solo operador
 *  + Operador unario positivo
 *  - Operador unario negativo
 *   ++ Operador unario de incremento
 *   -- Operador unario de decremento
 *   ! Operador de negacion logica
 *   ~ Operador de negacion bit a bit
 *   @author David Ricardo
 */

public class OperadoresUnarios {

    public static void main(String[] args) {
        System.out.println("Operador unarios: ");

        int operadorUnario = 5;
        int operadorUnario2 = -4;
        int resultado;

        var c = true;

        //Operador Unario positivo
        resultado = +operadorUnario;
        System.out.println("Operador unario positivo: " + resultado);

        //Operador Unario negativo
        resultado = -operadorUnario2;
        System.out.println("Operador unario negativo: " + resultado);

        //Operador unario de incremento
        resultado = ++operadorUnario;
        System.out.println("Operador unario de incremento: " + resultado);

        //Operadror unario de decremento
        resultado = --operadorUnario2;
        System.out.println("Operador unario de decremento: " + resultado);


    }
}
