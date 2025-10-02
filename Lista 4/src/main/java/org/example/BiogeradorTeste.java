package org.example;

import java.util.ArrayList;

public class BiogeradorTeste {
    public static void main(String[] args){
        ArrayList<Biocombustivel> combustiveis = new ArrayList<>();
        combustiveis.add(new CanaAcucar(2000));
        combustiveis.add(new Beterraba(3000));
        combustiveis.add(new Milho(1500));
        combustiveis.add(new Beterraba(3500));
        combustiveis.add(new Beterraba(2000));

        Biogerador biogerador = new Biogerador();

        for(Biocombustivel c: combustiveis){
            biogerador.carregar(c);
        }

        System.out.println(
                "Potencia gerada: "  + biogerador.getPotenciaAtual() +
                "\nCarga atual: " + biogerador.getCargaAtual()
        );
    }
}
