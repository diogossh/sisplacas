package br.com.sisplacas.sisplacas.restricao;


import br.com.sisplacas.sisplacas.veiculo.Veiculo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


//@Table(name = "restricao")
@Entity(name = "Restricao")

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

    @OneToOne
    @JoinColumn(name = "id_restricao")
    private Veiculo veiculo;


}


