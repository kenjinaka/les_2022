package com.kenji.les.repository;

import com.kenji.les.model.Cliente;
import com.kenji.les.model.EntidadeDominio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<EntidadeDominio, Long> {

}