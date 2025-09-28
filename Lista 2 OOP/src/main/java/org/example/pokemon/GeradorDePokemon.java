package org.example.pokemon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GeradorDePokemon {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>(Arrays.asList(
                "Pikachu",
                "Charmander",
                "Bulbasaur",
                "Squirtle",
                "Jigglypuff",
                "Meowth",
                "Psyduck",
                "Eevee",
                "Snorlax",
                "Gengar"
        ));

        ArrayList<String> tipos = new ArrayList<>(Arrays.asList(
                "Normal",
                "Fogo",
                "Água",
                "Elétrico",
                "Grama",
                "Gelo",
                "Lutador",
                "Venenoso",
                "Terrestre",
                "Voador",
                "Psíquico",
                "Inseto",
                "Pedra",
                "Fantasma",
                "Dragão",
                "Sombrio",
                "Aço",
                "Fada"
        ));

        int nivel = rand.nextInt(99) + 1;

        System.out.print("Digite a quantidade de pokémons que serão gerados: ");
        int quant = scan.nextInt();

        for(int i = 0; i < quant; i++) {
            System.out.println(
                    nomes.get(rand.nextInt(nomes.size())) +
                            " é um Pokémon do tipo " +
                            tipos.get(rand.nextInt(tipos.size())) +
                            " de nível " +
                            nivel + "."
            );
        }
    }
}
