package SentenciaDeDecision;

import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {

        System.out.println("Sistema de Autenticacion **");
        final var USUARIO_VALIDO = "admin";
        final var PASSWORK_VALIDO = "123456";

        var consola = new Scanner(System.in);

        System.out.println("Ingrese tu usuario : ");
        var usuario = consola.nextLine();

        System.out.println("Ingrese tu passwork: ");
        var password = consola.nextLine().strip();

        //Cada caso de validacion de usuario y password
        var mensajeAutenticacion = switch (usuario){
            case USUARIO_VALIDO ->  {
                if (PASSWORK_VALIDO.equals(password))
                    yield "Bienvenido al sistema ";
                else
                    yield "Password incorrecto, favo de correguirlo! ";
            }
            default -> {
                if (PASSWORK_VALIDO.equals(password))
                    yield "Uusario incorrecto, favor de corregirlo!";
                else
                    yield "Usuario y passwork incorrectos, favor de correguirlos! ";
            }
        };
        //Imprimor el mensaje de autenticacion
        System.out.println(mensajeAutenticacion);

    }
}
