package com.AlugaMeCar.AlugaMeCar.dto;

import com.AlugaMeCar.AlugaMeCar.model.Locacao;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LocacaoDTO {
    String dataRetirada;
    String dataDevolucao;
    String localRetirada;
    String localDevolucao;

    public LocacaoDTO(Locacao entity) {
        this.dataRetirada = entity.getDataRetirada();
        this.dataDevolucao = entity.getDataDevolucao();
        this.localRetirada = entity.getLocalRetirada();
        this.localDevolucao = entity.getLocalDevolucao();
    }
}
