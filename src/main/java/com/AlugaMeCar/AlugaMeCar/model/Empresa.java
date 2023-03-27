package com.AlugaMeCar.AlugaMeCar.model;

import com.AlugaMeCar.AlugaMeCar.dto.ClienteDTO;
import com.AlugaMeCar.AlugaMeCar.dto.EmpresaDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_empresa")
    private Long idEmpresa;
    @Column(name="telefone")
    private String telefone;

    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_empresa")
    private Endereco enderecoEmpresa;
    @OneToMany(mappedBy = "idCarro",fetch = FetchType.EAGER)
    private List<Carro> idcarro;
    @OneToMany(mappedBy = "idEmpresas",fetch = FetchType.EAGER)
    private List<Locacao> idLocacao;
    public EmpresaDTO toDTO(){
        return new EmpresaDTO(this.telefone,this.idcarro,this.idLocacao);
    }
    /*

        {
          "telefone": "null",
          "carro": [
            {
              "idcarro": {}
            }
          ]
        }
     */
}
