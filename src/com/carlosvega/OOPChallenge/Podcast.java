package com.carlosvega.OOPChallenge;

public class Podcast extends Audio{
    private int NumberEpisdodes;

    public int getNumberEpisdodes() {
        return NumberEpisdodes;
    }
    public void setNumberEpisdodes(int numberEpisdodes) {
        NumberEpisdodes = numberEpisdodes;
    }

    @Override
    public void showData() {
        System.out.println("Nombre del podcast: " + getName());
        super.showData();
        System.out.println("Numero de episodios: " + getNumberEpisdodes());
    }
}
