package com.kenji.les.model;

import lombok.Data;

@Data
public class Estado extends EntidadeDominio{

    private String nome;
    private Pais pais;
}
