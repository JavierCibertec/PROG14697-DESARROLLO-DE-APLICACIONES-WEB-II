package com.cibertec.swapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StarWarsCharacter {

    private String name;
    private String height; // la api devuelve la altura como string
    private String gender;

    public StarWarsCharacter() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "StarWarsCharacter{name='" + name + "', height='" + height + "', gender='" + gender + "'}";
    }
}
