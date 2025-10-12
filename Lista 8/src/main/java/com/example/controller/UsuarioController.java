package com.example.controller;

import com.example.model.Playlist;
import com.example.model.Usuario;
import com.example.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarioService.listarTodos();
    }

    @PostMapping
    public Usuario criarUsuario(@RequestParam String nome, @RequestParam String email) {
        return usuarioService.criarUsuario(nome, email);
    }

    @GetMapping("/{id}/playlists")
    public List<Playlist> listarPlaylists(@PathVariable UUID id) {
        return usuarioService.listarPlaylists(id);
    }

    @PostMapping("/{id}/playlists")
    public Playlist criarPlaylist(@PathVariable UUID id, @RequestParam String nome) {
        return usuarioService.criarPlaylist(id, nome);
    }
}
