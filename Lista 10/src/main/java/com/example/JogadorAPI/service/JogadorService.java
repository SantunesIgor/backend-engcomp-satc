package com.example.JogadorAPI.service;

import com.example.JogadorAPI.model.Jogador;
import com.example.JogadorAPI.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class JogadorService {
    @Autowired
    private JogadorRepository jogadorRepository;

    public JogadorService(JogadorRepository jogadorRepository) {
        this.jogadorRepository = jogadorRepository;
    }

    public List<Jogador> listarTodos() {
        return jogadorRepository.findAll();
    }

    public Optional<Jogador> buscarPorId(UUID id) {
        return jogadorRepository.findById(id);
    }

    public List<Jogador> buscarPorNome(String nome) {
        return jogadorRepository.findByNomeContainingIgnoreCase(nome);
    }

    public Jogador criar(Jogador jogador) {
        return jogadorRepository.save(jogador);
    }

    public void deletar(UUID id) {
        if (!jogadorRepository.existsById(id)) {
            throw new RuntimeException("Jogador não encontrado!");
        }
        jogadorRepository.deleteById(id);
    }
}
