package OOPScreenMatch;

public class Pelicula {
    //atributos
    String name;
    int launchYear;
    String directorName;
    String distributorName;
    int duration;

    //metodos
    public void showData(){
        System.out.println("Nombre de pelicula: "+ name + "\n" +
                "año de lanzamiento: " + launchYear + "\n" +
                "Director: " + directorName + "\n" +
                "duracion: " + duration  + "\n");
    }
}
