package org.example;

public class Funcionario {
    // Declaração dos atributos
    String nome;
    String cargo;
    double salario;

    // Builder
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Método da classe, para exibir os dados
    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: R$ " + salario);
    }
}
