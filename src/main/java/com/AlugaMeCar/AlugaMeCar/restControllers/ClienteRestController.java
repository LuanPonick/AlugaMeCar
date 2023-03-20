package com.AlugaMeCar.AlugaMeCar.restControllers;

import com.AlugaMeCar.AlugaMeCar.dto.ClienteDTO;
import com.AlugaMeCar.AlugaMeCar.model.Cliente;
import com.AlugaMeCar.AlugaMeCar.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteRestController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Cliente> findById(@PathVariable Long id) {
        return clienteService.getById(id);
    }
    @GetMapping(value = "/")
    public ResponseEntity<List<ClienteDTO>> findAll(){
        return clienteService.getAll();
    }
    @PostMapping(value = "/")
    public ResponseEntity<Cliente> save(@RequestBody Cliente entity){
        return clienteService.save(entity);
    }

}
