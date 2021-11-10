package com.mx.practica.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="user")
public class Usuario implements Serializable {

    @Id
    @Column(name="id_usuario")
    private Long idUsuario;
    
    private String username;
    
    private String password;
}