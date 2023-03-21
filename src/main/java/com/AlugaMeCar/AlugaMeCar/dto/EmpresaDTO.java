package com.AlugaMeCar.AlugaMeCar.dto;

import com.AlugaMeCar.AlugaMeCar.model.Carro;
import com.AlugaMeCar.AlugaMeCar.model.Empresa;
import com.AlugaMeCar.AlugaMeCar.model.Locacao;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmpresaDTO {
    private String telefone;
    private List<Carro> idcarros;
    private List<Locacao> locacaos;

    public EmpresaDTO(Empresa entity){
        this.telefone = entity.getTelefone();
//        this.idcarros = entity.getIdcarros();
//        this.locacaos = entity.getLocacaos();
    }
}
