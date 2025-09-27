package exercicio3;

import java.util.*;

public class musicCloud {
    private List<musica> musicasDisponiveis = new ArrayList<>();

    public musicCloud() {
        musicasDisponiveis.add(new musica("Evidências", "Chitãozinho & Xororó"));
        musicasDisponiveis.add(new musica("Macarena", "Los del Río"));
        musicasDisponiveis.add(new musica("Hino do Real Paulista", "Desconhecido"));
    }

    public musica buscarMusica(String titulo) {
        for (musica m : musicasDisponiveis) {
            if (m.getTitulo().equalsIgnoreCase(titulo)) return m;
        }
        return null;
    }
}

