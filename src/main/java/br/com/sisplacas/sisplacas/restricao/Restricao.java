package br.com.sisplacas.sisplacas.restricao;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "restricao")
@Entity(name = "Restricao")
@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Restricao {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String nome;

}
