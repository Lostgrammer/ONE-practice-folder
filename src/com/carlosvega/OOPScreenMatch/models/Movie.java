package com.carlosvega.OOPScreenMatch.models;


public class Movie extends Title {
    //atributos
    private String director;

    //getters y setters
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    //metodos
    @Override
    public void showData() {
        System.out.println("Nombre de la pelicula: " + getName() + "\n" +
                "Año de lanzamiento: " + getLaunchYear() + "\n" +
                "Director: " + director + "\n");
    }
}
