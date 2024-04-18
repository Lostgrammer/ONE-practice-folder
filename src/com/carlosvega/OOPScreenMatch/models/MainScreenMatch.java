package com.carlosvega.OOPScreenMatch.models;


import com.carlosvega.OOPScreenMatch.calculations.TimeCalculator;

public class MainScreenMatch {
    public static void main(String[] args) {

        Movie peli1 = new Movie();
        peli1.setName("Planeta de los Simios");
        peli1.setLaunchYear(2011);
        peli1.setMinutesLenght(120);
        peli1.setDirector("Rupert Wyatt");
        peli1.showData();
//        peli1.rate(5.7);
//        peli1.rate(10);
//        System.out.println("La media de la pelicula " + peli1.name + " es: " + peli1.calculateRatingMedia() + " /10\n");

        Serie serie1 = new Serie();
        serie1.setName("Breaking Bad");
        serie1.setLaunchYear(2008);
        serie1.setSeasonQuantity(5);
        serie1.setEpisodesPerSeason(9);
        serie1.setMinutesPerEpisode(50);
        serie1.showData();
        //System.out.println("Tiempo promedio necesario para ver esta serie: " + serie1.getMinutesLenght() + "min");

        //calculator
        TimeCalculator timeCalculator = new TimeCalculator();

        System.out.println("Tiempo necesario para ver todo el contenido: " + timeCalculator.include(peli1) + " min");
    }
}
