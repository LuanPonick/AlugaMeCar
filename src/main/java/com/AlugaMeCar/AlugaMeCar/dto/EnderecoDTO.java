package com.AlugaMeCar.AlugaMeCar.dto;

import com.AlugaMeCar.AlugaMeCar.model.Endereco;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EnderecoDTO {
    private String cidade;
    private String bairro;
    private String numero_Casa;
    private String pais;

    public EnderecoDTO(Endereco entity) {
        this.cidade = entity.getCidade();
        this.bairro = entity.getBairro();
        this.numero_Casa = entity.getNumeroCasa();
        this.pais = entity.getPais();
    }
}
