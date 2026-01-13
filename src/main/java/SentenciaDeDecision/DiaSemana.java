package SentenciaDeDecision;

public class DiaSemana {
    public static void main(String[] args) {
        System.out.println("**** Dia de la semana con Switch");

        var dia = 1; //suponiendo que 1 - lunes, 2 - martes, etc.
        switch (dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            default -> System.out.println("Dia invalido: " + dia);
        }
    }
}
