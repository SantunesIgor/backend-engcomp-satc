package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        metodo1();

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Exercício 1 ===");
        exercicio01();

        System.out.println("\n=== Exercício 2 ===");
        exercicio02();

        System.out.println("\n=== Exercício 3 ===");
        exercicio03();

        System.out.println("\n=== Exercício 4 ===");
        System.out.print("Informe o valor total da compra: ");
        double valorCompra = sc.nextDouble();
        exercicio04(valorCompra);

        System.out.println("\n=== Exercício 5 ===");
        System.out.print("Informe a idade: ");
        int idade = sc.nextInt();
        exercicio05(idade);

        System.out.println("\n=== Exercício 6 ===");
        exercicio06();

        System.out.println("\n=== Exercício 7 ===");
        System.out.print("Peso (kg): ");
        double peso = sc.nextDouble();
        System.out.print("Altura (m): ");
        double altura = sc.nextDouble();
        exercicio07(peso, altura);

        sc.nextLine(); // Consumir quebra de linha pendente

        System.out.println("\n=== Exercício 8 ===");
        System.out.print("Nome completo: ");
        String nomeCompleto = sc.nextLine();
        exercicio08(nomeCompleto);

        sc.close();
    }

    static void metodo1() {
        System.out.println("---------- MDT1 ----------");
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        String mensagem = "Olá " + nome + "!";
        System.out.println(mensagem);
    }

    public static void exercicio01() {
        // Exercício 1
        System.out.println("Bem-vindo ao Sistema de Geração de Jogadores!");
    }

    public static void exercicio02() {
        // Exercício 2
        String nome = "Mariana Silva";
        String cargo = "Analista de Sistemas";
        double salario = 4500.00;

        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Salário: R$ %.2f\n", salario);
    }

    public static void exercicio03() {
        // Exercício 3
        String nome = "Teclado";
        int codigo = 12345;
        double preco = 99.90;
        boolean promocao = true;

        System.out.println("Produto: " + nome);
        System.out.println("Código: " + codigo);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.println("Promoção: " + promocao);
    }

    public static void exercicio04(double valorTotal) {
        // Exercício 4
        if (valorTotal > 100) {
            double valorFinal = valorTotal * 0.9;
            System.out.printf("Valor final com desconto: R$ %.2f\n", valorFinal);
        } else {
            System.out.printf("Valor final sem desconto: R$ %.2f\n", valorTotal);
        }
    }

    public static void exercicio05(int idade) {
        // Exercício 5
        if (idade < 12) {
            System.out.println("Categoria: Infantil");
        } else if (idade <= 17) {
            System.out.println("Categoria: Adolescente");
        } else {
            System.out.println("Categoria: Adulto");
        }
    }

    public static void exercicio06() {
        // Exercício 6
        int[] notas = {7, 8, 6, 9, 10};
        int soma = 0;
        System.out.print("Notas: ");
        for (int nota : notas) {
            System.out.print(nota + " ");
            soma += nota;
        }
        System.out.println();
        double media = (double) soma / notas.length;
        System.out.printf("Média: %.1f\n", media);
    }

    public static double calcularIMC(double peso, double altura) {
        // Método auxiliar para Exercício 7
        return peso / (altura * altura);
    }

    public static void exercicio07(double peso, double altura) {
        // Exercício 7
        double imc = calcularIMC(peso, altura);
        System.out.printf("IMC calculado: %.2f\n", imc);
    }

    public static void exercicio08(String nome) {
        // Exercício 8
        int numCaracteres = nome.replace(" ", "").length();
        System.out.println("Número de caracteres: " + numCaracteres);
        System.out.println("Maiúsculas: " + nome.toUpperCase());
        System.out.println("Contém \"Silva\": " + nome.contains("Silva"));
    }
}