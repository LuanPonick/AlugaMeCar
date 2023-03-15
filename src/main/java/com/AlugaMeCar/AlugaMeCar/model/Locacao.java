package com.AlugaMeCar.AlugaMeCar.model;

import jakarta.persistence.*;

@Entity
public class Locacao {
    @Id
    Long idLocacao;
    @ManyToOne
    Cliente cliente;
    @OneToOne
    Carro carro;

    @Column(name = "Data_Retirada")
    String dataRetirada;
    String dataDevolucao;
    String localRetirada;
    String localDevolucao;
}
