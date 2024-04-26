package com.carlosvega.OOPChallenge.models;
/*
* Aplicacion de reproduccion de audio*/
public class Audio {
    private String name;
    private int SecLenght;
    private String Autor;
    private int launchDate;
    private int amountPlays;
    private int amountLikes;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSecLenght() {
        return SecLenght;
    }
    public void setSecLenght(int lenght) {
        this.SecLenght = lenght;
    }
    public String getAutor() {
        return Autor;
    }
    public void setAutor(String autor) {
        Autor = autor;
    }
    public int getAmountPlays() {
        return amountPlays;
    }
    public void setAmountPlays(int amountPlays) {
        this.amountPlays = amountPlays;
    }
    public int getLaunchDate() {
        return launchDate;
    }
    public void setLaunchDate(int launchDate) {
        this.launchDate = launchDate;
    }
    public int getAmountLikes() {
        return amountLikes;
    }
    public void setAmountLikes(int amountLikes) {
        this.amountLikes = amountLikes;
    }

    //methods
    public void showData(){
        System.out.println("Autor: " + getAutor() + " \n" +
                "Duracion: "+ getSecLenght() + "s\n" +
                "Fecha de lanzamiento: " + getLaunchDate() + " \n" +
                "Total de reproducciones: " + getAmountPlays() + "\n" +
                "Cantidad de me gusta: " + getAmountLikes() + "\n");
    }
    public void liked(){
        this.amountLikes++;

    }
    public void play(){
        this.amountPlays++;
    }
}
