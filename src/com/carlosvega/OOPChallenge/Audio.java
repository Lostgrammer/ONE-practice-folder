package com.carlosvega.OOPChallenge;
/*
* Aplicacion de reproduccion de audio*/
public class Audio {
    private String name;
    private int SecLenght;
    private String Autor;
    private int launchDate;
    private int AmountPlays;

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
        return AmountPlays;
    }
    public void setAmountPlays(int amountPlays) {
        AmountPlays = amountPlays;
    }
    public int getLaunchDate() {
        return launchDate;
    }
    public void setLaunchDate(int launchDate) {
        this.launchDate = launchDate;
    }
    public void liked(){
    }
    public void play(){
    }
}
