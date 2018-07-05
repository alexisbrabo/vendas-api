package com.alexis.vendas.repository;

import com.alexis.vendas.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Clientes extends JpaRepository<Cliente, Long> {

}
