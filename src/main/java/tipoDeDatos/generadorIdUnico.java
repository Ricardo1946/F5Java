package tipoDeDatos;

import java.util.Random;
import java.util.Scanner;

/**
 * En java, String.trim() es un metodo que devuelve una nueva cadena
 * eliminado todos los espacios en blanco.(espacios, tabulaciones, saltos de linea)
 * del principio y del final de la cadena original.
 * toUpperCase() es un metodo de la clase String que convierte todos los caracteres de
 * una cadena a mayusculas devolviendo una nueva cadena;
 * El metodo subString en Java se usa para extraer una parte (subcadena) de un string,
 * creando una nueva cadena sin modificar la original.
 *
 */

public class generadorIdUnico {
    public static void main(String[] args) {
        System.out.println("--- Generador de ID Unico ---");
        var consola  = new Scanner (System.in);
        var aleatorio = new Random();

        //Solicitamos nombre del usuario
        System.out.print("Cual es el nombre? ");
        var nombre = consola.nextLine();

        //Solicitamos el apellido
        System.out.print("Cual es el apellido?");
        var apellido = consola.nextLine();

        //Solicitamos el año de nacimiento
        System.out.print("Cual es tu año de nacimiento (YYYY)? ");
        var anioNacimiento = consola.nextLine();

        //Normalizar los valores
        var nombre2 = nombre.trim().toUpperCase().substring(0, 3);
        var apellido2 = apellido.trim().toUpperCase().substring(0, 2);
        var anioNacimiento2 = anioNacimiento.trim().substring(2);

        //Gnenerar  el valor aleatorio (1 y 9999)
        var numeroAleatorio = aleatorio.nextInt(9999) + 1;

        //Formato  de 4 digitos
        var numeroAleatorioFormato = String.format("%04d", numeroAleatorio);

        //Generar el ID unico
        var idUnico = nombre2 + apellido2 + anioNacimiento2 + numeroAleatorioFormato;

        //Imprimir el ID unico
        System.out.printf("""
                %nHola %s,
                \tTu nuevo numero de identificacion  (id) generado por el sistema es:
                \t%s 
                \t¡Felicidades!
                """, nombre, idUnico);


    }
}
