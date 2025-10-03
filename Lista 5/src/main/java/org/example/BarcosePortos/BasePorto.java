package org.example.BarcosePortos;

import java.util.ArrayList;

public class BasePorto {
    protected String nome;
    protected ArrayList<Barco> barcosAtracados = new ArrayList<>();

    public BasePorto(String nome){
        this.nome = nome;
    }

    public boolean atracarBarco(Barco b){
        barcosAtracados.add(b);
        return true;
    }

    public void desatracarBarco(Barco b){
        barcosAtracados.remove(b);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Barco> getBarcosAtracados() {
        return barcosAtracados;
    }

    public void setBarcosAtracados(ArrayList<Barco> barcosAtracados) {
        this.barcosAtracados = barcosAtracados;
    }
}
