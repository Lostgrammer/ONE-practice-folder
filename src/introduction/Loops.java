package introduction;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limitUser = 3;
        double rating = 0;
        double finalRating = 0;

        for (int counter = 1; counter <= limitUser; counter++){
            System.out.println("Calificacion usuario" + counter + ":");
            double grade = input.nextDouble();
            rating += grade;
        }
        finalRating = rating / limitUser;
        System.out.println("La calificacion final es: " + finalRating + "/10");
    }
}
