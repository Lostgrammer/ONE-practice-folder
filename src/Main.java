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

    }
}