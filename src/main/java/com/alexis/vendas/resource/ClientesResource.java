package com.alexis.vendas.resource;

import com.alexis.vendas.model.Cliente;
import com.alexis.vendas.repository.Clientes;
import com.alexis.vendas.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/clientes")
public class ClientesResource {

    @Autowired
    private Clientes clientes;
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> listar() {
        return clientes.findAll();
    }

    @PostMapping
    public Cliente adicionar(@RequestBody @Valid Cliente cliente){
        return clienteService.adicionar(cliente);
    }

    @PutMapping
    public Cliente atualizar(@RequestBody @Valid Cliente cliente){
        return clienteService.adicionar(cliente);
    }

    @DeleteMapping(value = "/delete/{codigo}")
    public void deletar(@PathVariable("codigo") long codigo){
        Cliente v = clientes.findById(codigo).get();
        clienteService.deletar(v);
    }
}
