package com.example.PlaylistWeb;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PlaylistService {
    protected ArrayList<Playlist> playlists = new ArrayList<>();

    public Playlist criarPlaylist(Playlist playlist){
        playlists.add(playlist);
        return playlist;
    }

    public Playlist adicionarMusica(Musica musica){
        for(Playlist p: playlists){
            if(p.getId() == musica.getId()){
                return p;
            }
        }
        return null;
    }

    public ArrayList<Playlist> listarPlaylists(){
        return playlists;
    }

    public Playlist listarMusicas(int id){
        for(Playlist p: playlists){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }
}
