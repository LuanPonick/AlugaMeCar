package com.AlugaMeCar.AlugaMeCar.model;

import com.AlugaMeCar.AlugaMeCar.dto.LocacaoDTO;
import jakarta.persistence.*;
import lombok.*;


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
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "local_retirada")
    private Endereco localRetirada;
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "local_devolucao")
    private Endereco localDevolucao;

    @ManyToOne
    @JoinColumn(name = "id_cliente",nullable = false)
    private Cliente idCliente;
    @ManyToOne
    @JoinColumn(name = "id_Carro",nullable = false)
    private Carro idCarro;
    @ManyToOne
    @JoinColumn(name = "id_empresa",nullable = false)
    private Empresa idEmpresas;
    public LocacaoDTO toDTO(){
        return new LocacaoDTO(this.dataRetirada,this.dataDevolucao,this.localRetirada,this.localDevolucao);
    }
}
    /*
    {
      "id_carro": 1
    }
"id_cliente": 1
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
