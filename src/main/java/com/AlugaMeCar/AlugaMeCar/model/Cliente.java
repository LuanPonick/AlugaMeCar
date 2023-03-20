package com.AlugaMeCar.AlugaMeCar.model;

import com.AlugaMeCar.AlugaMeCar.dto.ClienteDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cliente {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
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
   public ClienteDTO toDTO(){
      return new ClienteDTO(nome,sobrenome,data_nascimento,email,telefone);

   }
}
