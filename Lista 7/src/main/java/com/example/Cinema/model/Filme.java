package com.example.Cinema.model;

import java.util.ArrayList;
import java.util.UUID;

public class Filme {
    private UUID id;
    private String titulo;
    private String genero;
    private Integer capacidade;
    private ArrayList<Integer> assentosOcupados= new ArrayList<Integer>();

    public Filme(String titulo, String genero, int capacidade){
        this.id = UUID.randomUUID();
        this.titulo = titulo;
        this.genero = genero;
        this.capacidade = capacidade;
    }

    public void reservarAssento(Integer assento){
        assentosOcupados.add(assento);
    }

    public void liberarAssento(Integer assento){
        assentosOcupados.remove(assento);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public ArrayList<Integer> getAssentosOcupados() {
        return assentosOcupados;
    }

    public void setAssentosOcupados(ArrayList<Integer> assentosOcupados) {
        this.assentosOcupados = assentosOcupados;
    }
}
