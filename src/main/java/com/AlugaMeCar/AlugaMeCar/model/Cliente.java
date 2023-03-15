package com.AlugaMeCar.AlugaMeCar.model;

import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
   @Id
   private int idCliente;
   private String nome;
   private String sobrenome;
   private String data_nascimento;
   private String email;
   private String senha;
   private String telefone;

   @Override
   public String toString() {
      return "Cliente{" +
              "idCliente=" + idCliente +
              ", nome='" + nome + '\'' +
              ", sobrenome='" + sobrenome + '\'' +
              ", data_nascimento='" + data_nascimento + '\'' +
              ", email='" + email + '\'' +
              ", senha='" + senha + '\'' +
              ", telefone='" + telefone + '\'' +
              '}';
   }
}
