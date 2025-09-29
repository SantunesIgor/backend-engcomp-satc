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

        StringBuilder stringSenha = new StringBuilder();

        while (stringSenha.length() < this.tamanho) {
            stringSenha.append(charString.charAt(rand.nextInt(charString.length())));
        }

        return stringSenha.toString();
    }

    public String getSenha() {
        return valor;
    }
}
