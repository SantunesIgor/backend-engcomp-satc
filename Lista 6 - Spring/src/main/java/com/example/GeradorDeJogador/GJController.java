package com.example.GeradorDeJogador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GJController {
    @Autowired
    private GJService gjService;

    @GetMapping("/")
    public String TelaIncial(){
        return "Digite 'gerarjogador/time/posicao' para gerar um jogador aleatório.";
    }

    @GetMapping("/gerarjogador/{time}/{posicao}")
    public Jogador GetParamGerarJogador(@PathVariable String time, @PathVariable String posicao){
        return gjService.GerarJogador(time, posicao);
    }
}
