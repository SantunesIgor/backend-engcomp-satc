package org.example;

public class Milho extends Biocombustivel{
    public Milho(float quilogramas){
        super(quilogramas);
    }

    @Override
    public float Processar(){
        return quilogramas + 1000;
    }
}
