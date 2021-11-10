package mx.com.gm.actions;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import mx.com.gm.capaservicio.PersonaServiceI;
import org.apache.logging.log4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import mx.com.gm.domain.Persona;
        
public class MostrarPersonaAction extends ActionSupport {

    private long contadorPersonas;
    
    private static final Logger LOGGER = LogManager.getLogger(MostrarPersonaAction.class);
    
    @Autowired
    PersonaServiceI personaServiceI;
    
    private List<Persona> personas;
    
    @Override
    public String execute() {
        LOGGER.info("Iniciando el linstado de personas");
        this.personas = personaServiceI.listarPersonas();
        this.contadorPersonas = personaServiceI.contarPersonas();
        return SUCCESS;
    }
    
    public List<Persona> getPersonas() {
        return personas;
    }
    
    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    
    public long getContadorPersonas() {
        return this.contadorPersonas;
    }
    
    public void setContadorPersonas(long contadorPersonas) {
        this.contadorPersonas = contadorPersonas;
    }
}
