package com.example.service;


import com.example.model.Playlist;
import com.example.model.Usuario;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class UsuarioService {
    private List<Usuario> usuarios = new ArrayList<>();

    public List<Usuario> listarTodos() { return usuarios; }

    public Usuario criarUsuario(String nome, String email) {
        Usuario u = new Usuario(nome, email);
        usuarios.add(u);
        return u;
    }

    public Usuario buscarPorId(UUID id) {
        return usuarios.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    public List<Playlist> listarPlaylists(UUID usuarioId) {
        return buscarPorId(usuarioId).getPlaylists();
    }

    public Playlist criarPlaylist(UUID usuarioId, String nomePlaylist) {
        Usuario u = buscarPorId(usuarioId);
        Playlist p = new Playlist(nomePlaylist);
        u.getPlaylists().add(p);
        return p;
    }
}
