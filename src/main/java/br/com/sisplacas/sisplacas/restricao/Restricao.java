package br.com.sisplacas.sisplacas.restricao;


import br.com.sisplacas.sisplacas.veiculo.Veiculo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


//@Table(name = "restricao")
@Entity

//@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Restricao {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    @OneToOne(mappedBy = "veiculo")
    private Veiculo veiculo;

}
