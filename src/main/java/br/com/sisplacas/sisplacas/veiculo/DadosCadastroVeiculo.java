package br.com.sisplacas.sisplacas.veiculo;

import br.com.sisplacas.sisplacas.restricao.Restricao;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroVeiculo(
        @NotBlank
        String nome,

        Cores cor,
        @NotBlank
        String marca,
        @NotBlank
        String placa,

        Restricao restricao) {
}






