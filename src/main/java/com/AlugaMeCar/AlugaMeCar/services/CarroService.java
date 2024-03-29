package com.AlugaMeCar.AlugaMeCar.services;

import com.AlugaMeCar.AlugaMeCar.dto.CarroDTO;
import com.AlugaMeCar.AlugaMeCar.dto.ClienteDTO;
import com.AlugaMeCar.AlugaMeCar.model.Carro;
import com.AlugaMeCar.AlugaMeCar.model.Cliente;
import com.AlugaMeCar.AlugaMeCar.repositories.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarroService {
    @Autowired
    private CarroRepository carroRepository;

    public CarroDTO getById(Long id){
        Carro entity = carroRepository.findById(id).get();
        CarroDTO car = new CarroDTO(entity);
        return car;
    }
    public ResponseEntity<List<CarroDTO>> getAll(){
        List<CarroDTO> entitysDTOS = new ArrayList<>();
        for (Carro carro : carroRepository.findAll()){
            entitysDTOS.add(carro.toDTO());
        }
        return ResponseEntity.ok().body(entitysDTOS);

//        return ResponseEntity.ok().body(clienteRepository.findAll()
//                .stream()
//                .map(cliente -> cliente.toDTO())
//                .collect(Collectors.toList()));
    }
    public ResponseEntity<Carro> save(Carro entity){
        Carro reposta = carroRepository.save(entity);
        return new ResponseEntity<Carro>(reposta, HttpStatus.CREATED);
    }
    public ResponseEntity<Carro> deleteById(Long id) {
        if (carroRepository.existsById(id)){
            carroRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.notFound().build();
        }

    }
    public ResponseEntity<Carro> reUpDateById(Carro entity, Long id){
        entity.setIdCarro(id);
        Carro entityUpdate = carroRepository.save(entity);
        return new ResponseEntity<Carro>(entityUpdate, HttpStatus.OK);
    }
}
