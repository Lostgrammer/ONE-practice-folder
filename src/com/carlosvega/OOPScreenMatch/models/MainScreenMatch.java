package com.carlosvega.OOPScreenMatch.models;



public class MainScreenMatch {
    public static void main(String[] args) {

        Movie peli1 = new Movie();
        peli1.setName("Planeta de los Simios");
        peli1.setLaunchYear(2011);
        peli1.setDuration(120);
        peli1.showData();
        peli1.rate(5.7);
        peli1.rate(10);
        System.out.println("La media de la pelicula es: " + peli1.calculateRatingMedia() + " /10");
        System.out.println("getter de peli1:"+ peli1.getTotalRating());

        Series serie1 = new Series();
        serie1.setQuantitySeasons(5);
        serie1.showData();
    }
}
