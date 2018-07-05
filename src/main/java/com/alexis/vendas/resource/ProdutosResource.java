package com.alexis.vendas.resource;

import com.alexis.vendas.model.Produto;
import com.alexis.vendas.repository.Produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/produtos")
public class ProdutosResource {

    @Autowired
    private Produtos produtos;

    @GetMapping
    public List<Produto> listar() {
        return produtos.findAll();
    }
}
