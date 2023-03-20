package com.AlugaMeCar.AlugaMeCar.restControllers;

import com.AlugaMeCar.AlugaMeCar.dto.ClienteDTO;
import com.AlugaMeCar.AlugaMeCar.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteRestController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping(value = "/{id}")
    public ClienteDTO findById(@PathVariable Long id){
        return clienteService.getById(id);
    }

    @GetMapping(value = "/teste")
    public ClienteDTO teste(){
        return clienteService.getById(1l);
    }
}
