package com.AlugaMeCar.AlugaMeCar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Empresa {
    @Id
    Long idEmpresa;
    Long idcarro;
    Long idCliente;
    String telefone;

}
