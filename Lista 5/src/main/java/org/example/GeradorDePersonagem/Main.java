package org.example.GeradorDePersonagem;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random rand = new Random();

        ArrayList<Personagem> inimigos = new ArrayList<>();
        inimigos.add(new Personagem("Orc", 100, 10));
        inimigos.add(new Personagem("Goblin", 50, 5));
        inimigos.add(new Personagem("Lobo", 75, 15));

        Personagem jogador = new Personagem("Steve Vai", 100, 20);

        while(jogador.getVida() > 0 && inimigos.stream().anyMatch(i -> i.getVida() > 0)) {

            jogador.atacar(inimigos.get(rand.nextInt(3)));

            for (Personagem inimigo : inimigos) {
                inimigo.atacar(jogador);
            }
        }
    }
}
