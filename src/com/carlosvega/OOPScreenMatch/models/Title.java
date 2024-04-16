package com.carlosvega.OOPScreenMatch.models;

public class Title {

    //atributos
    private String name;
    private int launchYear;
    private double totalRating;
    private int totalEvaluations;

    //getters y setters
    public double getTotalRating() {
        return totalRating;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getLaunchYear() {
        return launchYear;
    }
    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    //metodos
    public void showData(){
        System.out.println("Nombre del titulo: "+ name + "\n" +
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
