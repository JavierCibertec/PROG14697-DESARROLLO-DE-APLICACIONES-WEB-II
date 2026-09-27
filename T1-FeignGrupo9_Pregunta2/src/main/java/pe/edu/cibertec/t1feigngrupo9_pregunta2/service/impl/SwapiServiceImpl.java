package pe.edu.cibertec.t1feigngrupo9_pregunta2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.t1feigngrupo9_pregunta2.client.SwapiClient;
import pe.edu.cibertec.t1feigngrupo9_pregunta2.model.StarWarsCharacter;
import pe.edu.cibertec.t1feigngrupo9_pregunta2.model.SwapiResponse;
import pe.edu.cibertec.t1feigngrupo9_pregunta2.service.ISwapiService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SwapiServiceImpl implements ISwapiService {

    @Autowired
    private SwapiClient swapiClient;

    @Override
    public List<StarWarsCharacter> obtenerPersonajesFemeninosAltos() {
        SwapiResponse response = swapiClient.getPeople();
        if (response == null || response.getResults() == null) {
            return new ArrayList<>();
        }

        return response.getResults().stream()
                // Filtrar género igual a "female" (ignorando mayúsculas/minúsculas)
                .filter(character -> "female".equalsIgnoreCase(character.getGender()))
                // Filtrar altura > 160 (parseando de String a entero)
                .filter(character -> {
                    try {
                        int height = Integer.parseInt(character.getHeight());
                        return height > 160;
                    } catch (NumberFormatException e) {
                        return false; // Ignora valores como "unknown"
                    }
                })
                .collect(Collectors.toList());
    }
}