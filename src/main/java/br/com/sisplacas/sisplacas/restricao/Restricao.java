package br.com.sisplacas.sisplacas.restricao;


import br.com.sisplacas.sisplacas.veiculo.Veiculo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


//@Table(name = "restricao")
@Entity
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restricao {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;




}


