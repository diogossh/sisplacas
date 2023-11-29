package br.com.sisplacas.sisplacas.veiculo;

import br.com.sisplacas.sisplacas.restricao.Restricao;
import br.com.sisplacas.sisplacas.veiculo.Cores;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Veiculo {

    private Long id;
    private String nome;
    private String modelo;
    private Cores cor;
    private String marca;
    private String placa;
    private Restricao restricao;


}
