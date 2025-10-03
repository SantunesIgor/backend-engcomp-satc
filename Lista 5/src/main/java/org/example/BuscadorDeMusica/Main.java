package org.example.BuscadorDeMusica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MusicCloud musicCloud = new MusicCloud();
        musicCloud.addMusica(new Musica("Bitch, Don't Kill My Vibe", "Kendrick Lamar"));
        musicCloud.addMusica(new Musica("Clube Dos Canalhas", "Matanza"));
        musicCloud.addMusica(new Musica("XXX. FEAT. U2.", "Kendrick Lamar"));
        musicCloud.addMusica(new Musica("Agora Só Falta Você", "Rita Lee"));
        musicCloud.addMusica(new Musica("The Garden", "Guns N' Roses"));
        musicCloud.addMusica(new Musica("Road Trippin'", "Red Hot Chili Peppers"));

        System.out.println("Insira o nome da playlist: ");
        String nomePlaylist = sc.nextLine();

        Playlist playlist = new Playlist(nomePlaylist);

        while(true) {
            System.out.println("Insira o nome da música a ser adicionada (Digite Parar para sair): ");
            String tituloMusica = sc.nextLine();

            Musica musica = musicCloud.pesquisar(tituloMusica);

            if (musica != null) {
                playlist.addMusica(musica);
                System.out.println("Você adicionou a música " + musica.getTitulo() + " na playlist " + playlist.getNome());
            } else if (tituloMusica.equalsIgnoreCase("Parar")){
                break;
            } else {
                System.out.println("Música " + tituloMusica + " não encontrada");
            }
        }
        System.out.println("Playlist " + playlist.getNome() + ":");
        for(Musica m: playlist.getMusicas()){
            System.out.println("- " + m.getTitulo());
        }
    }
}
