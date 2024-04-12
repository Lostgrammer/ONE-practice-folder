package com.carlosvega.OOPScreenMatch.models;


public class Movie extends Title {
    //atributos
    private String director;
    private double minutesLenght;

    //getters y setters
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public double getMinutesLenght() {
        return minutesLenght;
    }
    public void setMinutesLenght(double minutesLenght) {
        this.minutesLenght = minutesLenght;
    }

    //metodos


}
