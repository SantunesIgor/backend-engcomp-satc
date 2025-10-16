package com.example.JogadorAPI.model;

import com.example.JogadorAPI.repository.JogadorRepository;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "Jogadores")
public class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String nome;
    private String posicao;
    private String time;
    private int idade;

    public Jogador() {}

    public Jogador(String nome, String posicao, String time, int idade) {
        this.nome = nome;
        this.posicao = posicao;
        this.time = time;
        this.idade = idade;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
