package com.alexis.vendas.resource;

import com.alexis.vendas.model.Venda;
import com.alexis.vendas.repository.Vendas;
import com.alexis.vendas.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/vendas")
public class VendasResource {

    @Autowired
    private Vendas vendas;
    @Autowired
    private VendaService vendaService;

    @GetMapping
    public List<Venda> listar() {
        return vendas.findAll();
    }

    @PostMapping
    public Venda adicionar(@RequestBody @Valid Venda venda){
        return vendaService.adicionar(venda);
    }

    @DeleteMapping(value = "/delete/{codigo}")
    public void deletar(@PathVariable("codigo") long codigo){
       Venda v = vendas.findById(codigo).get();
       vendaService.deletar(v);
    }
}
