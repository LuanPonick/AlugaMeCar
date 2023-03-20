package com.AlugaMeCar.AlugaMeCar.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Locacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLocacao;
    @NotBlank
    private Long idCliente;
    @NotBlank
    @OneToOne
    private Carro carro;
    //@Column(name = "Data_Retirada")
    private String dataRetirada;
    @NotBlank
    private String dataDevolucao;
    @NotBlank
    private Endereco localRetirada;
    @NotBlank
    private Endereco localDevolucao;
}
