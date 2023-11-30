package br.com.sisplacas.sisplacas.veiculo;

import br.com.sisplacas.sisplacas.restricao.Restricao;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public record DadosListagemVeiculo(

        Long id,
         String nome,
         Cores cor,
         String marca,
         String placa,
        Restricao restricao




) {

    public DadosListagemVeiculo(Veiculo veiculo){
        this(veiculo.getId(),veiculo.getNome(),veiculo.getCor(),veiculo.getMarca(),veiculo.getPlaca(),veiculo.getRestricao());
    }







}
