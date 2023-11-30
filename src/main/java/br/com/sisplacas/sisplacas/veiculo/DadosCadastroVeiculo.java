package br.com.sisplacas.sisplacas.veiculo;

import br.com.sisplacas.sisplacas.restricao.Restricao;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;

public record DadosCadastroVeiculo(
        @NotBlank
        String nome,

        Cores cor,
        @NotBlank
        String marca,
        @NotBlank
        String placa,

        @OneToOne(mappedBy = "veiculo")
        Restricao restricao
) {
}






