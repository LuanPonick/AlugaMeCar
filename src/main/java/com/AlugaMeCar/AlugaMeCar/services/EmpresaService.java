package com.AlugaMeCar.AlugaMeCar.services;

import com.AlugaMeCar.AlugaMeCar.dto.ClienteDTO;
import com.AlugaMeCar.AlugaMeCar.dto.EmpresaDTO;
import com.AlugaMeCar.AlugaMeCar.model.Carro;
import com.AlugaMeCar.AlugaMeCar.model.Cliente;
import com.AlugaMeCar.AlugaMeCar.model.Empresa;
import com.AlugaMeCar.AlugaMeCar.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaService {
    @Autowired
    private EmpresaRepository empresaRepository;

    public ResponseEntity<List<EmpresaDTO>> getAll(){
        List<EmpresaDTO> entityDTOS = new ArrayList<>();
        for (Empresa empresa : empresaRepository.findAll()){
            entityDTOS.add(empresa.toDTO());
        }
        return ResponseEntity.ok().body(entityDTOS);

//        return ResponseEntity.ok().body(clienteRepository.findAll()
//                .stream()
//                .map(cliente -> cliente.toDTO())
//                .collect(Collectors.toList()));
    }
    public EmpresaDTO getById(Long id){
        Empresa entity = empresaRepository.findById(id).get();
        EmpresaDTO emp = new EmpresaDTO(entity);
        return emp;
    }
    public ResponseEntity<Empresa> save(Empresa entity){
        Empresa reposta = empresaRepository.save(entity);
        return new ResponseEntity<Empresa>(reposta, HttpStatus.CREATED);
    }
    public ResponseEntity<Empresa> deleteById(Long id) {
        if (empresaRepository.existsById(id)){
            empresaRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    public ResponseEntity<Empresa> reUpdateById(Empresa entity, Long id){
        entity.setIdEmpresa(id);
        Empresa entityUpdate = empresaRepository.save(entity);
        return new ResponseEntity<Empresa>(entityUpdate, HttpStatus.OK);
    }

}