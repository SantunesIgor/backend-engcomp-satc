package org.example.jogador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Jogador {
    private String nome;
    private String sobrenome;
    private String posicao;
    private String time;
    private int idade;

    public Jogador() {
        Random rand = new Random();

        ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Léo", "Pualo", "Carlos", "Robert", "Puma", "Cauan", "Hugo", "Rayan", "Philippe", "Nuno", "Pablo"));
        ArrayList<String> sobrenomes = new ArrayList<>(Arrays.asList("Jardim", "Oliveira", "Cuesta", "Alves", "Rodriguez", "Barros", "Moura", "Simplicio", "Coutinho", "Moreira", "Vegetti"));
        ArrayList<String> posicoes = new ArrayList<>(Arrays.asList("Goleiro", "Lateral", "Zagueiro", "Volante", "Meia", "Ponta", "Atacante", "Centroavante"));
        ArrayList<String> times = new ArrayList<>(Arrays.asList("Caxias", "Ponte Preta", "Nautico", "Londrina", "São Bernardo", "Brusque", "Guarani", "Floresta", "Confiança", "Ypiranga", "Maringá", "Ituano", "Botafogo-PB", "Figueirense", "Anápolis", "Itabaiana", "CSA", "ABC", "Retrô", "Tombense"));

        this.nome = nomes.get(rand.nextInt(nomes.size()));
        this.sobrenome = sobrenomes.get(rand.nextInt(sobrenomes.size()));
        this.posicao = posicoes.get(rand.nextInt(posicoes.size()));
        this.time = times.get(rand.nextInt(times.size()));
        this.idade = (rand.nextInt(22) + 18);
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getPosicao() {
        return posicao;
    }

    public String getTime() {
        return time;
    }

    public int getIdade() {
        return idade;
    }
}

