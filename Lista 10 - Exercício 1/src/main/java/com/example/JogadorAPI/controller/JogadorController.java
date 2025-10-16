package com.example.JogadorAPI.controller;

import com.example.JogadorAPI.model.Jogador;
import com.example.JogadorAPI.service.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {
    @Autowired
    private JogadorService service;

    @GetMapping
    public List<Jogador> listarTodos(@RequestParam(required = false) String nome) {
        if (nome != null) {
            return service.buscarPorNome(nome);
        }
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Jogador buscarPorId(@PathVariable UUID id) {
        return service.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Jogador não encontrado"));
    }

    @PostMapping
    public Jogador criar(@RequestBody Jogador jogador) {
        return service.criar(jogador);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable UUID id) {
        service.deletar(id);
    }
}
