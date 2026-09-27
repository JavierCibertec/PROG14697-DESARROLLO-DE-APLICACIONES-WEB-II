package com.cibertec.swapi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "swapi-client", url = "https://swapi.dev/api")
public interface SwapiClient {

    // trae la primera pagina
    @GetMapping("/people/")
    SwapiResponse getPeopleFirstPage();
}
