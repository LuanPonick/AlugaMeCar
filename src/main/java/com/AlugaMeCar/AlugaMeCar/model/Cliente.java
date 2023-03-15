package com.AlugaMeCar.AlugaMeCar.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cliente {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long idCliente;
   private String nome;
   private String sobrenome;
   private String data_nascimento;
   private String email;
   private String senha;
   private String telefone;

   @OneToMany
   private List<Locacao> locacoes;
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
