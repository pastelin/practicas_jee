package mx.com.gh.dao;

import org.springframework.data.repository.CrudRepository;
import mx.com.gh.domain.Persona;

public interface PersonaDaoI extends CrudRepository<Persona, Long> {

}
