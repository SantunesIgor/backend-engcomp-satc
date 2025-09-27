package exercicio5;

import java.util.*;

public class cinema {
    private List<filme> filmesDisponiveis = new ArrayList<>();
    private List<ingresso> ingressosVendidos = new ArrayList<>();

    public void adicionarFilme(filme f) {
        filmesDisponiveis.add(f);
    }

    public filme buscarFilme(String nome) {
        for (filme f : filmesDisponiveis) {
            if (f.getNome().equalsIgnoreCase(nome)) return f;
        }
        return null;
    }

    private boolean validarAssento(String assento) {
        // Assentos válidos: A1 até F5
        if (assento.length() != 2) return false;
        char fila = Character.toUpperCase(assento.charAt(0));
        char numero = assento.charAt(1);

        if (fila < 'A' || fila > 'F') return false;
        if (numero < '1' || numero > '5') return false;

        return true;
    }

    public boolean assentoDisponivel(String assento) {
        for (ingresso i : ingressosVendidos) {
            if (i.getAssento().equalsIgnoreCase(assento)) return false;
        }
        return true;
    }

    public void venderIngresso(cliente c, filme f, String assento) throws Exception {
        if (c.getIdade() < f.getIdadeMinima()) {
            throw new Exception("O ingresso não pode ser vendido pois sua idade não permite!");
        }
        if (!validarAssento(assento)) {
            throw new Exception("Assento inválido! Use de A1 até F5.");
        }
        if (!assentoDisponivel(assento)) {
            throw new Exception("O ingresso não pode ser vendido pois seu assento não está mais disponível!");
        }
        ingresso ing = new ingresso(c, f, assento);
        ingressosVendidos.add(ing);
        System.out.println("Ingresso vendido com sucesso! " + f.getNome() + " - " + assento + " - " + c.getNome());
    }
}
