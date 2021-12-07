package mx.com.gm.actions;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import javax.inject.Inject;
import mx.com.gm.capadatos.domain.Persona;
import mx.com.gm.capaservicio.PersonaServiceI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

public class MostrarPersonaAction extends ActionSupport {

    private long contadorPersonas;
    
    private static final Logger LOGGER = LogManager.getLogger(MostrarPersonaAction.class);
    
    @Inject
    PersonaServiceI personaService;
    
    private List<Persona> personas;
    
//    @Action(value="/listar", results = {
//        @Result(name="personas", location="/WEB-INF/content/mostrar-persona.jsp")})
    @Override
    public String execute() {
        this.personas = personaService.listarPersonas();
        this.contadorPersonas = personaService.contarPersonas();
        return SUCCESS;
    }

    public long getContadorPersonas() {
        return contadorPersonas;
    }

    public void setContadorPersonas(long contadorPersonas) {
        this.contadorPersonas = contadorPersonas;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    
}
