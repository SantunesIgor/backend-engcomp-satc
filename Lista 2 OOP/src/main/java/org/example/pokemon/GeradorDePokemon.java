package org.example.pokemon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GeradorDePokemon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de pokemons que serão criados: ");
        int quantCriados = sc.nextInt();

        ArrayList<Pokemon> pokemons = new ArrayList<>();

        for(int i = 0; i < quantCriados; i++) {
            pokemons.add(new Pokemon());
        }

        System.out.println("\nPokemons criados: ");
        for(Pokemon p : pokemons) {
            System.out.println(
                    p.getNome() +
                    " é um Pokémon do tipo " +
                    p.getTipo() +
                    " de nível " +
                    p.getNivel() + "."
            );
        }

        sc.close();
    }
}
