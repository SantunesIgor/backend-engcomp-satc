package org.example.CompartilharPostagem;

public class Fotogram implements PlataformaSocial {
    @Override
    public void compartilharPostagem (Postagem postagem){
        System.out.println("Ocorreu um erro ao compartilhar essa postagem no Fotogram.");
    }

    @Override
    public void compartilharImagem(Postagem postagem) {
        System.out.println("Você compartilhou essa postagem no Fotogram");
    }

    @Override
    public void compartilharVideo(Postagem postagem) {
        System.out.println("Você compartilhou essa postagem no Fotogram");
    }
}
