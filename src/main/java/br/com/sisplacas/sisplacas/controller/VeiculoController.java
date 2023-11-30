package br.com.sisplacas.sisplacas.controller;


import br.com.sisplacas.sisplacas.veiculo.DadosCadastroVeiculo;

import br.com.sisplacas.sisplacas.veiculo.DadosListagemVeiculo;
import br.com.sisplacas.sisplacas.veiculo.Veiculo;
import br.com.sisplacas.sisplacas.veiculo.VeiculoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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

@GetMapping
    public Page<DadosListagemVeiculo> listar(@PageableDefault(size = 10) Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemVeiculo::new);
    }













}
