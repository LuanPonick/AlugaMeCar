package com.AlugaMeCar.AlugaMeCar.restControllers;

import com.AlugaMeCar.AlugaMeCar.dto.LocacaoDTO;
import com.AlugaMeCar.AlugaMeCar.model.Endereco;
import com.AlugaMeCar.AlugaMeCar.model.Locacao;
import com.AlugaMeCar.AlugaMeCar.services.LocacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/locacao")
public class LocacaoRestController {
    @Autowired
    private LocacaoService locacaoService;

    @GetMapping(value = "/{id}")
    public LocacaoDTO findById(@PathVariable Long id){
        return locacaoService.getById(id);
    }

    @PostMapping(value = "/")
    public ResponseEntity<Locacao> saveById(@RequestBody Locacao entity){
        return locacaoService.save(entity);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Locacao> deleteById(@PathVariable("id") Long id){
        return locacaoService.deleteById(id);
    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<Locacao> alterById(@RequestBody Locacao entity, @PathVariable("id") Long id){
        return locacaoService.reUpdateById(entity,id);
    }
}