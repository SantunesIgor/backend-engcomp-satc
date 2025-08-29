package exercicio4;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Titulo:");
        String titulo = sc.nextLine();
        System.out.println("Descrição:");
        String descricao = sc.nextLine();
        System.out.println("Tipo (texto, imagem, video):");
        String tipo = sc.nextLine();

        postagem p = new postagem(titulo, descricao, tipo);

        plataformaSocial myBook = new myBook();
        plataformaSocial fotogram = new fotogram();
        plataformaSocial anyTube = new anyTube();

        try { myBook.compartilharPostagem(p); } catch (Exception e) { System.out.println(e.getMessage()); }
        try { myBook.compartilharImagem(p); } catch (Exception e) { System.out.println(e.getMessage()); }
        try { myBook.compartilharVideo(p); } catch (Exception e) { System.out.println(e.getMessage()); }

        try { fotogram.compartilharPostagem(p); } catch (Exception e) { System.out.println(e.getMessage()); }
        try { fotogram.compartilharImagem(p); } catch (Exception e) { System.out.println(e.getMessage()); }
        try { fotogram.compartilharVideo(p); } catch (Exception e) { System.out.println(e.getMessage()); }

        try { anyTube.compartilharPostagem(p); } catch (Exception e) { System.out.println(e.getMessage()); }
        try { anyTube.compartilharImagem(p); } catch (Exception e) { System.out.println(e.getMessage()); }
        try { anyTube.compartilharVideo(p); } catch (Exception e) { System.out.println(e.getMessage()); }

        sc.close();
    }
}

