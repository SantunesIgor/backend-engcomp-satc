package com.example.JogadorAPI.repository;

import com.example.JogadorAPI.model.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface JogadorRepository extends JpaRepository<Jogador, UUID> {
    List<Jogador> findByNomeContainingIgnoreCase(String nome);
}
