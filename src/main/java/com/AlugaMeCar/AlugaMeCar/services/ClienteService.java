package com.AlugaMeCar.AlugaMeCar.services;

import com.AlugaMeCar.AlugaMeCar.dto.ClienteDTO;
import com.AlugaMeCar.AlugaMeCar.model.Cliente;
import com.AlugaMeCar.AlugaMeCar.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteDTO getById(Long id){
        Cliente entity = clienteRepository.findById(id).get();
        ClienteDTO cli = new ClienteDTO(entity);
        return cli;
    }
    public ResponseEntity<Cliente> save(Cliente entity){
        Cliente reposta = clienteRepository.save(entity);
        return new ResponseEntity<Cliente>(reposta, HttpStatus.CREATED);
    }
    public ResponseEntity<Cliente> deleteById(Long id) {
        if (clienteRepository.existsById(id)){
            clienteRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }
}
