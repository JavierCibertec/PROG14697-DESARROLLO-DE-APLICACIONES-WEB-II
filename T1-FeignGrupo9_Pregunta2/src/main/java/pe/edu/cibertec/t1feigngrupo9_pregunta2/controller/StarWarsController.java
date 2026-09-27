package pe.edu.cibertec.t1feigngrupo9_pregunta2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.cibertec.t1feigngrupo9_pregunta2.service.ISwapiService;

@Controller
@RequestMapping("/starwars")
public class StarWarsController {

    @Autowired
    private ISwapiService swapiService;

    @GetMapping("/personajes")
    public String listarPersonajes(Model model) {
        model.addAttribute("personajes", swapiService.obtenerPersonajesFemeninosAltos());
        model.addAttribute("titulo", "Personajes Femeninos de Star Wars (Altura > 160)");
        return "starwars/listar";
    }
}
