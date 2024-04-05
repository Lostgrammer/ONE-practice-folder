//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main (String[] args) {
        System.out.println ("You can always start anew");
        System.out.println ("Bienvenidos a la webapp para ver peliculas");
        String nameMovie = "Bolt";
        int launchDate = 1999;
        double rateMovie = (3.2 + 5 + 4.2) / 3;
        System.out.println ("Nombre pelicula: " + nameMovie);
        System.out.println ("Fecha de lamzamiento: " + launchDate);
        System.out.println ("Valoracion: " + rateMovie);
        System.out.println ("""
                              Se trata de un perro con superpoderes 
                              pero solo dentro de las camaras en los estudios de grabacion 
                              ya que en la vida real el es un simple perro
                                """);
        System.out.println(String.format("Nombre de la pelicula: %s, fecha de lanzamiento %d"));
        /*
        * Este es un comentario
        * de muchas lineas
        * */
        String contrasena= "12345";

    }
}