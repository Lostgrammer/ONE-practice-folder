package com.carlosvega.OOPChallenge.models;

public class Song extends Audio{
    private String album;
    private String records;

    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String getRecords() {
        return records;
    }
    public void setRecords(String records) {
        this.records = records;
    }

    //methods

    @Override
    public void showData() {
        System.out.println("Nombre de la cancion: " + getName() + "\n" +
                "Album: " + getAlbum() + "\n" +
                "Disquera: " + getRecords());
        super.showData();
    }
}
