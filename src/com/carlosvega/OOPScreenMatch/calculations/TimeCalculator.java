package com.carlosvega.OOPScreenMatch.calculations;

import com.carlosvega.OOPScreenMatch.models.Movie;

public class TimeCalculator {
    private int totalTime;

    public int include(Movie movie){
        totalTime += movie.getMinutesLenght();
        return totalTime;
    }

//    public void showTotalTime(){
//
//    }
}
