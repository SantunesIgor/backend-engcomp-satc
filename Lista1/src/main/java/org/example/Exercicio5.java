package org.example;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if(idade < 12){
            System.out.println("Categoria: Infantil");
        } else if(idade >= 12 && idade < 18){
            System.out.println("Categoria: Adolescente");
        } else {
            System.out.println("Categoria: Adulto");
        }
    }
}
