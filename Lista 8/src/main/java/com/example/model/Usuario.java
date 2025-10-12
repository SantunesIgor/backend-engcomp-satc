package com.example.model;

import java.util.*;

public class Usuario {
    private UUID id;
    private String nome;
    private String email;
    private List<Playlist> playlists = new ArrayList<>();

    public Usuario(String nome, String email) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.email = email;
    }

    public UUID getId() { return id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public List<Playlist> getPlaylists() { return playlists; }
}
