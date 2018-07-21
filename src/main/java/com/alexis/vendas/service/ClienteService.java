package com.alexis.vendas.service;

import com.alexis.vendas.model.Cliente;
import com.alexis.vendas.repository.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private Clientes clientes;

    public Cliente adicionar(Cliente cliente){
        return clientes.save(cliente);
    }

    public Cliente atualizar(Cliente cliente){
        return clientes.save(cliente);
    }

    public void deletar(Cliente cliente){
        clientes.delete(cliente);
    }
}
