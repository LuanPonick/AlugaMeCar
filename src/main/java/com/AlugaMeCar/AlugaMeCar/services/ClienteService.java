package com.AlugaMeCar.AlugaMeCar.services;

import com.AlugaMeCar.AlugaMeCar.dto.ClienteDTO;
import com.AlugaMeCar.AlugaMeCar.model.Cliente;
import com.AlugaMeCar.AlugaMeCar.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public ResponseEntity<Cliente> getById(Long id){
        Optional<Cliente> entity = clienteRepository.findById(id);
        if(entity.isPresent()){
            return new ResponseEntity<Cliente>(entity.get(),HttpStatus.OK);

        }else {
            return ResponseEntity.notFound().build();
        }
    }
    public ResponseEntity<List<ClienteDTO>> getAll(){
        List<ClienteDTO> clienteDTOS = new ArrayList<>();
        for (Cliente cliente : clienteRepository.findAll()){
            clienteDTOS.add(cliente.toDTO());
        }
        return ResponseEntity.ok().body(clienteDTOS);

//        return ResponseEntity.ok().body(clienteRepository.findAll()
//                .stream()
//                .map(cliente -> cliente.toDTO())
//                .collect(Collectors.toList()));
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
    public ResponseEntity<Cliente> reUpdateById(Cliente cliente,Long id){
        Optional<Cliente> optional = clienteRepository.findById(id);
        if(optional.isPresent()){
            cliente.setIdCliente(id);
            Cliente clienteAtualizado = clienteRepository.save(cliente);
            return new ResponseEntity<Cliente>(clienteAtualizado, HttpStatus.OK);

        }else {
            return ResponseEntity.notFound().build();
        }
    }
}
