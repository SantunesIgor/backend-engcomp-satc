package exercicio4;

public class anyTube implements plataformaSocial {
    @Override
    public void compartilharPostagem(postagem p) {
        if (p.getTipo().equals("texto")) {
            System.out.println("Você compartilhou essa postagem no AnyTube.");
        }
    }

    @Override
    public void compartilharImagem(postagem p) throws Exception {
        if (p.getTipo().equals("imagem")) {
            throw new Exception("O AnyTube não suporta compartilhar imagens.");
        }
    }

    @Override
    public void compartilharVideo(postagem p) {
        if (p.getTipo().equals("video")) {
            System.out.println("Você compartilhou essa postagem no AnyTube.");
        }
    }
}

