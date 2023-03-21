package com.AlugaMeCar.AlugaMeCar.services;

import com.AlugaMeCar.AlugaMeCar.dto.EmpresaDTO;
import com.AlugaMeCar.AlugaMeCar.dto.EnderecoDTO;
import com.AlugaMeCar.AlugaMeCar.model.Empresa;
import com.AlugaMeCar.AlugaMeCar.model.Endereco;
import com.AlugaMeCar.AlugaMeCar.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository enderecoRepository;

    public ResponseEntity<List<EnderecoDTO>> getAll(){
        List<EnderecoDTO> entityDTOS = new ArrayList<>();
        for (Endereco endereco : enderecoRepository.findAll()){
            entityDTOS.add(endereco.toDTO());
        }
        return ResponseEntity.ok().body(entityDTOS);

//        return ResponseEntity.ok().body(clienteRepository.findAll()
//                .stream()
//                .map(cliente -> cliente.toDTO())
//                .collect(Collectors.toList()));
    }
    public EnderecoDTO getById(Long id){
        Endereco entity = enderecoRepository.findById(id).get();
        EnderecoDTO end = new EnderecoDTO(entity);
        return end;
    }
    public ResponseEntity<Endereco> save(Endereco entity){
        Endereco reposta = enderecoRepository.save(entity);
        return new ResponseEntity<Endereco>(reposta, HttpStatus.CREATED);
    }
    public ResponseEntity<Endereco> deleteById(Long id) {
        if (enderecoRepository.existsById(id)){
            enderecoRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    public ResponseEntity<Endereco> reUpdateById(Endereco entity, Long id){
        entity.setIdEnderoco(id);
        Endereco entityUpdate = enderecoRepository.save(entity);
        return new ResponseEntity<Endereco>(entityUpdate, HttpStatus.OK);
    }

}