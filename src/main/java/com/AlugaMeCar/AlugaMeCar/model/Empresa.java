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
    private Long idEmpresa;
    private String telefone;
    @OneToMany
    private List<Carro> idcarro;
    @OneToMany
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
