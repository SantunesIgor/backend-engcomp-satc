package org.example.BarcosePortos;

public class PortoPequeno extends BasePorto{
    public PortoPequeno(String nome) {
        super(nome);
    }

    @Override
    public boolean atracarBarco(Barco b){
        if(b.getTamanho() <= 10) {
            barcosAtracados.add(b);
            return true;
        } else {
            System.out.println("Barcos com tamanho acima de 10 não cabem no Porto Pequeno");
            return false;
        }
    }
}
