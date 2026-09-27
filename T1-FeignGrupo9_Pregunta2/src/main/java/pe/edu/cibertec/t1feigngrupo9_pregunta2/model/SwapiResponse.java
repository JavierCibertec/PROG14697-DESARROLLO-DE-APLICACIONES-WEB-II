package pe.edu.cibertec.t1feigngrupo9_pregunta2.model;

import lombok.Data;
import java.util.List;

@Data
public class SwapiResponse {
    private int count;
    private String next;
    private String previous;
    private List<StarWarsCharacter> results;
}