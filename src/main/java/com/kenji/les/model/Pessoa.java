package com.kenji.les.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public abstract class Pessoa extends Usuario {

    private String nome;
    private String sobrenome;
}
