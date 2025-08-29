package exercicio4;

public class myBook implements plataformaSocial {
    @Override
    public void compartilharPostagem(postagem p) {
        if (p.getTipo().equals("texto")) {
            System.out.println("Você compartilhou essa postagem no MyBook.");
        }
    }

    @Override
    public void compartilharImagem(postagem p) {
        if (p.getTipo().equals("imagem")) {
            System.out.println("Você compartilhou essa postagem no MyBook.");
        }
    }

    @Override
    public void compartilharVideo(postagem p) {
        if (p.getTipo().equals("video")) {
            System.out.println("Você compartilhou essa postagem no MyBook.");
        }
    }
}

