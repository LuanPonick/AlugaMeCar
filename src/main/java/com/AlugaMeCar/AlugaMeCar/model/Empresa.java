package com.AlugaMeCar.AlugaMeCar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Empresa {
    @Id
    private Long idEmpresa;
    private String telefone;
    @ManyToOne
    @JoinColumn(name = "fk_emp_car")
    private Carro idcarro;
}
