package SentenciaDeDecision;
    /*
    * Es la fomra de realziar una operacion if-else en una sola linea.
    * Este operador es especial util para asignar valores a variables basandose en una condicion.
    *           condiciones ? expresion1 : expresion2;
    *           Condicones: Es una expresion booleana que se evalua.
    *           expresion1: Es el valor que devuelv si la condicion es verdadera.
    *           Expresion2: Es el valor que se devuelve si la condion es falsa.
    */

public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("** Operador Ternario ***");
        //Sintaxis
        //Condicion ? exp1 : exp2


        //Determinar si un numero es Par o no
        var numero = 4;
        var resultado = (numero % 2 == 0 ) ? "Par": "Impar";
        System.out.println("El numero " + numero + "es " + resultado);

        //Calcular si es mayor de edad
        var edad = 19;
        var mensaje = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
        System.out.println("Tienes " + edad + ", " + mensaje);

        // Valor positivo, negativo o cero ( operador ternario animado)
        numero = 10;
        resultado = (numero > 0) ? "Positivo": (numero < 0 ) ? "Negativo" : " Cero";
        System.out.println("El numero " + numero + " es " + resultado);

    }
}
