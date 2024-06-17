package com.carlosvega.OOPScreenMatch.models;

import com.google.gson.annotations.SerializedName;

public class Title {

    //atributos

    @SerializedName("Title")//anotacion gson para deserealizar titulo
    private String name;
    @SerializedName("Year")//anotacion gson para deserealizar anio
    private int launchYear;
    private boolean planIncluded;

    private double totalRating;
    private int totalEvaluations;
    private int minutesLenght;

    //constructor
    public Title(String name, int launchYear){
        this.name = name;
        this.launchYear = launchYear;
    }

    //nuevo constructor para TitleOmdb
    public Title(TitleOmdb titleOmdb){
        this.name = titleOmdb.title();
        this.launchYear = Integer.valueOf(titleOmdb.year());
        this.minutesLenght = Integer.valueOf(titleOmdb.runtime().substring(0,2)); //substring para tranformar parte del string a int
    }
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

    @Override
    public String toString() {
        return "nombre='" + name + '\'' +
                ", fecha de lanzamiento=" + launchYear +
                "\n , duracion: " + minutesLenght;
    }
}
