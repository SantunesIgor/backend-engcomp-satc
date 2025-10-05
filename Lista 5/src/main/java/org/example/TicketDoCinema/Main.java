package org.example.TicketDoCinema;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Filme> filmesDisponiveis = new ArrayList<>();
        filmesDisponiveis.add(new Filme("Mortal Kombat", 34.0f, 12));
        filmesDisponiveis.add(new Filme("Pânico", 34.0f, 14));
        filmesDisponiveis.add(new Filme("F1", 34.0f, 12));
        filmesDisponiveis.add(new Filme("Internet - O Filme", 34.0f, 12));
        filmesDisponiveis.add(new Filme("Oppenheimer", 34.0f, 16));
        filmesDisponiveis.add(new Filme("Cinegibi", 34.0f, 0));

        ArrayList<Ingresso> ingressosVendidos = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        Cinema cinema = new Cinema(filmesDisponiveis);

        Filme filmeEscolhido;

        while(true) {
            System.out.println(
                    "Bem vindo ao sistema de autoatendimento!" +
                            "\nVamos fazer seu perfil: " +
                            "\nNome: "
            );
            String nomeCliente = sc.next();

            System.out.println("Idade: ");
            int idadeCliente = sc.nextInt();

            Cliente cliente = new Cliente(nomeCliente, idadeCliente);

            System.out.println("Selecione o filme que deseja assistir (insira o número correspondente):");
            while (true) {
                for (Filme f : cinema.getFilmesDisponiveis()) {
                    System.out.println(
                            filmesDisponiveis.indexOf(f) + 1 +
                                    " - " +
                                    f.getNome()
                    );
                }
                int numeroFilmeEscolhido = sc.nextInt();

                if (numeroFilmeEscolhido > filmesDisponiveis.size() || numeroFilmeEscolhido < 1) {
                    System.out.println("Número inválido, selecione novamente.");
                } else if (filmesDisponiveis.get(numeroFilmeEscolhido - 1).getIdadeMinima() > cliente.getIdade()) {
                    System.out.println("Você não tem idade para ver esse filme, selecione novamente.");
                } else {
                    filmeEscolhido = filmesDisponiveis.get(numeroFilmeEscolhido - 1);
                    break;
                }
            }

            while (true) {
                System.out.println("Digite o assento desejado (A1 a F5): ");
                String assentoEscolhido = sc.next().toUpperCase();

                char letra = assentoEscolhido.charAt(0);
                int numero = assentoEscolhido.charAt(1);
                boolean assentoVendido = false;

                if (letra < 'A' || letra > 'F' || numero < '1' || numero > '5') {
                    System.out.println("Assento inválido, selecione outro.");
                    continue;
                }

                for(Ingresso i: ingressosVendidos){
                    if(assentoEscolhido.equals(i.getAssento())){
                        System.out.println("Assento já vendido, selecione outro.");
                        assentoVendido = true;
                    }
                }

                if(!assentoVendido){
                    ingressosVendidos.add(new Ingresso(cliente, filmeEscolhido, assentoEscolhido));
                    System.out.println(
                            "Ingresso vendido: " +
                            filmeEscolhido.getNome() + " - " +
                            assentoEscolhido + " - " +
                            cliente.getNome());
                    break;
                }
            }


        }
    }
}
