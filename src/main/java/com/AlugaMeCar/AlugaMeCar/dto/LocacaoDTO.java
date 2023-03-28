package com.AlugaMeCar.AlugaMeCar.dto;

import com.AlugaMeCar.AlugaMeCar.model.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class LocacaoDTO {
    private String dataRetirada;
    private String dataDevolucao;
    private Endereco localRetirada;
    private Endereco localDevolucao;
    private Cliente idCliente;
    private Carro idCarro;
    private Empresa idEmpresas;

    public LocacaoDTO(Locacao entity) {
        this.dataRetirada = entity.getDataRetirada();
        this.dataDevolucao = entity.getDataDevolucao();
        this.localRetirada = entity.getLocalRetirada();
        this.localDevolucao = entity.getLocalDevolucao();
        this.idCliente = entity.getIdCliente();
        this.idCarro = entity.getIdCarro();
        this.idEmpresas = entity.getIdEmpresas();

    }
}
