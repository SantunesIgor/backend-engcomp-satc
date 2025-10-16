package com.example.PlaylistWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PlaylistController {
    @Autowired
    private PlaylistService playlistService;

    @PostMapping("/criarplaylist")
    public int criarPlaylist(@RequestBody Playlist playlist){
        return playlistService.criarPlaylist(playlist).getId();
    }

    @PostMapping("/addmusica")
    public Musica adicionarMusica(@RequestBody Musica musica){
        Playlist p = playlistService.adicionarMusica(musica);
        if(p == null){
            throw new RuntimeException("Playlist não encontrada.");
        }
        p.adicionarMusica(musica);
        return musica;
    }

    @GetMapping("/playlists")
    public ArrayList<Playlist> listarPlaylists(){
        return playlistService.listarPlaylists();
    }

    @GetMapping("/musicas/{id}")
    public ArrayList<Musica> listarMusicas(@PathVariable int id){
        Playlist p = playlistService.listarMusicas(id);
        if(p == null){
            throw new RuntimeException("Playlist não encontrada.");
        }
        return p.getMusicas();
    }
}
