package com.AlugaMeCar.AlugaMeCar.model;

import com.AlugaMeCar.AlugaMeCar.dto.EmpresaDTO;
import com.AlugaMeCar.AlugaMeCar.dto.EnderecoDTO;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEnderoco;

    private String cidade;
    private String bairro;
    @Column(name = "numero_casa")
    private String numeroCasa;
    private String pais;
    public EnderecoDTO toDTO(){
        return new EnderecoDTO(this.cidade,this.bairro,this.numeroCasa,this.pais);
    }
/*
    {
      "cidade": "",
      "bairro": "",
      "numeroCasa": "",
      "pais": ""
    }
 */

}
