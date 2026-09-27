package com.example.t1_feigngrupo9.client;

import com.example.t1_feigngrupo9.model.BreweryData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(
        name = "breweryClient",
        url = "https://api.openbrewerydb.org/v1"
)

public interface BreweryClient {

    @GetMapping("/breweries")
    List<BreweryData> getBreweries();
}
