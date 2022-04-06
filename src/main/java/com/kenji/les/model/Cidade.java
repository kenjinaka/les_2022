package com.kenji.les.model;

import lombok.Data;

@Data
public class Cidade extends EntidadeDominio{

    private String nome;
    private Estado estado;
}
