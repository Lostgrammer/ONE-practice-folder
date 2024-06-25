package com.carlosvega.OOPScreenMatch.main;

import com.carlosvega.OOPScreenMatch.models.Movie;
import com.carlosvega.OOPScreenMatch.models.Serie;
import com.carlosvega.OOPScreenMatch.models.Title;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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

        //new list of name field of title object
        List<String> nameTitleList = new ArrayList<>();
        for(Title i:titleList){
            i.showData();
            String item = i.getName();
            nameTitleList.add(item);
        }

        //sort list of titles names
        Collections.sort(nameTitleList);
        System.out.println(nameTitleList);
    }


}
