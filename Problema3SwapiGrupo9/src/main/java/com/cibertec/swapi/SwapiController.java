package com.cibertec.swapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SwapiController {

    private final SwapiService swapiService;

    @Autowired
    public SwapiController(SwapiService swapiService) {
        this.swapiService = swapiService;
    }

    @GetMapping("/api/swapi/tall-female")
    public List<StarWarsCharacter> getTallFemaleCharacters() {
        return swapiService.getTallFemaleCharacters();
    }
}
