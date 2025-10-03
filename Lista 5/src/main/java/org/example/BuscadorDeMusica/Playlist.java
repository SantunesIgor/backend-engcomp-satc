package org.example.BuscadorDeMusica;

import java.util.ArrayList;

public class Playlist {
    protected String nome;
    protected ArrayList<Musica> musicas = new ArrayList<>();

    public Playlist(String nome){
        this.nome = nome;
    }

    public void addMusica(Musica musica){
        musicas.add(musica);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }
}
