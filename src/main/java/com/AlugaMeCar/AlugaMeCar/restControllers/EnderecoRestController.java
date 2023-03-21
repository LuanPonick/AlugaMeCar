package com.AlugaMeCar.AlugaMeCar.restControllers;

import com.AlugaMeCar.AlugaMeCar.dto.CarroDTO;
import com.AlugaMeCar.AlugaMeCar.dto.EnderecoDTO;
import com.AlugaMeCar.AlugaMeCar.model.Empresa;
import com.AlugaMeCar.AlugaMeCar.model.Endereco;
import com.AlugaMeCar.AlugaMeCar.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/endereco")
public class EnderecoRestController {
    @Autowired
    private EnderecoService enderecoService;
    @GetMapping(value = "/")
    public ResponseEntity<List<EnderecoDTO>> findAll(){
        return enderecoService.getAll();
    }
    @GetMapping(value = "/{id}")
    public EnderecoDTO findById(@PathVariable Long id){
        return enderecoService.getById(id);
    }

    @PostMapping(value = "/")
    public ResponseEntity<Endereco> saveById(@RequestBody Endereco entity){
        return enderecoService.save(entity);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Endereco> deleteById(@PathVariable("id") Long id){
        return enderecoService.deleteById(id);
    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<Endereco> alterById(@RequestBody Endereco entity, @PathVariable("id") Long id){
        return enderecoService.reUpdateById(entity,id);
    }
}
