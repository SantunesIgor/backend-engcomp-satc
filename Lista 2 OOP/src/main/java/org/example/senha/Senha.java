package org.example.senha;

import java.util.ArrayList;
import java.util.Random;

public class Senha {
    private int tamanho;
    private String valor;
    private String charString = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public Senha(int tamanho) {
        this.tamanho = tamanho;
        this.valor = gerarSenha();
    }

    public String gerarSenha() {
        Random rand = new Random();

        StringBuilder senha = new StringBuilder();

        while (senha.length() < 8) {
            senha.append(charList.get(rand.nextInt(charList.size())));
        }
    }
}
