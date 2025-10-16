package org.example.pokemon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Pokemon {
    private String nome;
    private String tipo;
    private int nivel;

    public Pokemon() {
        Random rand = new Random();

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

        this.nome = nomes.get(rand.nextInt(nomes.size()));
        this.tipo = tipos.get(rand.nextInt(tipos.size()));
        this.nivel = nivel;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTipo() {
        return this.tipo;
    }

    public int getNivel() {
        return this.nivel;
    }
}
