package SentenciaDeDecision;

import java.util.Scanner;

public class StarPatternProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many rows yo want in this pattern? ");
        int rows = input.nextInt();
        System.out.println("Here is your pattern .. !!!");
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= i; j++){
                if (j == 1 || j == i || i == rows) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        input.close();
    }
}
