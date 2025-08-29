package exercicio3;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        musicCloud cloud = new musicCloud();

        System.out.println("Digite o nome da playlist:");
        String nomePlaylist = sc.nextLine();
        playlist pl = new playlist(nomePlaylist);

        while (true) {
            System.out.println("Digite o nome da música:");
            String titulo = sc.nextLine();

            musica m = cloud.buscarMusica(titulo);

            if (m != null) {
                pl.adicionarMusica(m);
                System.out.println("Você adicionou a música " + m.getTitulo() + " na playlist.");
            } else {
                System.out.println("A música " + titulo + " não foi encontrada no sistema.");
            }

            System.out.println("Deseja adicionar outra música? (s/n)");
            String op = sc.nextLine();
            if (op.equalsIgnoreCase("n")) break;
        }

        pl.mostrarPlaylist();
        sc.close();
    }
}

