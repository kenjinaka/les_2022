package com.kenji.les.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Data
@Entity
public class Cliente extends Pessoa {

    private String cpf;
    @Transient
    private Endereco endereco;
}
