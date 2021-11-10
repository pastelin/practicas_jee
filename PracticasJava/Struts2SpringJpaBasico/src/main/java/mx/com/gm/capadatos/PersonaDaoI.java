package mx.com.gm.capadatos;

import java.util.List;
import mx.com.gm.domain.Persona;

public interface PersonaDaoI {

    void insertPersona(Persona persona);
    
    void updatePersona(Persona persona);
    
    void deletePersona(Persona persona);
    
    Persona findPersonaById(long idPersona);
    
    List<Persona> findAllPersonas();
    
    long contadorPersonas();
    
    Persona getPersonaByEmail(Persona persona);
}
