package com.AlugaMeCar.AlugaMeCar.model;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Locacao {
    @Id
    Long idLocacao;
    Long idCliente;
    Long idCarro;

    //@Column(name = "Data_Retirada")
    String dataRetirada;
    String dataDevolucao;
    String localRetirada;
    String localDevolucao;
}
