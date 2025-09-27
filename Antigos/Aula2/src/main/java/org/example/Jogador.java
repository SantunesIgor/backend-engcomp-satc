package org.example;

public class Jogador {
    String nome;
    String sobrenome;
    String posicao;
    String clube;
    Short idade;

    Jogador(String nome, String sobrenome, String posicao, String clube, Short idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.posicao = posicao;
        this.clube = clube;
        this.idade = idade;
    }
}
