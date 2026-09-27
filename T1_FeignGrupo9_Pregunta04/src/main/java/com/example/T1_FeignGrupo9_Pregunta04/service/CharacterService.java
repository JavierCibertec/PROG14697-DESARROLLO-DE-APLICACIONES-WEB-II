package com.example.T1_FeignGrupo9_Pregunta04.service;

import com.example.T1_FeignGrupo9_Pregunta04.client.CharacterClient;
import com.example.T1_FeignGrupo9_Pregunta04.model.CharacterRM;
import com.example.T1_FeignGrupo9_Pregunta04.model.CharacterResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService {
    private final CharacterClient characterClient;

    public CharacterService(CharacterClient characterClient){
        this.characterClient = characterClient;
    }

    public List<CharacterRM> obtenerHumanosVivos(){
        CharacterResponse response = characterClient.obtenerPersonajes();

        return response.getResults()
                .stream()
                .filter(personaje ->
                        "Alive".equalsIgnoreCase(personaje.getStatus()))
                .filter(personaje ->
                        "Human".equalsIgnoreCase(personaje.getSpecies()))
                .toList();
    }
}
