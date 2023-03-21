package com.AlugaMeCar.AlugaMeCar.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Date;
import java.util.List;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class Locacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_locacao")
    private Long idLocacao;
    private String dataRetirada;
    private String dataDevolucao;
    @OneToOne
    private Endereco localRetirada;
    @OneToOne
    private Endereco localDevolucao;
    @OneToOne
    private List<Carro> idcarro;

    @OneToOne
    private List<Cliente> idCliente;
}
