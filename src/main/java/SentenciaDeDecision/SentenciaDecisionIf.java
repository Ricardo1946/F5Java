package SentenciaDeDecision;

public class SentenciaDecisionIf {
    public static void main(String[] args) {

        //Uso del If
        var edad = 10;
        if ( edad >= 18){
            System.out.println("Eres mayor de edad");
        } else if (edad >= 13 && edad < 18){
            System.out.println("Eres un adolecente ");
        } else {
            System.out.println("Eres un niño ");
        }
    }
}
