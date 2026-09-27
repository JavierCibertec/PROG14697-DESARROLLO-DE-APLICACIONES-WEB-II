package pe.edu.cibertec.t1feigngrupo9_pregunta2.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.t1feigngrupo9_pregunta2.model.SwapiResponse;

@FeignClient(name = "swapiClient", url = "https://swapi.dev/api")
public interface SwapiClient {

    @GetMapping("/people/")
    SwapiResponse getPeople();
}