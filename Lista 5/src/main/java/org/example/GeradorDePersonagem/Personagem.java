package org.example.GeradorDePersonagem;

public class Personagem {
    private String nome;
    private int vida;
    private int ataque;

    public Personagem(String nome, int vida, int ataque){
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }

    public void receberDano(int dano){
        this.vida = this.vida - dano;
        if(this.vida > 1) {
            System.out.println(this.nome + " recebeu " + dano + " de dano. Vida restante: " + this.vida);
        } else {
            System.out.println("O personagem " + this.nome + " foi derrotado!");
        }
    }

    public void atacar(Personagem alvo){
        if(alvo.vida > 1){
            alvo.receberDano(ataque);
        } else {
            System.out.println("O ataque ao personagem " + alvo.nome + " falhou!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
}
