package com.alexis.vendas.service;

import com.alexis.vendas.model.Produto;
import com.alexis.vendas.repository.Produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private Produtos produtos;

    public Produto adicionar(Produto produto){
        return produtos.save(produto);
    }

    public Produto atualizar(Produto produto){
        return produtos.save(produto);
    }

    public void deletar(Produto produto){
        produtos.delete(produto);
    }
}
