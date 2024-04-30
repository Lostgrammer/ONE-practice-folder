package com.carlosvega.OOPScreenMatch.main;

import com.carlosvega.OOPScreenMatch.models.Movie;
import com.carlosvega.OOPScreenMatch.models.Serie;
import com.carlosvega.OOPScreenMatch.models.Title;

import java.util.ArrayList;
import java.util.List;

public class MainList {
    public static void main(String[] args) {
        Movie peli1 = new Movie("Planeta de los Simios",2011);
        peli1.rate(10);
        Movie peli2 = new Movie("Kung Fu Panda", 2008);
        peli2.rate(7);
        Serie serie1 = new Serie("Breaking Bad",2008);

        List<Title> titleList = new ArrayList<>();
        titleList.add(peli1);
        titleList.add(peli2);
        titleList.add(serie1);

        for(Title i:titleList){
            i.showData();
        }
    }


}
