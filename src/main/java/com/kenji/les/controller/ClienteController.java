package com.kenji.les.controller;


import com.kenji.les.dao.ClienteDAO;
import com.kenji.les.model.Cliente;
import com.kenji.les.model.EntidadeDominio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteDAO clienteDAO;

    @PostMapping
    public Cliente salvar(@Valid @RequestBody Cliente cliente) {
        return (Cliente) clienteDAO.salvar(cliente);
    }

    @GetMapping
    public List<EntidadeDominio> listar(){
        return clienteDAO.listar();
    }

    @PatchMapping(value = "/{id}")
    public Cliente atualizar(@RequestBody Cliente cliente){
        return (Cliente) clienteDAO.atualizar(cliente);
    }

    @DeleteMapping(value = "/{id}")
    public String deletar(@PathVariable("id") Long idCliente){
        clienteDAO.deletar(idCliente);
        return "Cliente excluido com sucesso!";
    }
}
