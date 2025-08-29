package exercicio4;

public class fotogram implements plataformaSocial {
    @Override
    public void compartilharPostagem(postagem p) throws Exception {
        if (p.getTipo().equals("texto")) {
            throw new Exception("O Fotogram não suporta compartilhar postagens de texto.");
        }
    }

    @Override
    public void compartilharImagem(postagem p) {
        if (p.getTipo().equals("imagem")) {
            System.out.println("Você compartilhou essa postagem no Fotogram.");
        }
    }

    @Override
    public void compartilharVideo(postagem p) {
        if (p.getTipo().equals("video")) {
            System.out.println("Você compartilhou essa postagem no Fotogram.");
        }
    }
}

