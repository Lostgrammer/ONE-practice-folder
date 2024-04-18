package com.carlosvega.OOPScreenMatch.models;


import com.carlosvega.OOPScreenMatch.calculations.Ranking;

public class Movie extends Title implements Ranking {
    //atributos
    private String director;

    //getters y setters
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getRamking() {
        return (int) calculateRatingMedia();
    }

    //metodos
//    @Override
//    public void showData() {
//        System.out.println("Nombre de la pelicula: " + getName() + "\n" +
//                "Año de lanzamiento: " + getLaunchYear() + "\n" +
//                "Director: " + director + "\n");
//    }
}
