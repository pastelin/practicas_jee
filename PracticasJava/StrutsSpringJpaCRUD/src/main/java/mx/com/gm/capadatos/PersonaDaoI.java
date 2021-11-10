/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.gm.capadatos;

import java.util.List;
import mx.com.gm.capadatos.domain.Persona;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public interface PersonaDaoI {

    void insertPersona(Persona persona);
    
    void updatePersona(Persona persona);
    
    void deletePersona(Persona persona);
    
    Persona findPersonaById(long idPersona);
    
    List<Persona> findAllPersonas();
    
    long contadorPersonas();
    
    Persona getPersonaByEmail(Persona persona);
}
