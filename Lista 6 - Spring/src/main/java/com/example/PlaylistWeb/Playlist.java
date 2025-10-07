package com.example.PlaylistWeb;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

public class Playlist {
    protected int id;
    protected String nome;
    protected ArrayList<Musica> musicas = new ArrayList<>();

    public Playlist(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public void adicionarMusica(Musica musica){
        musicas.add(musica);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
