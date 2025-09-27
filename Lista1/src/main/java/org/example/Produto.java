package org.example;

public class Produto {
    // Declaração dos atributos
    String nome;
    int codigo;
    double preco;
    boolean promocao;

    public Produto(String nome, int codigo, double preco, boolean promocao) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.promocao = promocao;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Codigo: " + codigo);
        System.out.println("Preco: R$ " + preco);
        System.out.println("Promocao: " + promocao);
    }


}
