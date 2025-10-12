package com.example.TimeDeFutebol;

import org.apache.tomcat.Jar;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TimeDeFutebolService {
    protected ArrayList<Jogador> principais = new ArrayList<>();
    protected ArrayList<Jogador> reservas = new ArrayList<>();

    public TimeDeFutebolService() {
        principais.add(new Jogador("Rayan", 11, 33));
        principais.add(new Jogador("Nuno Moreira", 10, 25));
        principais.add(new Jogador("Vegetti", 9, 27));
        principais.add(new Jogador("Hugo Moura", 8, 23));
        principais.add(new Jogador("Tchê Tchê", 7, 32));
        principais.add(new Jogador("Coutinho", 6, 22));
        principais.add(new Jogador("Paulo Henrique", 5, 31));
        principais.add(new Jogador("Lucas Oliveira", 4, 19));
        principais.add(new Jogador("Robert Renan", 3, 26));
        principais.add(new Jogador("Puma Rodréguez", 2, 27));
        principais.add(new Jogador("Léo Jardim", 1, 24));

        reservas.add(new Jogador("Neymar Jr.", 0, 33));
        reservas.add(new Jogador("Lamine Yamal", 0, 19));
        reservas.add(new Jogador("Cássio", 0, 68));
        reservas.add(new Jogador("Rafael Bidu", 0, 24));
        reservas.add(new Jogador("Roger Guedes", 0, 27));

    }

    public List<Jogador> listarPrincipais() {
        return principais;
    }

    public List<Jogador> listarReservas() {
        return reservas;
    }

    public Jogador substituicao(int posicao) {
        for (Jogador j : principais) {
            if (j.getPosicao() == posicao) {
                Jogador novoPrincipal = reservas.get(0);
                reservas.remove(reservas.get(0));

                novoPrincipal.setPosicao(posicao);
                j.setPosicao(0);

                principais.remove(j);
                principais.add(novoPrincipal);
                reservas.add(j);

                return novoPrincipal;
            }
        }
        return null;
    }
}
