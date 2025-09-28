package org.example;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do cliente: ");
        String nome = sc.nextLine();

        System.out.println("Número de caracteres: " + nome.length());
        System.out.println("Em maiúsculas: " + nome.toUpperCase());

        boolean temSilva = false;
        String[] nomes = nome.toLowerCase().split(" ");

        for(String n: nomes){
            if(n.equals("silva")){
                temSilva = true;
            }
        }

        System.out.println("Contém 'Silva': " + temSilva);
    }
}
