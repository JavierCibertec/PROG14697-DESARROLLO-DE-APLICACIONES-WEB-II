package com.cibertec.brewery;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "brewery-client", url = "https://api.openbrewerydb.org")
public interface BreweryClient {

    // trae todas las cervecerias (el filtrado se hace en el servicio)
    @GetMapping("/v1/breweries")
    List<BreweryData> getBreweries();
}
