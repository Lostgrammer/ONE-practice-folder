package com.carlosvega.apiChallenge.models;

public class Character {
    private int id;
    private String name;
    private String species;
    private String locationName;

    //constructor
    public Character(CharacterApi characterApi){
        this.id = Integer.valueOf(characterApi.id());
        this.name = characterApi.name();
        this.species = characterApi.species();
        this.locationName = String.valueOf(characterApi.origin().name());
    }
    @Override
    public String toString() {
        return "id: " + this.id +
                ", nombres: " + this.name +
                ", especie: " + this.species +
                ", Nombre Ubicacion: " + this.locationName;
    }
}
