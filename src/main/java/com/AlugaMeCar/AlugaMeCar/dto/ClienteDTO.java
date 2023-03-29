package com.AlugaMeCar.AlugaMeCar.dto;

import com.AlugaMeCar.AlugaMeCar.model.Cliente;
import com.AlugaMeCar.AlugaMeCar.model.Endereco;
import com.AlugaMeCar.AlugaMeCar.model.Locacao;
import lombok.*;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ClienteDTO {
    private String nome;
    private String sobrenome;
    private String data_nascimento;
    private String email;
    private String telefone;
    private Endereco endereco;
    private List<Locacao> idLocacao;

    public ClienteDTO(@NotNull Cliente cli) {
        nome = cli.getNome();
        sobrenome = cli.getSobrenome();
        data_nascimento = cli.getData_nascimento();
        email = cli.getEmail();
        telefone = cli.getTelefone();
        endereco = cli.getEndereco();
        idLocacao = cli.getIdLocacao();
    }

}
