package mx.com.gm.capadatos;

import mx.com.gm.capadatos.domain.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.CacheStoreMode;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Stateless
public class PersonaDaoImpl implements PersonaDao {

    private static final Logger LOGGER = LogManager.getLogger(PersonaDaoImpl.class);
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public void insertPersona(Persona persona) {
        // Insertamos nuevo Objeto
        em.persist(persona);
    }

    @Override
    public void updatePersona(Persona persona) {
        // Actualizamos al Objeto
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
        //Forzar a ir directamente a la base de datos para refrescar datos
        query.setHint("javax.persistence.cache.storeMode", CacheStoreMode.REFRESH);
        List<Persona> personas = query.getResultList();
        LOGGER.info("Personas: " + personas);
        return personas;
    }

    @Override
    public long contadorPersonas() {
        String consulta = "select count(p) from Persona p";
        Query q = em.createQuery(consulta);
        return (long) q.getSingleResult();
    }

    @Override
    public Persona getPersonaByEmail(Persona persona) {
        String cadena = "%" + persona.getEmail() + "%";
        String consulta = "from Persona p where upper(p.email) like upper(:param1)";
        Query q = em.createQuery(consulta);
        q.setParameter("param1", cadena);
        
        return (Persona) q.getSingleResult();
    }
    
    
    
}
