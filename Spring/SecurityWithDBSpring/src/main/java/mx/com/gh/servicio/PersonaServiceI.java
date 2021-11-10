package mx.com.gh.servicio;

import java.util.List;
import mx.com.gh.domain.Persona;

public interface PersonaServiceI {

    public List<Persona> listarPersonas();
    
    public void guardar(Persona persona);
    
    public void eliminar(Persona persona);
    
    public Persona encontrarPersona(Persona persona);
}
