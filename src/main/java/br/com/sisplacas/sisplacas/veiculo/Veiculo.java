package br.com.sisplacas.sisplacas.veiculo;

import br.com.sisplacas.sisplacas.restricao.Restricao;
import br.com.sisplacas.sisplacas.veiculo.Cores;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "veiculo")
@Entity(name = "Veiculo")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Veiculo {



    @Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String nome;
    @Enumerated(EnumType.STRING)
    private Cores cor;
    private String marca;
    private String placa;


    @ManyToOne
    @JoinTable(
            name = "veiculo_restricao",
            joinColumns = @JoinColumn(name = "veiculo_id"),
            inverseJoinColumns = @JoinColumn(name = "restricao_id")
    )

    private Restricao restricao;


    public Veiculo(DadosCadastroVeiculo dados) {
        this.nome = dados.nome();
        this.cor = dados.cor();
        this.marca = dados.marca();
        this.placa = dados.placa();
        this.restricao = dados.restricao();

    }
}
