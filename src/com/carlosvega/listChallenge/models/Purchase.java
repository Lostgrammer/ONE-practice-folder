package com.carlosvega.listChallenge.models;

public class Purchase {
    private String description;
    private double value;

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
