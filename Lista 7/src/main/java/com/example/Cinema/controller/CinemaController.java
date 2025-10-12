package com.example.Cinema.controller;

import com.example.Cinema.dto.FilmeUpdateDTO;
import com.example.Cinema.model.Filme;
import com.example.Cinema.model.Ingresso;
import com.example.Cinema.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/")
public class CinemaController {
    @Autowired
    private CinemaService service;

    @GetMapping("filmes")
    public List<Filme> listarFilmes(){
        return service.listarFilmes();
    }

    @GetMapping("ingressos")
    public List<Ingresso> listarIngressos(){
        return service.listarIngressos();
    }

    @PostMapping("filmes")
    public Filme criarFilme(@RequestParam String titulo,
                            @RequestParam String genero,
                            @RequestParam int capacidade){
        return service.criarFilme(titulo, genero, capacidade);
    }

    @PostMapping("filmes/{id}/ingressos")
    public Ingresso comprarIngresso(@PathVariable UUID id,
                                    @RequestParam int assento){
        return service.comprarIngresso(id, assento);
    }

    @PatchMapping("filmes/{id}")
    public Filme editarFilme(@PathVariable UUID id,
                             @RequestBody FilmeUpdateDTO dto){
        return service.editarFilme(id, dto);
    }

    @DeleteMapping("filmes/{id}")
    public Filme deletarFilme(@PathVariable UUID id){
        return service.deletarFilme(id);
    }

    @DeleteMapping("filmes/{id}/ingressos/{ingressoId}")
    public Ingresso deletarIngresso(@PathVariable UUID id,
                                    @PathVariable UUID ingressoId){
        return service.deletarIngresso(id, ingressoId);
    }
}
