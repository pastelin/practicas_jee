package mx.com.gm.capaservicio;

import java.util.List;
import mx.com.gm.domain.Persona;

public interface PersonaServiceI {

    public List<Persona> listarPersonas();
    
    public Persona recuperarPersona(Persona persona);
    
    public void agregarPersona(Persona persona);
    
    public void modificarPersona(Persona persona);
    
    public void eliminarPersona(Persona persona);
    
    public long contarPersonas();
    
}
