package com.AlugaMeCar.AlugaMeCar.services;

import com.AlugaMeCar.AlugaMeCar.dto.LocacaoDTO;
import com.AlugaMeCar.AlugaMeCar.model.Locacao;
import com.AlugaMeCar.AlugaMeCar.repositories.LocacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@Service
public class LocacaoService {
//    @Autowired
//    private LocacaoRepository locacaoRepository;
//
//    public LocacaoDTO getById(Long id){
//        Locacao entity = locacaoRepository.findById(id).get();
//        LocacaoDTO loc = new LocacaoDTO(entity);
//        return loc;
//    }
//    public ResponseEntity<Locacao> save(Locacao entity){
//        Locacao reposta = locacaoRepository.save(entity);
//        return new ResponseEntity<Locacao>(reposta, HttpStatus.CREATED);
//    }
//    public ResponseEntity<Locacao> deleteById(Long id) {
//        if (locacaoRepository.existsById(id)){
//            locacaoRepository.deleteById(id);
//            return ResponseEntity.noContent().build();
//        }else{
//            return ResponseEntity.notFound().build();
//        }
//    }
}