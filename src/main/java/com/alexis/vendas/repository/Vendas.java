package com.alexis.vendas.repository;

import com.alexis.vendas.model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Vendas extends JpaRepository<Venda, Long> {
}
