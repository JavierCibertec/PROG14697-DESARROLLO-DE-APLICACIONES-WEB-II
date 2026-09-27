package com.example.T1_FeignGrupo9_Pregunta04.model;

import java.util.List;

public class CharacterResponse {
    private List<CharacterRM> results;

    public CharacterResponse(){
    }

    public List<CharacterRM> getResults(){
        return results;
    }
    public void setResults(List<CharacterRM> results){
        this.results = results;
    }
}
