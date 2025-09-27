package exercicio1;

public class personagem {
    private String nome;
    private int vida;
    private int ataque;

    public personagem(String nome, int vida, int ataque) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }

    public String getNome() { return nome; }
    public int getVida() { return vida; }

    public void receberDano(int dano) {
        if (vida <= 0) {
            System.out.println(nome + " já está derrotado!");
            return;
        }
        vida -= dano;
        if (vida <= 0) {
            vida = 0;
            System.out.println(nome + " foi derrotado!");
        }
    }

    public void atacar(personagem alvo) {
        if (vida <= 0) {
            System.out.println(nome + " não pode atacar pois está derrotado!");
            return;
        }
        if (alvo.getVida() <= 0) {
            System.out.println("O ataque falhou, " + alvo.getNome() + " já está derrotado!");
            return;
        }
        alvo.receberDano(this.ataque);
    }
}

