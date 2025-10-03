package org.example.BuscadorDeMusica;

import java.util.ArrayList;

public class MusicCloud {
    protected ArrayList<Musica> musicasDisponiveis = new ArrayList<>();

    public void addMusica(Musica musica){
        musicasDisponiveis.add(musica);
    }

    public Musica pesquisar(String tituloMusica){
        for(Musica m: musicasDisponiveis) {
            if (m.getTitulo().equalsIgnoreCase(tituloMusica)) {
                return m;
            }
        }
        return null;
    }
}
