package Operadores;

public class OepradorAritmeticos {

    public static void main(String[] args) {

        //Suma
        int valorAritmetico = 10;
        int valorAritmetico2 = 5;
        int resultado;
        resultado = valorAritmetico + valorAritmetico2;
        System.out.println("Resultado de la suma: " + resultado);

        //Resta
        int resultado2 = valorAritmetico - valorAritmetico2;
        System.out.println("Resultado de la resta: " + resultado2);

        //multiplicacion
        resultado = valorAritmetico * valorAritmetico2;
        System.out.println("Resultado de la multiplicacion: " + resultado);

        //division
        resultado = valorAritmetico / valorAritmetico2;
        System.out.println("Resultado de la division: " + resultado);

        // Modulo (residuo division)
        resultado = valorAritmetico % valorAritmetico2;
        System.out.println("Resultado del modulo: " + resultado);



    }
}
