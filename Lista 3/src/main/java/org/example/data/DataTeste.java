package org.example.data;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data(12, 25, 314);
        Data d2 = new Data(8, 6, 2006);
        Data d3 = new Data(5, 19, 2001);

        d1.displayData();
        d2.displayData();
        d3.displayData();

        // Data dErroBissexto = new Data(29, 1, 1111);
        // Data dErroDiaMaior = new Data(1, 32, 1111);
        // Data dErroDiaMenor = new Data(1, 0, 1111);
        // Data dErroMesMaior = new Data(13, 1, 1111);
        // Data dErroMesMenos = new Data(0, 1, 1111);
    }
}
