
package com.AlugaMeCar.AlugaMeCar.model;

import com.AlugaMeCar.AlugaMeCar.dto.CarroDTO;
import com.AlugaMeCar.AlugaMeCar.dto.ClienteDTO;
import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter

@ToString
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "idCarro")
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carro")
    private Long idCarro;

    private String modelo;
    private String cor;
    private String placa;
    @Column(name = "preco_fip")
    private double precoFIP;
    private String marca;
    @Column(name = "em_uso")
    private Boolean emUso;

    @OneToMany(mappedBy = "idCarro",fetch = FetchType.EAGER)
    @JsonManagedReference(value = "locacao-carro")
    private List<Locacao> idLocacao;
    @ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    @JoinColumn(name = "idcarro")
    @JsonBackReference(value = "empresa-carro")
    private Empresa idEmpresa;
    public CarroDTO toDTO(){
        return new CarroDTO(this.modelo,this.cor,this.placa,this.precoFIP,this.marca,this.idEmpresa);
    }



    /*
    {
        "modelo": "teste",
        "cor": "vermelho",
        "placa": "12312312",
        "preco_fip": 20000,
        "marca": "teste",
        "idLocacao": "null",
        "idEmpresa": "null"
    }
    */
}