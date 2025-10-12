package com.example.service;

import com.example.model.Playlist;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistService {
    public void adicionarMusica(Playlist playlist, String musica) {
        playlist.adicionarMusica(musica);
    }

    public void removerMusica(Playlist playlist, String musica) {
        playlist.removerMusica(musica);
    }

    public List<String> listarMusicas(Playlist playlist) {
        return playlist.getMusicas();
    }
}
