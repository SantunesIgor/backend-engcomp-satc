package org.example.BarcosePortos;

public class PortoGrande extends BasePorto{
    public PortoGrande(String nome){
        super(nome);
    }

    @Override
    public boolean atracarBarco(Barco b){
        if(b.getTamanho() >= 10){
            barcosAtracados.add(b);
            return true;
        } else {
            System.out.println("Barcos com tamanho menor que 10 são muito pequenos para o Porto Grande");
            return false;
        }
    }
}
