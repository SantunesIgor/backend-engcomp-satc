package org.example.BarcosePortos;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
        StringBuilder sb = new StringBuilder();

        ArrayList<Barco> barcos = new ArrayList<>();
        barcos.add(new Barco("Barco 1", 3));
        barcos.add(new Barco("Barco 2", 6));
        barcos.add(new Barco("Barco 3", 9));
        barcos.add(new Barco("Barco 4", 12));
        barcos.add(new Barco("Barco 5", 15));

        PortoPequeno portopequeno = new PortoPequeno("Porto Pequeno");
        PortoGrande portogrande = new PortoGrande("Porto Grande");

        for(Barco b: barcos) {
            if (portopequeno.atracarBarco(b) == false) {
                portogrande.atracarBarco(b);
            }
        }

        for(Barco b: portogrande.getBarcosAtracados()){
            sb.append("\n" + b.getNome());
        }

        String barcosPortoGrande = sb.toString();
        sb.setLength(0);

        for(Barco b: portopequeno.getBarcosAtracados()){
            sb.append("\n" + b.getNome());
        }

        String barcosPortoPequeno = sb.toString();


        System.out.println(
                "\nBarcos atracados no porto grande: " +  barcosPortoGrande +
                "\nBarcos atracados no porto pequeno: " + barcosPortoPequeno
        );
    }
}
