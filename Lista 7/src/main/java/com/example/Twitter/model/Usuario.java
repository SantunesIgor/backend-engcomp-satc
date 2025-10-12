package com.example.Twitter.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.UUID;

public class Usuario {
    private UUID id;
    private String nome;
    private String email;
    private ArrayList<Tweet> tweets = new ArrayList<>();

    public Usuario(String nome, String email) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.email = email;
    }

    public void adicionarTweet(Tweet tweet){
        tweets.add(tweet);
    }

    public void deletarTweet(Tweet tweet){
        tweets.remove(tweet);
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Tweet> getTweets() {
        return tweets;
    }
}
