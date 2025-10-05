package org.example.TicketDoCinema;

import java.util.ArrayList;

public class Cinema {
    ArrayList<Filme> filmesDisponiveis = new ArrayList<>();
    ArrayList<Ingresso> ingressosVendidos = new ArrayList<>();

    public Cinema(ArrayList<Filme> filmesDisponiveis) {
        this.filmesDisponiveis = filmesDisponiveis;
    }

    public ArrayList<Filme> getFilmesDisponiveis() {
        return filmesDisponiveis;
    }

    public void setFilmesDisponiveis(ArrayList<Filme> filmesDisponiveis) {
        this.filmesDisponiveis = filmesDisponiveis;
    }

    public ArrayList<Ingresso> getIngressosVendidos() {
        return ingressosVendidos;
    }

    public void setIngressosVendidos(ArrayList<Ingresso> ingressosVendidos) {
        this.ingressosVendidos = ingressosVendidos;
    }
}
