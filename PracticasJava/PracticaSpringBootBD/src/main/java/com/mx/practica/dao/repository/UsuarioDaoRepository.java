package com.mx.practica.dao.repository;

import com.mx.practica.domain.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDaoRepository extends CrudRepository<Usuario, Long> {

}
