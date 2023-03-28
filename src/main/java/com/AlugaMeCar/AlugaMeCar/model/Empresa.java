package com.AlugaMeCar.AlugaMeCar.model;

import com.AlugaMeCar.AlugaMeCar.dto.ClienteDTO;
import com.AlugaMeCar.AlugaMeCar.dto.EmpresaDTO;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
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
        property = "idEmpresa")
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

    @OneToMany(mappedBy = "idEmpresa",cascade = CascadeType.ALL)
    @JsonManagedReference(value = "empresa-carro")
    @JsonIgnore(value = true)
    private List<Carro> idcarro;
    @OneToMany(mappedBy = "idEmpresas",fetch = FetchType.EAGER)
    @JsonManagedReference(value = "empresa-locacao")
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
