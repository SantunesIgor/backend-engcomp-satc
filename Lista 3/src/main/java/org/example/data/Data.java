package org.example.data;

public class Data {
    private int mes;
    private int dia;
    private int ano;

    public Data(int mes, int dia, int ano) {
        if(mes < 0 || mes > 12){
            throw new IllegalArgumentException("mes invalido");
        } else {
            this.mes = mes;

    }

}
