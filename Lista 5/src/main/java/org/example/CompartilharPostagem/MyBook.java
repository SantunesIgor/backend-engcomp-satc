package org.example.CompartilharPostagem;

public class MyBook implements PlataformaSocial{
    @Override
    public void compartilharPostagem(Postagem postagem) {
        System.out.println("Você compartilhou essa postagem no MyBook");
    }

    @Override
    public void compartilharImagem(Postagem postagem) {
        System.out.println("Você compartilhou essa postagem no MyBook");
    }

    @Override
    public void compartilharVideo(Postagem postagem) {
        System.out.println("Você compartilhou essa postagem no MyBook");
    }
}
