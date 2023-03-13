package com.AlugaMeCar.AlugaMeCar.model;

public class carro {
    int idCarro;
    String modelo;
    String cor;
    String placa;
    double precoFIP;
    String marca;

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getPrecoFIP() {
        return precoFIP;
    }

    public void setPrecoFIP(double precoFIP) {
        this.precoFIP = precoFIP;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
