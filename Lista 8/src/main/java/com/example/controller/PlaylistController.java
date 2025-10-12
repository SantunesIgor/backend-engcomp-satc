package com.example.controller;

import com.example.model.Playlist;
import com.example.service.PlaylistService;;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/playlists")
public class PlaylistController {

    private final PlaylistService playlistService;

    public PlaylistController(PlaylistService playlistService) {
        this.playlistService = playlistService;
    }

    @PostMapping("/{playlistId}/musicas")
    public void adicionarMusica(@PathVariable Playlist playlist, @RequestParam String nomeMusica) {
        playlistService.adicionarMusica(playlist, nomeMusica);
    }

    @DeleteMapping("/{playlistId}/musicas")
    public void removerMusica(@PathVariable Playlist playlist, @RequestParam String nomeMusica) {
        playlistService.removerMusica(playlist, nomeMusica);
    }

    @GetMapping("/{playlistId}/musicas")
    public List<String> listarMusicas(@PathVariable Playlist playlist) {
        return playlistService.listarMusicas(playlist);
    }
}
