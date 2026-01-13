package Operadores;

public class PrecedenciaOperadores {
    public static void main(String[] args) {
        //Precedencia de operadores en Java
        // 1. Parentesis y corchetes
        // 2. operadores unarios -, ++, --
        // 3. Operadores aritmeticos *, / y %
        // 4. Operadores aritmeticos + y -
        // 5. Relacionales <. <=, >, >=
        // 6. Equivalencia == y !=
        // 7. Logicos && y ||
        // 8. Asignacion =, +=, -= *=, etc

        //Expresion
        // paso 1. Division 12 / 3 = 4
        // paso 2. Multiplicacion 2 * 3 = 6
        // paso 3. Suma 4 + 6 = 10
        // paso 4. Resta 10 - 1 = 9
        var a = 12 / 3 + 2 * 3 - 1;
        System.out.println(" a = " + a);
    }
}
