package org.example;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        // Cria o Scanner para ler do teclado - System.in
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: ");
        double valor = scanner.nextDouble();

        if (valor > 100) {
            System.out.println("O valor total da compra, com 10% de desconto, fica: R$ " + valor * 0.9);
        } else {
            System.out.println("O valor total da compra, sem descontos, fica: R$ " + valor);
        }
    }
}
