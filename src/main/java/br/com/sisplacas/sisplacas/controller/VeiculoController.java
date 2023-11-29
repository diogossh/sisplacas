package br.com.sisplacas.sisplacas.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("veiculo")
public class VeiculoController {


    @GetMapping
    public String teste(){
        return "olá chegou aqui!!";
    }













}
