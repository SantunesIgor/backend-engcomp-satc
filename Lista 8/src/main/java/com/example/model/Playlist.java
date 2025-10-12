package com.example.model;

import java.util.*;

public class Playlist {
    private UUID id;
    private String nome;
    private List<String> musicas = new ArrayList<>();

    public Playlist(String nome) {
        this.id = UUID.randomUUID();
        this.nome = nome;
    }

    public UUID getId() { return id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public List<String> getMusicas() { return musicas; }

    public void adicionarMusica(String musica) { musicas.add(musica); }
    public void removerMusica(String musica) { musicas.remove(musica); }
}
