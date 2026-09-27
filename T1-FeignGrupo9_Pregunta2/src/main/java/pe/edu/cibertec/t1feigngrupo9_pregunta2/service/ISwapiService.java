package pe.edu.cibertec.t1feigngrupo9_pregunta2.service;

import pe.edu.cibertec.t1feigngrupo9_pregunta2.model.StarWarsCharacter;
import java.util.List;

public interface ISwapiService {
    List<StarWarsCharacter> obtenerPersonajesFemeninosAltos();
}
