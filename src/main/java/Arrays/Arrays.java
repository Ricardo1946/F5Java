package Arrays;

public class Arrays {
    public static void main(String[] args) {

        //Array

        //forma 1:
        //int[] enteros = {100, 200, 300,400, 500};
        //forma 2:
        var enteros = new int[] {100, 200, 300, 400, 500};
        /**
        System.out.println("Primer elementos del array: " + enteros[0]);
        System.out.println("Segundo elementos del array: " + enteros[1]);
        System.out.println("Tercer elementos del array: " + enteros[3]);
        System.out.println("Cuarto elementos del array: " + enteros[4]);

        System.out.println("Imprimir enteror: " + enteros); **/
        //forma 3 for:
        for (int i = 0; i < enteros.length; i++) {
            System.out.println("valor del indice:  " + i + " = " + enteros[i]);
        }
    }
}
