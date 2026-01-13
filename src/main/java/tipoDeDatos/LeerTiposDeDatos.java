package tipoDeDatos;

import java.util.Scanner;

public class LeerTiposDeDatos {

    public static void main(String[] args) {

        //Tipos de datos primitivos en Java
        var consola = new Scanner(System.in);
        System.out.println("Ingresa su edad: ");
        var edad = consola.nextInt();
        System.out.println("Edad = " + edad);
        //Leer un tipo double
        System.out.println("Ingresa tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("Altura = " + altura);
        //Consumimos el caracter de salto de linea
        consola.nextLine();
        //leer un tipo String
        System.out.println("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("Nombre = " + nombre);

        //conversion de datos
        System.out.println("Proporciona un valor entero: ");
        //var enteroString = consola.nextLine();
        //var entero = Integer.parseInt(enteroString);
        var entero = Integer.parseInt(consola.nextLine());
        System.out.println("Entero = " + entero);

        //Tipo flotante
        System.out.println("Proporciona un valor flotante: ");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("Flotante = " + flotante);
    }

}
