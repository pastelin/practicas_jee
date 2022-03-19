package com.mx.practica.servicio;

import com.mx.practica.dao.repository.UsuarioDaoRepository;
import com.mx.practica.domain.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioServiceI {

    @Autowired
    UsuarioDaoRepository usuarioDao;

    @Override
    public List<Usuario> listarUsuarios() {
        return (List<Usuario>)usuarioDao.findAll();
    }

}
