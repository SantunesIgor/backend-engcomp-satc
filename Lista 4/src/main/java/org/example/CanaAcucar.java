package org.example;

public class CanaAcucar extends Biocombustivel{
    public CanaAcucar(float quilogramas){
        super(quilogramas);
    }

    @Override
    public float Processar(){
        return quilogramas * 3.5f;
    }
}
