package com.carlosvega.OOPScreenMatch.models;

public class Serie extends Title {
    private int quantitySeasons;

    public int getQuantitySeasons() {
        return quantitySeasons;
    }
    public void setQuantitySeasons(int quantitySeasons) {
        this.quantitySeasons = quantitySeasons;
    }

    //metodos
    @Override
    public void showData() {
        System.out.println("Nombre de la serie: " + getName() + "\n" +
                "Año de lanzamiento: " + getLaunchYear() + "\n" +
                "Cantidad de temporadas: " + quantitySeasons);
    }

    /*
    * tienes que calcular y mostrar la calificacion por temporada y su total*/
//    @Override
//    public void rate(double rateValue) {
//
//        totalRating += rateValue;
//    }


}
