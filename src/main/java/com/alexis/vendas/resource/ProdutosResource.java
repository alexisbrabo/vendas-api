package com.alexis.vendas.resource;

import com.alexis.vendas.model.Produto;
import com.alexis.vendas.repository.Produtos;
import com.alexis.vendas.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/produtos")
public class ProdutosResource {

    @Autowired
    private Produtos produtos;
    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> listar() {
        return produtos.findAll();
    }

    @PostMapping
    public Produto adicionar(@RequestBody @Valid Produto produto){
        return produtoService.adicionar(produto);
    }

    @PutMapping
    public Produto atualizar(@RequestBody @Valid Produto produto){
        return produtoService.adicionar(produto);
    }

    @DeleteMapping(value = "/delete/{codigo}")
    public void deletar(@PathVariable("codigo") long codigo){
        Produto v = produtos.findById(codigo).get();
        produtoService.deletar(v);
    }
}
