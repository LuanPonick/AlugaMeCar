package com.AlugaMeCar.AlugaMeCar.model;

import com.AlugaMeCar.AlugaMeCar.dto.EnderecoDTO;
import com.AlugaMeCar.AlugaMeCar.dto.LocacaoDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Date;
import java.util.List;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class Locacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_locacao")
    private Long idLocacao;
    private String dataRetirada;
    private String dataDevolucao;
    @OneToOne
    private Endereco localRetirada;
    @OneToOne
    private Endereco localDevolucao;
    @OneToMany
    private List<Carro> idcarro;
    @OneToOne
    private Cliente idCliente;
    public LocacaoDTO toDTO(){
        return new LocacaoDTO(this.dataRetirada,this.dataDevolucao,this.localRetirada,this.localDevolucao);
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
      "idLocacao": [
        {
          "idLocacao": null
        },
        {
          "idLocacao": null
        }
      ]
    }
     */
}
