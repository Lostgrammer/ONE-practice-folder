package com.carlosvega.OOPScreenMatch.models;

public class Title {

    //atributos
    protected String name;
    private int launchYear;
    protected double totalRating;
    protected int totalEvaluations;

    //getters y setters
    public double getTotalRating() {
        return totalRating;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    //metodos
    public void showData(){
        System.out.println("Nombre de pelicula: "+ name + "\n" +
                "año de lanzamiento: " + launchYear + "\n");
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
