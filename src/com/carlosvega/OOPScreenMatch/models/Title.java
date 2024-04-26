package com.carlosvega.OOPScreenMatch.models;

public class Title {

    //atributos
    private String name;
    private int launchYear;
    private boolean planIncluded;

    private double totalRating;
    private int totalEvaluations;
    private int minutesLenght;

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

    public boolean isPlanIncluded() {
        return planIncluded;
    }
    public void setPlanIncluded(boolean planIncluded) {
        this.planIncluded = planIncluded;
    }
    public int getMinutesLenght() {
        return minutesLenght;
    }
    public void setMinutesLenght(int minutesLenght) {
        this.minutesLenght = minutesLenght;
    }
    //metodos
    public void showData(){
        System.out.println("Nombre del titulo: "+ name + "\n" +
                "año de lanzamiento: " + launchYear + "\n" +
                "Duracion en minutos: " + getMinutesLenght() + " min\n");
    }
    public void rate(double rateValue){ //calcular la suma de todas las calificaciones
        System.out.println("Tu calificacion a esta pelicula: " + rateValue + "/10\n");
        totalRating += rateValue;
        totalEvaluations++;
    }
    public double calculateRatingMedia (){
        return (totalRating) / totalEvaluations;
    }

    //sobreescribir metodo string
    @Override
    public String toString() {
        return getName();
    }
}
