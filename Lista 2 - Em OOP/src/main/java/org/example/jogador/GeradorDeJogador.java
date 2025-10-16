package org.example.jogador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class GeradorDeJogador {
    public static void main(String[] args) {
        Jogador j = new Jogador();

        System.out.println(
                j.getNome() +
                " " +
                j.getSobrenome() +
                " é um futebolista brasileiro de " +
                j.getIdade() +
                " anos que atua como " +
                j.getPosicao() +
                ". Atualmente defende o " +
                j.getTime() +
                "."
        );
    }
}
