package introduction;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main (String[] args) {
        System.out.println ("You can always start anew");
        System.out.println ("Bienvenidos a la webapp para ver peliculas");
        String nameMovie = "Bolt";
        int launchDate = 1999;
        double rateMovie = (3.2 + 5 + 4.2) / 3;
        //casting
        int rateMovieInt = (int) rateMovie;
        System.out.println ("Nombre pelicula: " + nameMovie);
        System.out.println ("Fecha de lamzamiento: " + launchDate);
        System.out.println ("Valoracion: " + rateMovieInt);
        System.out.println ("""
                              SINOPSIS
                              Se trata de un perro con superpoderes
                              pero solo dentro de las camaras en los estudios de grabacion
                              ya que en la vida real el es un simple perro
                                """);
        /*
        * Este es un comentario
        * de muchas lineas
        * */

        //cast practice
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el valor de los grados celsius para convertirlos a Fahrenheit");
        double degreesValue = input.nextDouble();
        double fahrenheitConvertion = (degreesValue * 1.8)+32;
        int fahrenheitConvertionInt = (int) fahrenheitConvertion;
        System.out.println("El valor de "+degreesValue+" Celsius en grados Farenheit es: "+fahrenheitConvertionInt+" F");

    }
}