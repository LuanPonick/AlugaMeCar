package com.AlugaMeCar.AlugaMeCar.model;

import com.AlugaMeCar.AlugaMeCar.dto.ClienteDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "CLIENTE")
public class Cliente {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int idCliente;
   @NotBlank
   private String nome;
   @NotBlank
   private String sobrenome;
   @NotBlank
   private String data_nascimento;
   @NotBlank
   private String email;
   @NotBlank
   private String senha;
   @NotBlank
   private String telefone;
   @OneToMany
   private List<Locacao> locacao;
   public ClienteDTO toDTO(){
      return new ClienteDTO(nome,sobrenome,data_nascimento,email,telefone);
   }
}
