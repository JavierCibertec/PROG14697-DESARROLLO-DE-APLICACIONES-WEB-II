package com.example.t1_feigngrupo9.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BreweryData {

    private String id;
    private String name;

    @JsonProperty("brewery_type")
    private String breweryType;

    private String state;

    public BreweryData(){
    }

    public String getId(){
        return  id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getBreweryType(){
        return breweryType;
    }

    public void setBreweryType(String breweryType){
        this.breweryType = breweryType;
    }

    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state = state;
    }
}
