package com.AlugaMeCar.AlugaMeCar.restControllers;

import com.AlugaMeCar.AlugaMeCar.dto.CarroDTO;
import com.AlugaMeCar.AlugaMeCar.dto.EmpresaDTO;
import com.AlugaMeCar.AlugaMeCar.model.Cliente;
import com.AlugaMeCar.AlugaMeCar.model.Empresa;
import com.AlugaMeCar.AlugaMeCar.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaRestController {
    @Autowired
    private EmpresaService empresaService;
    @GetMapping(value = "/")
    public ResponseEntity<List<EmpresaDTO>> findAll(){
        return empresaService.getAll();
    }
    @GetMapping(value = "/{id}")
    public EmpresaDTO findById(@PathVariable Long id){
        return empresaService.getById(id);
    }

    @PostMapping(value = "/")
    public ResponseEntity<Empresa> saveById(@RequestBody Empresa entity){
        return empresaService.save(entity);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Empresa> deleteById(@PathVariable("id") Long id){
        return empresaService.deleteById(id);
    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<Empresa> alterById(@RequestBody Empresa entity, @PathVariable("id") Long id){
        return empresaService.reUpdateById(entity,id);
    }
}
