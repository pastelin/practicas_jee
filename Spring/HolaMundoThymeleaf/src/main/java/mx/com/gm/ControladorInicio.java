package mx.com.gm;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
@Slf4j
public class ControladorInicio {
    
    @Value("${index.saludo}")
    private String saludo;

    @GetMapping("/")
    public String inicio(Model model) {
        String mensaje = "Hola Mundo con Thymeleaf";
        
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        persona.setEmail("jperez@gmail.com");
        persona.setTelefono("123465798");
        
        Persona persona2 = new Persona();
        persona2.setNombre("Karla");
        persona2.setApellido("Sol");
        persona2.setEmail("Karla@gmail.com");
        persona2.setTelefono("123465798");
        
        List<Persona> personas = new ArrayList<>();
        personas.add(persona);
        personas.add(persona2);
        
        log.info("Ejecutando el controlador Spring MVC");
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
//        model.addAttribute("persona", persona2);
        model.addAttribute("personas", personas);
        return "index";
    }
    
}
