package mx.com.gm.actions;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import mx.com.gm.actions.capaservicio.PersonaServiceI;
import mx.com.gm.capadatos.domain.Persona;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;


public class PersonasAction extends ActionSupport {
    
    private static final Logger LOGGER = LogManager.getLogger(PersonasAction.class);
    
    private List<Persona> personas;
    private Persona persona;
    
    @Autowired
    private PersonaServiceI personaService;
    
    @Action(value="/listar", results = {
        @Result(name="personas", location="/WEB-INF/content/personas.jsp")})
    public String listar() {
        this.personas = personaService.listarPersonas();
        return "personas";
    }
    

}
