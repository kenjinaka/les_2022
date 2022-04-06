package com.kenji.les.model;

import lombok.Data;

@Data
public class Endereco extends EntidadeDominio{

    private String logradouro;
    private Cidade cidade;
}
