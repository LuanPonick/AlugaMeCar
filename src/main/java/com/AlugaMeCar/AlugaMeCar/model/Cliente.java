package com.AlugaMeCar.AlugaMeCar.model;

import com.AlugaMeCar.AlugaMeCar.dto.ClienteDTO;
import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CLIENTE")
public class Cliente {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id_cliente")
   private Long idCliente;
   @NotBlank
   private String nome;
   @NotBlank
   private String CPF;
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
   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "idEnderoco")
   private Endereco endereco;
   @OneToMany(mappedBy = "idCliente",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
   @JsonManagedReference(value = "cliente-locacao")
   private List<Locacao> idLocacao;

   @Override
   public String toString() {
      return "Cliente{" +
              "idCliente=" + idCliente +
              ", nome='" + nome + '\'' +
              ", CPF='" + CPF + '\'' +
              ", sobrenome='" + sobrenome + '\'' +
              ", data_nascimento='" + data_nascimento + '\'' +
              ", email='" + email + '\'' +
              ", senha='" + senha + '\'' +
              ", telefone='" + telefone + '\'' +
              ", endereco=" + endereco +
              ", idLocacao=" + idLocacao +
              '}';
   }

   public ClienteDTO toDTO(){
      return new ClienteDTO(nome,sobrenome,data_nascimento,email,telefone,endereco,idLocacao);
   }
}
