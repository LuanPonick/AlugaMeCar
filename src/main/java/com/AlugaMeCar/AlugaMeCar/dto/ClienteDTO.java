package com.AlugaMeCar.AlugaMeCar.dto;

import com.AlugaMeCar.AlugaMeCar.model.Cliente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {
    private String nome;
    private String sobrenome;
    private String data_nascimento;
    private String email;
    private String telefone;

    public ClienteDTO(Cliente cli) {
        nome = cli.getNome();
        sobrenome = cli.getSobrenome();
        data_nascimento = cli.getData_nascimento();
        email = cli.getEmail();
        telefone = cli.getTelefone();
    }

}
