package introduction;

import java.util.Random;
import java.util.Scanner;

//Crea un programa que simule un juego de adivinanzas.
// El programa debe generar un número aleatorio entre 0 y 100,
// y pedir al usuario que intente adivinar ese número en un máximo de 5 intentos. En cada intento,
// el programa debe informar si el número ingresado por el usuario es mayor o menor que el número generado.

public class RiddleGame {
    public static void main(String[] args) {

        //inicializando objetos para generar numero random e ingreso de datos respectivamente
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int inputNumber = 0;
        //generando numero random
        int randomNumber = rand.nextInt(101);
        int limitNumber = 5;

        //System.out.println("El numero es "+randomNumber);

        //generar bucle que corra maximo 5 veces
        for (int i = 0; i < limitNumber; i++) {
            System.out.println("Intenta adivinar el numero oculto: ");
            inputNumber = input.nextInt();
            //comparando el numero del usuario con el numero oculto
            if (inputNumber == randomNumber) {
                System.out.println("Felicidades acertaste! el numero es "+randomNumber);
                break;
            }else {
                //identificar si el numero es mayor o menor
                if (inputNumber < randomNumber) {
                    System.out.println("No, el numero oculto es mayor que " + inputNumber);
                }else if (inputNumber > randomNumber){
                    System.out.println("No, el numero oculto es menor que " + inputNumber);
                }
            }
            if (i == limitNumber-1) {
                System.out.println("Lo siento, se te acabaron los intentos");
            }
        }
    }
}
