package com.kenji.les.dao;

import com.kenji.les.model.Cliente;
import com.kenji.les.model.EntidadeDominio;
import com.kenji.les.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClienteDAO implements IDAO{
    @Autowired
    private Repository clienteRepository;

    @Override
    public EntidadeDominio salvar(EntidadeDominio entidadeDominio) {
        var cliente = (Cliente) entidadeDominio;
        return clienteRepository.save(cliente);
    }

    @Override
    public EntidadeDominio atualizar(EntidadeDominio entidadeDominio) {
        var clienteBd = clienteRepository.getById(entidadeDominio.getId());
        return clienteRepository.save(clienteBd);
    }

    @Override
    public List<EntidadeDominio> listar() {
        return clienteRepository.findAll();
    }

    @Override
    public void deletar(Long idCliente) {
        clienteRepository.deleteById(idCliente);
    }
}
