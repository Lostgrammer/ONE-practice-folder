package OOPScreenMatch;



public class MainScreenMatch {
    public static void main(String[] args) {

        Movie peli1 = new Movie();
        peli1.name = "Planeta de los Simios";
        peli1.launchYear = 2011;
        peli1.duration = 120;
        Movie peli2 = new Movie();
        peli2.name = "Amelie";
        peli2.launchYear = 2002;
        peli2.duration = 90;

        peli1.showData();
        peli1.rate(5.7);
        peli1.rate(10);
        System.out.println("La media de la pelicula es: " + peli1.calculateRatingMedia() + " /10");
//        peli2.showData();
//        peli2.rate(9);
    }
}
