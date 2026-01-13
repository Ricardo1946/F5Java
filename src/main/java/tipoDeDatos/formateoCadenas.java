package tipoDeDatos;

/**
 * String.format y printf es un metodo para crear cadenas formateadas
 * usando marcadores de posicion, permitiendo combinar texto y variables de forma controlada.
 * Insertando valores como cadenas, enteros,  decimales, fechas, etc. y devolviendo una nueva cadena
 * formateada segun la configuracion regional(Locale)
 * sintaxis basica: String resultado = String.format(Locale.US, formato, argumentos);
 * Ejemplos comunes: cadenas (%s), insertar texto. Entero (%d) inserta numeros enteros.
 * Decimal (%f, %.2f) formatea numeros flotantes, especificando deciamles. Fechas y horas(%T) formatear fechas y horas
 *
 */


public class formateoCadenas {
    public static void main(String[] args) {
        System.out.println("--- Formateo de Cadenas ---");
        var nombre = "Matias";
        var edad = 33;
        var salario = 4500000.99;

        //String.format
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: %.2f",
                nombre, edad, salario);
        System.out.println(mensaje);

        //Metodo printf
        System.out.printf("Nombre: %S, Edad: %d, Salario: $%.2fn",
                nombre, edad, salario);
    }
}
