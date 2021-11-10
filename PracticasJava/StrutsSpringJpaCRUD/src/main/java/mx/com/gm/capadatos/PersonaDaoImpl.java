package mx.com.gm.capadatos;


import java.util.List;
import javax.persistence.*;
import mx.com.gm.capadatos.domain.Persona;
import org.apache.logging.log4j.*;
import org.springframework.stereotype.Repository;

@Repository
public class PersonaDaoImpl implements PersonaDaoI {

    private static final Logger LOGGER = LogManager.getLogger(PersonaDaoImpl.class);
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public void insertPersona(Persona persona) {
        em.persist(persona);
    }

    @Override
    public void updatePersona(Persona persona) {
        em.merge(persona);
    }

    @Override
    public void deletePersona(Persona persona) {
        em.remove(persona);
    }

    @Override
    public Persona findPersonaById(long idPersona) {
        return em.find(Persona.class, idPersona);
    }

    @Override
    public List<Persona> findAllPersonas() {
        String jpql = "SELECT p FROM Persona p";
        Query query = em.createQuery(jpql);
        // Forzar a ir directamente a la base de datos para refrescar datos
        query.setHint("javax.persistence.cache.storeMode", CacheStoreMode.REFRESH);
        List<Persona> personas = query.getResultList();
        LOGGER.info("personas: " + personas.toString());
        return personas;
    }

    @Override
    public long contadorPersonas() {
        String consulta = "select count(p) from Persona p";
        Query query = em.createQuery(consulta);
        return (long) query.getSingleResult();
    }

    @Override
    public Persona getPersonaByEmail(Persona persona) {
        String cadena = "%" + persona.getEmail() + "%";
        String consulta = "from Persona p where upper(p.email) like upper(:param1)";
        Query query = em.createQuery(consulta);
        query.setParameter("param1", cadena);
        
        return (Persona) query.getSingleResult();
    }
    
}
