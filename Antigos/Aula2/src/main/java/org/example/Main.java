package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] nomes = {"William", "Phillipe", "Leo", "Cleiton", "Pedro", "Milionario", "Cláudio", "Ancara", "Douglas", "Wellington"};
        String[] sobrenomes = {"Gaucho", "Coutinho", "Pelé", "Rasta", "Queixada", "JoseRico", "Rato", "Messi", "Ganso", "Pato"};
        String[] clubes = {"Vasco da Gama", "Grêmio", "Criciúma", "Botafogo", "Flamengo", "Fluminense", "Rio Claro", "Athletico Paranaense"};
        String[] posicoes = {"Goleiro", "Zaga", "Lateral", "Meia", "Ponta", "Atacante"};

        Random random = new Random();

        List<Jogador> jogadores = new ArrayList<>();

        for (int i = 1; i <= 11; i++) {
            String nome = nomes[random.nextInt(nomes.length)];
            String sobrenome = sobrenomes[random.nextInt(sobrenomes.length)];
            String clube = clubes[random.nextInt(clubes.length)];
            String posicao = posicoes[random.nextInt(posicoes.length)];
            Short idade = (short) random.nextInt(18, 45);

            Jogador jogador = new Jogador(nome, sobrenome, posicao, clube, idade);
            jogadores.add(jogador);
        }

       for (int i = 0; i < jogadores.size(); i++) {
            Jogador j = jogadores.get(i);
            System.out.println((i + 1) + " - " + j.nome + " " + j.sobrenome
                    + " é um futebolista brasileiro de " + j.idade
                    + " anos que atua como " + j.posicao
                    + ". Atualmente veste a camisa do clube " + j.clube + ".");
        }
    }
}
