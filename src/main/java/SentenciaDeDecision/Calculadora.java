package SentenciaDeDecision;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        var salir = false;

        while(!salir){
            System.out.print("""
                    *** Calculadora en Java ***
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division 
                    5. Salir 
                    Escoge una opcion: \s""");

            var opcion = consola.nextInt();

            //Interacion con el menu dentro de una condicional
            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Dame el valor 1: ");
                var operando1 = consola.nextDouble();
                System.out.print("Dame el valor 2: ");
                var operando2 = consola.nextDouble();

                double resultado;

            switch (opcion){

                case 1 -> {
                    resultado = operando1 + operando2;
                    System.out.printf("Resultado suma: %.2f%n%n", resultado);
                }
                case 2 -> {
                    resultado = operando1 - operando2;
                    System.out.printf("Resultado resta: %.2f%n%n", resultado);
                }
                case 3 -> {
                    resultado = operando1 * operando2;
                    System.out.printf("Resultado multiplicacion: %.2f%n%n", resultado);
                }
                case 4 -> {
                    if (operando2 != 0) {
                        resultado = operando1 / operando2;
                        System.out.printf("Resultado division: %.2f%n%n", resultado);
                    } else
                        System.out.println("ERROR: Division entre cero.\n");
                }
                case 5 -> {
                    System.out.println("Saliendo del programa de Calculadora! ");
                    salir = true;
                }
                default -> System.out.println("Opcion invalida,"
                        + "selecciona otra opcion... \n ");
            }
            }
        }
    }
}
