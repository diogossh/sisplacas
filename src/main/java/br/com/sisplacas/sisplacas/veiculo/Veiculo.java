package br.com.sisplacas.sisplacas.veiculo;

import br.com.sisplacas.sisplacas.restricao.Restricao;
import jakarta.persistence.*;
import lombok.*;

//@Table(name = "veiculo")
@Entity
@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "veiculo")
public class Veiculo {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String nome;
    @Enumerated(EnumType.STRING)
    private Cores cor;
    private String marca;
    private String placa;









    @ManyToOne
    @JoinColumn(name = "id_restricao", nullable = true) // nullable = true se o relacionamento for opcional
    private Restricao restricao;


    public Veiculo(DadosCadastroVeiculo dados) {
        this.nome = dados.nome();
        this.cor = dados.cor();
        this.marca = dados.marca();
        this.placa = dados.placa();
        //this.restricao = dados.restricao();
        this.restricao = dados.restricao();

    }
}
