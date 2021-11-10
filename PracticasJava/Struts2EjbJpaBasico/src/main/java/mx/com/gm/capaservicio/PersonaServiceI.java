package mx.com.gm.capaservicio;

import java.util.List;
import mx.com.gm.capadatos.domain.Persona;

public interface PersonaServiceI {
    
    List<Persona> listarPersonas();
    
    Persona recuperarPersona(Persona persona);
    
    void agregarPersona(Persona persona);
    
    void modificarPersona(Persona persona);
    
    void eliminarPersona(Persona persona);
    
    public long contarPersonas();
}
