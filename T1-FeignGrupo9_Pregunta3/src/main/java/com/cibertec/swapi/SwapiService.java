package com.cibertec.swapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SwapiService {

    private static final int MIN_HEIGHT = 160;

    private final SwapiClient swapiClient;

    @Autowired
    public SwapiService(SwapiClient swapiClient) {
        this.swapiClient = swapiClient;
    }

    // p3: female con height > 160 (height viene como string, por eso se parsea)
    public List<StarWarsCharacter> getTallFemaleCharacters() {
        SwapiResponse response = swapiClient.getPeopleFirstPage();
        if (response == null || response.getResults() == null) {
            return Collections.emptyList();
        }

        return response.getResults().stream()
                .filter(c -> "female".equalsIgnoreCase(c.getGender()))
                .filter(this::isTallerThanMin)
                .collect(Collectors.toList());
    }

    private boolean isTallerThanMin(StarWarsCharacter character) {
        try {
            int height = Integer.parseInt(character.getHeight().trim());
            return height > MIN_HEIGHT;
        } catch (NumberFormatException | NullPointerException e) {
            // si es "unknown" se salta
            return false;
        }
    }
}
