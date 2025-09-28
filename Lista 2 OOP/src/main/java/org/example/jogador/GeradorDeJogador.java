package org.example.jogador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class GeradorDeJogador {
    public static void main(String[] args) {
        Random rand = new Random();

        ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Léo", "Pualo", "Carlos", "Robert", "Puma", "Cauan", "Hugo", "Rayan", "Philippe", "Nuno", "Pablo"));
        ArrayList<String> sobrenomes = new ArrayList<>(Arrays.asList("Jardim", "Oliveira", "Cuesta", "Alves", "Rodriguez", "Barros", "Moura", "Simplicio", "Coutinho", "Moreira", "Vegetti"));
        ArrayList<String> posicoes = new ArrayList<>(Arrays.asList("Goleiro", "Lateral", "Zagueiro", "Volante", "Meia", "Ponta", "Atacante", "Centroavante"));
        ArrayList<String> times = new ArrayList<>(Arrays.asList("Caxias", "Ponte Preta", "Nautico", "Londrina", "São Bernardo", "Brusque", "Guarani", "Floresta", "Confiança", "Ypiranga", "Maringá", "Ituano", "Botafogo-PB", "Figueirense","Anápolis", "Itabaiana", "CSA", "ABC", "Retrô", "Tombense"));

        System.out.println(
                nomes.get(rand.nextInt(nomes.size())) +
                " " +
                sobrenomes.get(rand.nextInt(sobrenomes.size())) +
                " é um futebolista brasileiro de " +
                (rand.nextInt(22) + 18) +
                " anos que atua como " +
                posicoes.get(rand.nextInt(posicoes.size())) +
                ". Atualmente defende o " +
                times.get(rand.nextInt(times.size())) +
                "."
        );
    }
}
