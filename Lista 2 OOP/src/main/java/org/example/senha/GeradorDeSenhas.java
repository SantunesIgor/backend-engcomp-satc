package org.example.senha;

import java.util.ArrayList;
import java.util.Random;

public class GeradorDeSenhas {
    public static void main(String[] args) {
        // Também seria possível obter os chars usando o método .charAt(index)
        Random rand = new Random();

        String charString = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        ArrayList<Character> charList = new ArrayList<>();
        StringBuilder senha = new StringBuilder();

        for (char c : charString.toCharArray()) {
            charList.add(c);
        }

        while (senha.length() < 8) {
            senha.append(charList.get(rand.nextInt(charList.size())));
        }

        System.out.println(senha);
    }
}

