
package com.AlugaMeCar.AlugaMeCar.model;

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