package com.AlugaMeCar.AlugaMeCar.model;

import com.AlugaMeCar.AlugaMeCar.dto.LocacaoDTO;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class Locacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_locacao")
    private Long idLocacao;
    private String dataRetirada;
    private String dataDevolucao;
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "local_retirada")
    private Endereco localRetirada;
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "local_devolucao")
    private Endereco localDevolucao;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_cliente")
    @JsonBackReference(value = "cliente-locacao")
    @JsonIdentityInfo(scope = Cliente.class,property = "idCliente",generator = ObjectIdGenerators.PropertyGenerator.class)
    private Cliente idCliente;
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_Carro")
    @JsonBackReference(value = "locacao-carro")
    @JsonIdentityInfo(scope = Carro.class, property = "idCarro",generator = ObjectIdGenerators.PropertyGenerator.class)
    private Carro idCarro;


    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_empresa")
    @JsonBackReference(value = "empresa-locacao")
    @JsonIdentityInfo(property = "idEmpresa",generator = ObjectIdGenerators.PropertyGenerator.class)
    private Empresa idEmpresas;
    public LocacaoDTO toDTO(){
        return new LocacaoDTO(this.dataRetirada,this.dataDevolucao,this.localRetirada,this.localDevolucao,this.idCliente,this.idCarro,this.idEmpresas);
    }
}