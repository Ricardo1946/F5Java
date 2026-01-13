package SentenciaDeDecision;
/*
* Casa de los espejos
* Supon que estas en un parque de diversiones y quieres entrar a la casa de los espejos.
* Sin embargo debes cumplir con algunas condicoines:
* 1. Debes tener mas de 10 años.
* 2. No debe darte miedo la oscuridad.
* Si se cumplen las condiciones anteriores puedes entrar.
* Para realziar este ejemplo vamos a utilizar el operador not para aplicar una logica Inversa.
 */

import java.util.Scanner;

public class CasaEspejos {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        System.out.println("** La casa de los espejos ");

        System.out.println("Cual es tu edad ? ");
        var edad = Integer.parseInt(consola.nextLine());

        System.out.println("Tienes miedo a la oscuridad? ");
        var tienesMiedoOscuridad = Boolean.parseBoolean(consola.nextLine());

        //Verificacion
        if ( !tienesMiedoOscuridad && edad >= 10){
            System.out.println("Puedes entrar a la casa de los espejos");
        } else {
            System.out.println("Lo siendo, No puedes entrar a la casa de los espejos ");
        }
    }
}
