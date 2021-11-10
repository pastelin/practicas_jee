package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.dao.PersonaDaoI;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    PersonaDaoI personaDaoI;
    
    @Override
    @Transactional(readOnly = true)
    public List<Persona> listarPersonas() {
        return (List<Persona>) personaDaoI.findAll();
    }

    @Override
    @Transactional
    public void guardar(Persona persona) {
        personaDaoI.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
        personaDaoI.delete(persona);
    }

    @Override
    @Transactional
    public Persona encontrarPersona(Persona persona) {
        return personaDaoI.findById(persona.getIdPersona()).orElse(null);
    }

}
