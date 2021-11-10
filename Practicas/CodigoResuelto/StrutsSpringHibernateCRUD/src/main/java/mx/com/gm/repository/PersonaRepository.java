package mx.com.gm.repository;

import mx.com.gm.capadatos.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {

    @Query("select count(*) from Persona")
    public Long countAll();
    
}
