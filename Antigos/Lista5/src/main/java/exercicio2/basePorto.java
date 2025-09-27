package exercicio2;

import java.util.*;

public class basePorto {
    protected String nome;
    protected List<barco> barcosAtracados = new ArrayList<>();

    public basePorto(String nome) {
        this.nome = nome;
    }

    public boolean atracarBarco(barco barco) {
        barcosAtracados.add(barco);
        System.out.println(barco.getNome() + " atracado no " + nome);
        return true;
    }

    public void desatracarBarco(barco barco) {
        barcosAtracados.remove(barco);
    }
}

