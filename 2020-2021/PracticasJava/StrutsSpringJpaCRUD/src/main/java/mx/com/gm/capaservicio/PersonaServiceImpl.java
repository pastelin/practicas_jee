package mx.com.gm.capaservicio;

import java.util.List;
import mx.com.gm.capadatos.PersonaDaoI;
import mx.com.gm.capadatos.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonaServiceImpl implements PersonaServiceI {

    @Autowired
    private PersonaDaoI personaDaoI;

    @Override
    public List<Persona> listarPersonas() {
        return personaDaoI.findAllPersonas();
    }

    @Override
    public Persona recuperarPersona(Persona persona) {
        return personaDaoI.findPersonaById(persona.getIdPersona());
    }

    @Override
    public void agregarPersona(Persona persona) {
        personaDaoI.insertPersona(persona);
    }

    @Override
    public void modificarPersona(Persona persona) {
        personaDaoI.updatePersona(persona);
    }

    @Override
    public void eliminarPersona(Persona persona) {
        personaDaoI.deletePersona(persona);
    }

    @Override
    public long contadorPersona() {
        return personaDaoI.contadorPersonas();
    }
}
