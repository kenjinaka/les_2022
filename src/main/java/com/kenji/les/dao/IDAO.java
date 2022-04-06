package com.kenji.les.dao;

import com.kenji.les.model.EntidadeDominio;

import java.util.List;

public interface IDAO {

    EntidadeDominio salvar(EntidadeDominio entidadeDominio);

    EntidadeDominio atualizar(EntidadeDominio entidadeDominio);

    List<EntidadeDominio> listar();

    void deletar(Long id);
}
