package com.AlugaMeCar.AlugaMeCar.dto;

import com.AlugaMeCar.AlugaMeCar.model.Carro;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarroDTO {
    private String modelo;
    private String cor;
    private String placa;
    private double precoFIP;
    private String marca;

    public CarroDTO(Carro entity){
        this.modelo = entity.getModelo();
        this.cor = entity.getCor();
        this.placa = entity.getPlaca();
        this.precoFIP = entity.getPrecoFIP();
        this.marca = entity.getMarca();
    }
}
