package com.carlosvega.OOPScreenMatch.models;

import com.carlosvega.OOPScreenMatch.calculations.Ranking;

public class Serie extends Title{
    private int seasonQuantity;
    private int episodesPerSeason;
    private int minutesPerEpisode;

    //constructor
    public Serie(String name, int launchYear){
        super(name,launchYear);
    }
    public int getSeasonQuantity() {
        return seasonQuantity;
    }
    public void setSeasonQuantity(int seasonQuantity) {
        this.seasonQuantity = seasonQuantity;
    }

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
    public int getMinutesLenght() {
        return seasonQuantity * episodesPerSeason * minutesPerEpisode;
    }


}
