package com.carlosvega.OOPScreenMatch.main;


//import com.carlosvega.OOPScreenMatch.calculations.TimeCalculator;

import com.carlosvega.OOPScreenMatch.models.Movie;
import com.carlosvega.OOPScreenMatch.models.Serie;
import com.carlosvega.OOPScreenMatch.models.Title;

import java.util.ArrayList;
import java.util.List;

public class MainScreenMatch {
    public static void main(String[] args) {

        Movie peli1 = new Movie("Planeta de los Simios",2011);
//        peli1.setName();
//        peli1.setLaunchYear();
        peli1.setMinutesLenght(120);
        peli1.setDirector("Rupert Wyatt");
        peli1.showData();

        Serie serie1 = new Serie("Breaking Bad",2008);
//        serie1.setName();
//        serie1.setLaunchYear();
        serie1.setSeasonQuantity(5);
        serie1.setEpisodesPerSeason(9);
        serie1.setMinutesPerEpisode(50);
        serie1.showData();

        Movie peli2 = new Movie("Kung Fu Panda", 2008);
//        peli2.setName();
//        peli2.setLaunchYear();
        peli2.setMinutesLenght(90);
        peli2.setDirector("Mark Osborne");
        peli2.showData();

        //calculator
//        TimeCalculator timeCalculator = new TimeCalculator();
//        timeCalculator.include(peli1);
//        timeCalculator.include(serie1);
//
//        System.out.println("Tiempo necesario para ver todo el contenido: " + timeCalculator.getTotalTime() + " min");

        //list
        List<Title> titlesList = new ArrayList<>();
        titlesList.add(peli1);
        titlesList.add(peli2);
        titlesList.add(serie1);
        System.out.println("Cantidad de elementos de la lista de titulos: " + titlesList.size());
        System.out.println("Nombre de peli 2: " + titlesList.get(1).getName());
        System.out.println("Mostrar lista de objetos con un override del metodo toString: " + titlesList);
    }
}
