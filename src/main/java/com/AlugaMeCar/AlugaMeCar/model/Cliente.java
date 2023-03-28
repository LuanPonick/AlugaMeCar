package com.AlugaMeCar.AlugaMeCar.model;

import com.AlugaMeCar.AlugaMeCar.dto.ClienteDTO;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
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
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "idCliente")
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




   @OneToMany(mappedBy = "idCliente",fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
   @JsonManagedReference(value = "cliente-locacao")
   private List<Locacao> idLocacao;





   public ClienteDTO toDTO(){
      return new ClienteDTO(nome,sobrenome,data_nascimento,email,telefone,endereco);
   }

   /*
   {
     "nome": "",
     "sobrenome": "",
     "data_nascimento": "",
     "email": "",
     "senha": "",
     "telefone": "",
     "endereco_id": "",
     "idLocacao": []
}
{
  "nome": "",
  "sobrenome": "",
  "data_nascimento": "",
  "email": "",
  "senha": "",
  "telefone": "",
  "endereco":{
      cidade:"",
      bairro:"",
      numeroCasa:"",
      pais:""
  },
  "idLocacao": [
    {
      "id_locacao": null
    }
  ]
}
    */
}
