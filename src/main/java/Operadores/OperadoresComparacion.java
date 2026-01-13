package Operadores;

/**
 * Los operadores de comparacion tambien conocidos como operadores
 * relacionales nos permiten comparar dos valores y devuelve un valor
 * booleano (true o false) dependiendo del resultado de la comparacion.
 *
 * = = igual a compara si dos valores son iguales
 * != distinto a comparar si dos valores son diferentes
 *  > mayor que compara si un valor es mayor que otro
 *  >= mayor o igual que compara si un valor es mayor o igual que otro
 *  < menor que compara si un valor es menor que otro
 *  <= menor o igual que compara si un valor es menor o igual que otro
 */

public class OperadoresComparacion {
    public static void main(String[] args) {

        System.out.println("Operadores de comparacion / relacionales: ");
        int a = 10;
        int b = 5;

        //igualdad
        System.out.println("a == b: " + (a == b)); //false

        //distinto
        System.out.println("a != b: " + (a != b)); //true

        //mayor que
        System.out.println("a > b: " + (a > b)); //true

        //mayor o igual que
        System.out.println("a >= b: " + (a >= b)); //true

        //menor que
        System.out.println("a < b: " + (a < b)); //false

        //menor o igual que
        System.out.println("a <= b: " + (a <= b)); //false
    }
}
