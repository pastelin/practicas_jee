package mx.com.gm.actions.capaservicio;

import java.util.List;
import mx.com.gm.actions.capadatos.PersonaRepository;
import mx.com.gm.capadatos.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class PersonaServiceImpl implements PersonaServiceI {

    @Autowired
    PersonaRepository personaRepository;
    
    @Override
    public List<Persona> listarPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public Persona recuperarPersona(Persona persona) {
        return (Persona) personaRepository.getById(persona.getIdPersona());
    }

    @Override
    public void agregarPersona(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void modificarPersona(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void eliminarPersona(Persona persona) {
        personaRepository.delete(persona);
    }

    @Override
    public long contadorPersona() {
        return personaRepository.count();
    }

}
