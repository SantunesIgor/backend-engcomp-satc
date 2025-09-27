package exercicio3;

import java.util.*;

public class playlist {
    private String nome;
    private List<musica> musicas = new ArrayList<>();

    public playlist(String nome) {
        this.nome = nome;
    }

    public void adicionarMusica(musica m) {
        musicas.add(m);
    }

    public void mostrarPlaylist() {
        System.out.println("\nPlaylist: " + nome);
        for (musica m : musicas) {
            System.out.println("- " + m);
        }
    }
}

