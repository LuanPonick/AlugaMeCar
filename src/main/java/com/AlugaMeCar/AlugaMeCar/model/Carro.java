
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
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idCarro;
    @OneToOne
    private Locacao locacao;
    @NotBlank
    String modelo;
    @NotBlank
    String cor;
    @NotBlank
    String placa;
    @NotBlank
    double precoFIP;
    @NotBlank
    String marca;
}