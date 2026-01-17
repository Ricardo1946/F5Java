package SentenciaDeDecision;

public class PalabraBreakContinue {
    public static void main(String[] args) {
        System.out.println("*** break y continua ***");

        //Ejemplo break, imprimir solo el primer numero par
        for (var numero = 1; numero < 10; numero++){
            if(numero % 2 == 0){
                System.out.println(numero + "");
                break;
            }
        }
        //Ejemplo con continua. Imprimir solo numeros pares, ignorar impares
        System.out.println("\nPalabra continue: ");
        for (var numero = 1; numero < 10; numero++){
            if (numero % 2 == 1) {
                continue;
            }
            System.out.print(numero);
        }
    }
}
