package org.example.senha;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GeradorDeSenhas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de caracteres: ");
        int quant = sc.nextInt();

        Senha senha = new Senha(quant);

        System.out.println("Senha gerada: " + senha.getSenha());

        sc.close();
    }
}

