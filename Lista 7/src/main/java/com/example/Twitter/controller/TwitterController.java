package com.example.Twitter.controller;

import com.example.Twitter.model.Tweet;
import com.example.Twitter.model.Usuario;
import com.example.Twitter.service.TwitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/")
public class TwitterController {
    @Autowired
    private TwitterService service;

    @GetMapping("usuarios")
    public List<Usuario> listarUsuarios(){
        return service.listarUsuarios();
    }

    @GetMapping("usuarios/{id}/tweets")
    public List<Tweet> listarTweets(@PathVariable UUID id){
        return service.listarTweets(id);
    }

    @PostMapping("usuarios/{id}/tweets")
    public Tweet criarTweet(@PathVariable UUID id, @RequestParam String mensagem){
        return service.criarTweet(id, mensagem);
    }

    @PatchMapping("usuarios/{id}/tweets/{tweetId}")
    public Tweet editarTweet(@PathVariable UUID id, @PathVariable UUID tweetId, @RequestParam String novaMensagem){
        return service.editarTweet(id, tweetId, novaMensagem);
    }

    @DeleteMapping("usuarios/{id}/tweets/{tweetId}")
    public List<Tweet> deletarTweet(@PathVariable UUID id, @PathVariable UUID tweetId){
        return service.deletarTweet(id, tweetId);
    }
}
