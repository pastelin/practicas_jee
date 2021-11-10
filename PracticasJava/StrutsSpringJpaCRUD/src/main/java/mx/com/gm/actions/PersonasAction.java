package mx.com.gm.actions;

import com.opensymphony.xwork2.ActionSupport;
import java.util.*;
import mx.com.gm.capadatos.domain.Persona;
import mx.com.gm.capaservicio.PersonaServiceI;
import org.apache.logging.log4j.*;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonasAction extends ActionSupport{

    private static final Logger LOGGER = LogManager.getLogger(PersonasAction.class);
    
    private List<Persona> personas;
    private Persona persona;
    
    @Autowired
    private PersonaServiceI personaServiceI;
    
    @Action(value="/listar", results = {
        @Result(name="personas", location="/WEB-INF/content/personas.jsp")})
    public String listar() {
        this.personas = personaServiceI.listarPersonas();
        return "personas";
    }
    
    @Action(value="/agregarPersona", results={
        @Result(name="persona", location="/WEB-INF/content/persona.jsp")})
    public String agregar() {
        persona = new Persona();
        return "persona";
    }
    
    @Action(value="/editarPersona", results={
        @Result(name="persona", location="/WEB-INF/content/persona.jsp")})
    public String editar() {
        persona = personaServiceI.recuperarPersona(persona);
        return "persona";
    }
    
    @Action(value="/eliminarPersona", results={
        @Result(name="success", location="listar", type="redirect")})
    public String eliminar() {
        LOGGER.info("Metodo eliminar persona antes de recuperar: " + persona);
        persona = personaServiceI.recuperarPersona(persona);
        LOGGER.info("Metodo eliminar persona despues de recuperar: " + persona);
        personaServiceI.eliminarPersona(persona);
        return "success";
    }
    
    @Action(value="/guardarPersona", results={
        @Result(name="success", location="listar", type="redirect")})
    public String guardar() {
        if(persona.getIdPersona() == null) {
            personaServiceI.agregarPersona(persona);
        } else {
            personaServiceI.modificarPersona(persona);
        }
        return "success";
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
    
}
