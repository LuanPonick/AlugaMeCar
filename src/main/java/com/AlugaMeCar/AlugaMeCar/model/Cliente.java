package com.AlugaMeCar.AlugaMeCar.model;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {
   @Id
   private int idCliente;
   private String nome;
   private String sobrenome;
   private String data_nascimento;
   private String email;
   private String senha;
   private String telefone;


}
