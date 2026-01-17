package SentenciaDeDecision;

import java.util.Scanner;

public class DibujaTriangulo {
    public static void main(String[] args) {
        System.out.println("*** Dibuja un Triangulo ***");
        var consola = new Scanner(System.in);
        System.out.println("Proporciona el numero de files: ");
        var numeroFilas = consola.nextInt();

        //Iteramos sobre cada fila del triangulo
        for (var fila = 1; fila <= numeroFilas; fila++){
            var espaciosBlanco = " ".repeat(numeroFilas - fila);
            var asteriscos = "*".repeat(2 * fila - 1);
            System.out.println(espaciosBlanco + asteriscos);
        }
    }
}
