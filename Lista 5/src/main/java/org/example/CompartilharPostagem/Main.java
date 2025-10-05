package org.example.CompartilharPostagem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Postagem p = new Postagem();

        System.out.println("Título: ");
        p.setTitulo(sc.nextLine());

        System.out.println("Descrição: ");
        p.setDescricao(sc.nextLine());

        System.out.println("Tipo (texto, imagem, video): ");
        p.setTipo(sc.nextLine());

        PlataformaSocial mybook = new MyBook();
        PlataformaSocial anytube = new AnyTube();
        PlataformaSocial fotogram = new Fotogram();

        switch (p.getTipo()){
            case "imagem":
                mybook.compartilharImagem(p);
                anytube.compartilharImagem(p);
                fotogram.compartilharImagem(p);
                break;
            case "texto":
                mybook.compartilharPostagem(p);
                anytube.compartilharPostagem(p);
                fotogram.compartilharPostagem(p);
                break;
            case "video":
                mybook.compartilharVideo(p);
                anytube.compartilharVideo(p);
                fotogram.compartilharVideo(p);
                break;
            default:
                System.out.println("Tipo não encontrado");
        }
    }
}
