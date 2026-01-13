package SentenciaDeDecision;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class ValorPositivo {
    public static void main(String[] args) {
        System.out.println(" ** Valor positivo   **");

        var console = new Scanner(System.in);
        System.out.println("Proporciona un numero : ");
        var numero = Integer.parseInt(console.nextLine());

        if ( numero > 0){
            System.out.println("Es positivo");
        } else if ( numero < 0 ) {
            System.out.println(" Es negativo");
        } else {
            System.out.println(" es cero :  ");
        }
    }
}
