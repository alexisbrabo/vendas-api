package com.alexis.vendas.repository;

import com.alexis.vendas.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Long> {
}
