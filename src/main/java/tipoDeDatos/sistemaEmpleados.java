package tipoDeDatos;

import java.util.Scanner;

public class sistemaEmpleados {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bienvendio, eres un nuevo empleado! ");
        System.out.print("Por favor vamos a ingresar los siguiente datos: ");

        System.out.println("Ingresa tu nombre: ");
        String nombre = input.nextLine();

        System.out.println("Ingrese su edad: ");
        Integer edad = input.nextInt();

        System.out.println("Ingrese su salario: ");
        double salario = input.nextDouble();

        System.out.println("Ingrese su estatus de jefe de departamento (true/false): ");
        Boolean esJefeDepartamento = input.nextBoolean();

    }
}
