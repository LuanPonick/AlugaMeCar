package com.AlugaMeCar.AlugaMeCar.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {
    int idCliente;
    String nome;
    String sobrenome;
    String data_nascimento;
    String email;
    String senha;
    String telefone;
}
