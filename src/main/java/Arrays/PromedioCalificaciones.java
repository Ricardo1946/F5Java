package Arrays;

import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {

        System.out.println("** Promedio de Calificaciones **");
        var console = new Scanner(System.in);

        System.out.println("Cuentas calificaciones deseas agregar ? ");
        var totalCalificaciones = Integer.parseInt(console.nextLine());

        //Creamos el arreglo
        var calificaciones = new int[totalCalificaciones];
        //Solicitar los valores de las calificaciones
        for (var i = 0; i < totalCalificaciones; i++) {
            System.out.println("Calificaciones[" + i + "] = ");
            calificaciones[i] = Integer.parseInt(console.nextLine());
        }

        //Obtener el promedio de las calificaciones
        var sumaCalificaciones = 0;
        for (var i = 0; i < totalCalificaciones; i++) {
            sumaCalificaciones += calificaciones[i];
        }
        var promedio = sumaCalificaciones / totalCalificaciones;
        System.out.println("\n Promedio de las calificaciones: " + promedio);
    }
}
