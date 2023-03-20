package com.AlugaMeCar.AlugaMeCar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Endereco {
    @Id
    Long idEnderoco;
    Long idCliente;
    Long idCarro;
    Long idEmpresa;

    String cidade;
    String bairro;
    String numero_Casa;
    String pais;


}
