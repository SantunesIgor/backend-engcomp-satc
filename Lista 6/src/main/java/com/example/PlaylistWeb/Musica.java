package com.example.PlaylistWeb;

public class Musica {
    protected int id;
    protected String nome;
    protected String artist;
    protected String album;
    protected int duracao;
    protected String genero;

    public Musica(int id, String nome, String artist, String album, int duracao, String genero) {
        this.id = id;
        this.nome = nome;
        this.artist = artist;
        this.album = album;
        this.duracao = duracao;
        this.genero = genero;
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

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
