package com.mx.practica.web;

import com.mx.practica.domain.Usuario;
import com.mx.practica.servicio.UsuarioServiceI;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorUsuario {
    
    @Autowired
    UsuarioServiceI usuarioService;
    
    @GetMapping("/")
    public String inicio(Model model) {
        List<Usuario> usuarios = usuarioService.listarUsuarios();
        model.addAttribute("usuarios", usuarios);
        return "index";
    }
}
