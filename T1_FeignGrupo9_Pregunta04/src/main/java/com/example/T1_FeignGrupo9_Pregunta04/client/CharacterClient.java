package com.example.T1_FeignGrupo9_Pregunta04.client;

import com.example.T1_FeignGrupo9_Pregunta04.model.CharacterResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "characterClient",
        url = "https://rickandmortyapi.com"
)
public interface CharacterClient {
    @GetMapping("/api/character")
    CharacterResponse obtenerPersonajes();
}
