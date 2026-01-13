package tipoDeDatos;

import java.util.Random;

public class numeroAleatorios {
    public static void main(String[] args) {
        System.out.println("**Numero Aleatorios**");
        var random = new Random();

        //Gnera un numero Aleatorio entre 0 a 9
        var numeroAleatorio = random.nextInt(10);
        System.out.println("el numeroAleatorio esta entre 0 y 9 = " + numeroAleatorio);

        //Generar un numero aleatorio entre 1 y 10
        numeroAleatorio = random.nextInt(10) + 1;
        System.out.println("numeroAleatorio entre 1 y 10 = " + numeroAleatorio);

        //Generar un numero flotante entre 0.0 y 1.0
        var flotanteAleatorio = random.nextFloat();
        System.out.println("flotanteAleatorio = " + flotanteAleatorio);

        //Simular el lanzamiento de un dado (1-6)
        var dado = random.nextInt(6) + 1;
        System.out.println("El resultado de lanzar el dado es = " + dado);
    }
}
