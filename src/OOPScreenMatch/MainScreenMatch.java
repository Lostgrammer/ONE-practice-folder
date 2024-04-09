package OOPScreenMatch;

public class MainScreenMatch {
    public static void main(String[] args) {
        Pelicula peli1 = new Pelicula();
        peli1.name = "Planeta de los Simios";
        peli1.launchYear = 2011;
        peli1.directorName = "Rupert Wyatt";
        peli1.duration = 120;
        peli1.distributorName = "Warner Bros";
        System.out.println("Nombre de pelicula: "+ peli1.name + "\n" +
                "año de lanzamiento: "+ peli1.launchYear + "\n");
    }
}
