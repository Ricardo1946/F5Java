package Operadores;

/**
 * Los oeradores de asignacion se utilizan para asignar valores a variables.
 *  = Asingacion simple
 *  += Asignacion con suma
 *  -= Asignacion con resta
 *  *= Asignacion con multiplicacion
 *  /= Asignacion con division
 *  %= Asignacion con modulo
 */

public class OperadorDeAsignacion {

    public static void main(String[] args) {
        int a = 10; // Asignacion simple
        System.out.println("Valor inicial de a: " + a);

        a += 5; // Asignacion con suma el valor de a es ahora 15
        System.out.println("Despues de a += 5: " + a);

        a -= 3; // Asignacion con resta el valor de a es ahora 12
        System.out.println("Despues de a -= 3: " + a);

        a *= 2; // Asignacion con multiplicacion el valor de a es ahora 24
        System.out.println("Despues de a *= 2: " + a);

        a /= 4; // Asignacion con division  el valor de a es ahora 6
        System.out.println("Despues de a /= 4: " + a);

        a %= 3; // Asignacion con modulo el valor de a es ahora 0
        System.out.println("Despues de a %= 3: " + a);

        //asignaciones multiples variables
        int tt = 10, b = 15, c = 20;
        System.out.printf("a = %d, b = %d, c = %d%n", tt, b, c);

    }
}
