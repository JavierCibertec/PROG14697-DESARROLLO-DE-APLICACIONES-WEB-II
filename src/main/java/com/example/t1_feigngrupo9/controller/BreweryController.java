package com.example.t1_feigngrupo9.controller;

import com.example.t1_feigngrupo9.model.BreweryData;
import com.example.t1_feigngrupo9.service.BreweryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/breweries")
public class BreweryController {

    private final BreweryService breweryService;

    public BreweryController(BreweryService breweryService){
        this.breweryService = breweryService;
    }

    @GetMapping
    public List<BreweryData> obtenerCervecerias(){
        return breweryService.obtenerCerveceriasMicroCalifornia();
    }
}
