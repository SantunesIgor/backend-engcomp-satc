package org.example;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        int i = 0;
        float soma = 0;
        float media = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as notas separadas por ',': ");
        String inputNotas = sc.nextLine();

        String[] notas = inputNotas.split(",");

        for(String nota : notas){
            i++;
            System.out.print("Nota " + i + ": " + nota + "\n");
            soma = soma + Float.parseFloat(nota);
        }

        media = soma/notas.length;
        System.out.println("Média das notas: " + media);

    }
}
