package com.carlosvega.listChallenge.models;

public class Purchase {
    private String description;
    private double value;

    public Purchase(String description,double value){
        this.description = description;
        this.value = value;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }
}
