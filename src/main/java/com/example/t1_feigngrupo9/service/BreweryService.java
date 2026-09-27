package com.example.t1_feigngrupo9.service;

import com.example.t1_feigngrupo9.client.BreweryClient;
import com.example.t1_feigngrupo9.model.BreweryData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BreweryService {

    private final BreweryClient breweryClient;

    public BreweryService(BreweryClient breweryClient){
        this.breweryClient = breweryClient;
    }

    public List<BreweryData> obtenerCerveceriasMicroCalifornia() {

        List<BreweryData> breweries = breweryClient.getBreweries();

        return breweries.stream()
                .filter(brewery -> "micro".equalsIgnoreCase(brewery.getBreweryType())
                )
                .filter(brewery -> "California".equalsIgnoreCase(brewery.getState())
                )
                .toList();
    }
}
