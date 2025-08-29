package exercicio1;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Random random = new Random();

        personagem orc = new personagem("Orc", 100, 10);
        personagem goblin = new personagem("Goblin", 50, 5);
        personagem lobo = new personagem("Lobo", 75, 15);

        List<personagem> inimigos = new ArrayList<>();
        inimigos.add(orc);
        inimigos.add(goblin);
        inimigos.add(lobo);

        personagem jogador = new personagem("Steve", 100, 20);

        while (jogador.getVida() > 0 && inimigos.stream().anyMatch(i -> i.getVida() > 0)) {
            personagem alvo;
            do {
                alvo = inimigos.get(random.nextInt(inimigos.size()));
            } while (alvo.getVida() == 0);

            jogador.atacar(alvo);

            for (personagem inimigo : inimigos) {
                if (inimigo.getVida() > 0 && jogador.getVida() > 0) {
                    inimigo.atacar(jogador);
                }
            }
        }

        System.out.println("\n--- Resultado Final ---");
        if (jogador.getVida() <= 0) {
            System.out.println(jogador.getNome() + " foi derrotado!");
        } else {
            System.out.println("Todos os inimigos foram derrotados!");
        }
    }
}

