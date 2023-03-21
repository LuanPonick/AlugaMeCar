
package com.AlugaMeCar.AlugaMeCar.model;

import com.AlugaMeCar.AlugaMeCar.dto.CarroDTO;
import com.AlugaMeCar.AlugaMeCar.dto.ClienteDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Data
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carro")
    private Long idCarro;

    @NotBlank
    private String modelo;
    @NotBlank
    private String cor;
    @NotBlank
    private String placa;
    @NotBlank
    @Column(name = "preco_fip")
    private double precoFIP;
    @NotBlank
    private String marca;
    @OneToOne
    private Locacao idLocacao;
    @OneToOne
    private Empresa idEmpresa;
    public CarroDTO toDTO(){
        return new CarroDTO(this.modelo,this.cor,this.placa,this.precoFIP,this.marca);
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