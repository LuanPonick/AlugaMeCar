package com.AlugaMeCar.AlugaMeCar.model;

import com.AlugaMeCar.AlugaMeCar.dto.EmpresaDTO;
import com.AlugaMeCar.AlugaMeCar.dto.EnderecoDTO;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@JsonIdentityInfo(
//        generator = ObjectIdGenerators.PropertyGenerator.class,
//        property = "idEnderoco")
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
}
