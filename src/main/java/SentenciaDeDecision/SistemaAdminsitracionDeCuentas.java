package SentenciaDeDecision;

import java.util.Scanner;

public class SistemaAdminsitracionDeCuentas {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir = false;

        //Comenzar con la iteracion del menu
        while(!salir){
            System.out.println("""
                    *** Sistema de adminsitracion de Cuentas ***
                    Menu: 
                    1. Crear cuenta
                    2. Eliminar cuenta
                    3. Salir
                    Escoje una opcion:\s
                    """);
            var opcion = consola.nextInt();
            // Evaluar cada opcion
            switch (opcion){
                case 1 -> System.out.println("Creando tu cuenta ...\n");
                case 2 -> System.out.println("Eliminado una cuenta  ...\n");
                case 3 -> {
                    System.out.println("Saliendo del sistema. Hasta pronto!");
                    salir = true;
                }
                default -> System.out.println("Opcion invalida .. \n");
            }
        }
        System.out.println("Fin del sistema de Adminsitracion de Cuentas. ");
    }
}
