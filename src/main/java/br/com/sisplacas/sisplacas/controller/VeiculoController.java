package br.com.sisplacas.sisplacas.controller;


import br.com.sisplacas.sisplacas.veiculo.DadosCadastroVeiculo;
import br.com.sisplacas.sisplacas.veiculo.Veiculo;
import br.com.sisplacas.sisplacas.veiculo.VeiculoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("veiculo")
public class VeiculoController {


    @Autowired
    private VeiculoRepository repository;



    @PostMapping
    @Transactional
    public void novoVeiculo(@RequestBody @Valid DadosCadastroVeiculo dados){
        repository.save(new Veiculo(dados));

    }













}
