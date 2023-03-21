package com.AlugaMeCar.AlugaMeCar.services;

import com.AlugaMeCar.AlugaMeCar.dto.EnderecoDTO;
import com.AlugaMeCar.AlugaMeCar.dto.LocacaoDTO;
import com.AlugaMeCar.AlugaMeCar.model.Endereco;
import com.AlugaMeCar.AlugaMeCar.model.Locacao;
import com.AlugaMeCar.AlugaMeCar.repositories.LocacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocacaoService {
    @Autowired
    private LocacaoRepository locacaoRepository;

    public ResponseEntity<List<LocacaoDTO>> getAll(){
        List<LocacaoDTO> entityDTOS = new ArrayList<>();
        for (Locacao locacao : locacaoRepository.findAll()){
            entityDTOS.add(locacao.toDTO());
        }
        return ResponseEntity.ok().body(entityDTOS);

//        return ResponseEntity.ok().body(clienteRepository.findAll()
//                .stream()
//                .map(cliente -> cliente.toDTO())
//                .collect(Collectors.toList()));
    }
    public LocacaoDTO getById(Long id){
        Locacao entity = locacaoRepository.findById(id).get();
        LocacaoDTO loc = new LocacaoDTO(entity);
        return loc;
    }
    public ResponseEntity<Locacao> save(Locacao entity){
        Locacao reposta = locacaoRepository.save(entity);
        return new ResponseEntity<Locacao>(reposta, HttpStatus.CREATED);
    }
    public ResponseEntity<Locacao> deleteById(Long id) {
        if (locacaoRepository.existsById(id)){
            locacaoRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    public ResponseEntity<Locacao> reUpdateById(Locacao entity, Long id){
        entity.setIdLocacao(id);
        Locacao entityUpdate = locacaoRepository.save(entity);
        return new ResponseEntity<Locacao>(entityUpdate, HttpStatus.OK);
    }
}