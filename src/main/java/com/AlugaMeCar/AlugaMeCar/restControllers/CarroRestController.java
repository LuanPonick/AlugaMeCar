package com.AlugaMeCar.AlugaMeCar.restControllers;

import com.AlugaMeCar.AlugaMeCar.dto.CarroDTO;
import com.AlugaMeCar.AlugaMeCar.model.Carro;
import com.AlugaMeCar.AlugaMeCar.services.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/carro")
public class CarroRestController {
    @Autowired
    private CarroService carroService;

    @GetMapping(value = "/{id}")
    public CarroDTO findById(@PathVariable Long id){
        return carroService.getById(id);
    }

    @PostMapping(value = "/")
    public ResponseEntity<Carro> saveById(@RequestBody Carro entity){
        return carroService.save(entity);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Carro> deleterById(@PathVariable("id") Long id){
        return carroService.deleteById(id);
    }
}
