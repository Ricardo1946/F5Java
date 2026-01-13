package Operadores;

import java.util.Scanner;

public class RangoDeUnaVariable {
    public static void main(String[] args) {
        var console = new Scanner(System.in);

        System.out.println("Porporciona un dato entero: ");
        var dato = Integer.parseInt(console.nextLine());

        //Revisamos si esta dentro de rango (entre 1 y 10)
        var estaDentro = dato >=1 && dato <= 10;
        System.out.println("Variable dentro de un rango (1 y 10) ?" + estaDentro);

        var estaFuera = !(dato > 1 && dato <= 10);
        System.out.println("Variable fuera de rango (1 y 10)? " + estaFuera);
    }
}
