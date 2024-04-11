package com.carlosvega.OOPScreenMatch.models;

public class Series extends Titulo{
    private int quantitySeasons;

    public int getQuantitySeasons() {
        return quantitySeasons;
    }
    public void setQuantitySeasons(int quantitySeasons) {
        this.quantitySeasons = quantitySeasons;
    }

    //metodos
    public void showData(){
        System.out.println("Nombre de la serie: " + name + "\n" +
                "Cantidad de temporadas: " + quantitySeasons);
    }
}
