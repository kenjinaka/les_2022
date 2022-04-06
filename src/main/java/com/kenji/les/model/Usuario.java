package com.kenji.les.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public abstract class Usuario extends EntidadeDominio {

    private String user;
    private String email;
    private String senha;
}
