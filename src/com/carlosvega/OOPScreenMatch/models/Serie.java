package com.carlosvega.OOPScreenMatch.models;

public class Serie extends Title {
    private int episodesPerSeason;
    private int minutesPerEpisode;

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }
    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }
    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    //metodos
    @Override
    public void showData() {
        System.out.println("Nombre de la serie: " + getName() + "\n" +
                "Año de lanzamiento: " + getLaunchYear() + "\n" +
                "Episodios por temporada: " + episodesPerSeason);
    }

    /*
    * tienes que calcular y mostrar la calificacion por temporada y su total*/
//    @Override
//    public void rate(double rateValue) {
//
//        totalRating += rateValue;
//    }


}
