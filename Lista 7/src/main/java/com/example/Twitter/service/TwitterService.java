package com.example.Twitter.service;

import com.example.Twitter.model.Tweet;
import com.example.Twitter.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class TwitterService {
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public TwitterService(){
        usuarios.addAll(List.of(
           new Usuario("CebolinhaGames", "cebolinhagames@email.com"),
           new Usuario("DarwinFlamenguista", "darwinflamenguista@email.com"),
           new Usuario("DoraAventureira", "doraaventureira@email.com")
        ));
    }

    public List<Usuario> listarUsuarios(){
        return usuarios;
    }

    public List<Tweet> listarTweets(UUID id){
        return usuarios.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado."))
                .getTweets();
    }

    public Tweet criarTweet(UUID id, String mensagem){
        Tweet tweet = new Tweet(mensagem);

        usuarios.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado."))
                .adicionarTweet(tweet);

        return tweet;
    }

    public Tweet editarTweet(UUID id, UUID tweetId, String novaMensagem){
        Usuario usuario = usuarios.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        Tweet tweet = usuario.getTweets().stream()
                .filter(t -> t.getId().equals(tweetId))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Tweet não encontrado"));

        tweet.setMensagem(novaMensagem);
        tweet.setEditado(true);

        return tweet;
    }

    public List<Tweet> deletarTweet(UUID id, UUID tweetId){
        Usuario usuario = usuarios.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        Tweet tweet = usuario.getTweets().stream()
                .filter(t -> t.getId().equals(tweetId))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Tweet não encontrado"));

        usuario.deletarTweet(tweet);

        return usuario.getTweets();
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
}
