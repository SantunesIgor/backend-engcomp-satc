package org.example;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso em quilogramas: ");
        float peso = sc.nextFloat();

        System.out.print("Digite sua altura em metros: ");
        float altura = sc.nextFloat();

        Pessoa p1 = new Pessoa(peso, altura);
        System.out.println("Seu IMC é: " + p1.calcularIMC());
    }
}
