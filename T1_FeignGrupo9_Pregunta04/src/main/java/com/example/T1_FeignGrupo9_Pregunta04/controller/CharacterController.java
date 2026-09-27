package com.example.T1_FeignGrupo9_Pregunta04.controller;

import com.example.T1_FeignGrupo9_Pregunta04.model.CharacterRM;
import com.example.T1_FeignGrupo9_Pregunta04.service.CharacterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/personajes")
public class CharacterController {
    private final CharacterService characterService;

    public CharacterController(CharacterService characterService){
        this.characterService = characterService;
    }

    @GetMapping
    public List<CharacterRM> obtenerPersonajes(){
        return characterService.obtenerHumanosVivos();
    }
}
