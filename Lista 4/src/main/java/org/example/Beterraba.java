package org.example;

public class Beterraba extends Biocombustivel{
    public Beterraba(float quilogramas){
        super(quilogramas);
    }

    @Override
    public float Processar(){
        return (quilogramas * 1.2f) + 1000;
    }
}
