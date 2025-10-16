package com.example.GeradorDeJogador;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class GJService {
    ArrayList<Jogador> jogadores = new ArrayList<>();
    String[] nomes = {"João", "José", "Antônio", "Francisco", "Carlos", "Paulo", "Pedro", "Lucas", "Luiz", "Marcos", "Gabriel", "Rafael"};
    String[] sobrenomes = {"da Silva", "Santos", "Oliveira", "Souza", "Rodrigues", "Ferreira", "Costa", "Alves", "Moura", "Lima", "Carvalho"};
    Random r = new Random();

    public Jogador GerarJogador(String time, String posicao){
        jogadores.add(new Jogador(
                nomes[r.nextInt(nomes.length)],
                sobrenomes[r.nextInt(sobrenomes.length)],
                r.nextInt(18, 41),
                posicao.substring(0, 1).toUpperCase() + posicao.substring(1).toLowerCase(),
                time.substring(0, 1).toUpperCase() + time.substring(1).toLowerCase()
                )
        );

        return jogadores.get(jogadores.size() - 1);
    }
}
