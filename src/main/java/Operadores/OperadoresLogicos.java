package Operadores;

/*
 * Los operadores logicos evaluan dos valores logicos (boolean) y regresa
 * un valor logico (true / false)
 * && (and) regresa verdadero si ambos operadores son verdaderos
 * || (or) regresa verdadero si al menos uno de los operadores es verdadero
 * ! (not) regresa el valor contrario del operador
 */

public class OperadoresLogicos {

    public static void main(String[] args) {
        System.out.println("Operadores Logicos");

        boolean a = true;
        boolean b = false;

        var resultado = a && b;
        System.out.println("a && b = " + resultado);

        resultado = a || b;
        System.out.println("a || b = " + resultado);

        resultado = !a;
        System.out.println("!a = " + resultado);

        resultado = !b;
        System.out.println("!b = " + resultado);



    }
}
