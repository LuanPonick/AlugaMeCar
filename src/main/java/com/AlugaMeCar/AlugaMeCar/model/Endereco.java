package com.AlugaMeCar.AlugaMeCar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Endereco {
    @Id
    Long idCliente;
    Long idCarro;
    Long idEmpresa;
    String cidade;
    String bairro;
    String numero_Casa;
    String pais;


}