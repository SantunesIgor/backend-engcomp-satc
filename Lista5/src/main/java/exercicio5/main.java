package exercicio5;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        cinema cine = new cinema();
        cine.adicionarFilme(new filme("Homem Aranha", 20.0, 12));
        cine.adicionarFilme(new filme("Batman", 22.0, 14));
        cine.adicionarFilme(new filme("Deadpool", 25.0, 18));
        cine.adicionarFilme(new filme("Frozen", 18.0, 0));
        cine.adicionarFilme(new filme("Matrix", 30.0, 16));

        while (true) {
            System.out.println("Que filme você deseja assistir?");
            String nomeFilme = sc.nextLine();
            filme f = cine.buscarFilme(nomeFilme);

            if (f == null) {
                System.out.println("Filme não encontrado!");
                continue;
            }

            System.out.println("Qual assento você deseja? (A1 até F5)");
            String assento = sc.nextLine();

            System.out.println("Qual o seu nome?");
            String nome = sc.nextLine();

            System.out.println("Qual a sua idade?");
            int idade = sc.nextInt();
            sc.nextLine();

            cliente c = new cliente(nome, idade);

            try {
                cine.venderIngresso(c, f, assento);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Deseja comprar outro ingresso? (s/n)");
            String op = sc.nextLine();
            if (op.equalsIgnoreCase("n")) break;
        }

        sc.close();
    }
}

