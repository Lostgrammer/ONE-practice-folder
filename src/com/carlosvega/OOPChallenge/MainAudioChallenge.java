package com.carlosvega.OOPChallenge;

public class MainAudioChallenge {
    public static void main(String[] args) {

        Song hoyEstoyRaro = new Song();
        hoyEstoyRaro.setName("Hoy estoy raro");
        hoyEstoyRaro.setSecLenght(180);
        hoyEstoyRaro.setAutor("Cuarteto de nos");
        hoyEstoyRaro.setLaunchDate(2006);
        hoyEstoyRaro.setAlbum("Raro");
        hoyEstoyRaro.setRecords("Cuarteto de nos");
        hoyEstoyRaro.play();
        hoyEstoyRaro.play();
        hoyEstoyRaro.showData();

        Podcast cotorrisa = new Podcast();
        cotorrisa.setName("La Cotorrisa");
        cotorrisa.setSecLenght(5400);
        cotorrisa.setAutor("La Cotorrisa Podcast");
        cotorrisa.setLaunchDate(2019);
        cotorrisa.setNumberEpisdodes(243);



    }
}
