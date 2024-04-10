package com.carlosvega.OOPScreenMatch.models;


public class Movie {
    //atributos
    private String name;
    private int launchYear;
    private int duration;
    private double totalRating;
    private int totalEvaluations;

    //getters y setters
    public double getTotalRating() {
        return totalRating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    //metodos
    public void showData(){
        System.out.println("Nombre de pelicula: "+ name + "\n" +
                "año de lanzamiento: " + launchYear + "\n" +
                "duracion: " + duration);
    }
    public void rate(double rateValue){
        System.out.println("Tu calificacion a esta pelicula: " + rateValue + "/10\n");
        totalRating += rateValue;
        totalEvaluations++;

    }
    public double calculateRatingMedia (){
        return (totalRating) / totalEvaluations;
    }

}
