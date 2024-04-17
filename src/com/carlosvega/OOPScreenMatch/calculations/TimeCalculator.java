package com.carlosvega.OOPScreenMatch.calculations;

import com.carlosvega.OOPScreenMatch.models.Movie;

public class TimeCalculator {
    private int totalTime;

    public void include(Movie movie){
        totalTime += movie.getMinutesLenght();
    }
}
