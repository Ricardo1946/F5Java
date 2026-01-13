package Operadores;

import java.util.Scanner;

/**
 * Calculo Area y Perimetro de un Rectangulo
 * Se solicita calcular el area y perimetro de un rectangulo aplicando las siguientes formulas:
 * base | altura
 * area = base * altura
 * perimero = 2 * (base + altura)
 */

public class AreaRectangulo {
    public static void main(String[] args) {

        var console = new Scanner(System.in);

        System.out.println(" Calculo del Area de un Rectangulo ");

        System.out.print("Ingrese la base: ");
        var base = Integer.parseInt(console.nextLine());

        System.out.print("Ingrese la altura: ");
        var altura = Integer.parseInt(console.nextLine());

        // Realizamos el calculo del area
        var areaRectangulo = base * altura;
        System.out.println("Area del rectangulo: " + areaRectangulo);

        //Realizamos el caluclo del perimeto
        var perimetro = 2 * (base + altura);
        System.out.println("Area del rectangulo: " + perimetro);
    }
}
