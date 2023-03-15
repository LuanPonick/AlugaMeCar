package com.AlugaMeCar.AlugaMeCar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Carro {
    @Id
    Long idCarro;
    String modelo;
    String cor;
    String placa;
    double precoFIP;
    String marca;
}
