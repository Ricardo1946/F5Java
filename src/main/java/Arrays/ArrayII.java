package Arrays;

import java.util.Scanner;

public class ArrayII {
    public static void main(String[] args) {

        //Introducir los valores por el User
        var console = new Scanner(System.in);
        //Declaracion del arreglo
        System.out.println("Proporciona el largo del arreglo: ");
        var largoArreglo = Integer.parseInt(console.nextLine());
        //Creamos de manera dinamica el arreglo
        var enteros = new int[largoArreglo];
        //Solicitar los valores del arreglo
        for (var i=0; i < largoArreglo; i++){
            System.out.print("Proporciona enteros[" + i + "] = ");
            enteros[i] = Integer.parseInt(console.nextLine());
        }
        System.out.println("\nImpresion del arreglo");
        for (var i = 0; i < largoArreglo; i++)
            System.out.println("enteros[" + i + "] = " + enteros[i]);
        //Imprimir los valores del arreglo
    }
}
