package com.example.Cinema.service;

import com.example.Cinema.dto.FilmeUpdateDTO;
import com.example.Cinema.model.Filme;
import com.example.Cinema.model.Ingresso;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class CinemaService {
    private ArrayList<Filme> filmes = new ArrayList<>();
    private ArrayList<Ingresso> ingressos = new ArrayList<>();

    public CinemaService(){
        filmes.addAll(List.of(
                new Filme("O Poderoso Chefão", "Crime", 100),
                new Filme("Interestelar", "Ficção Científica", 120),
                new Filme("Gladiador", "Ação", 80),
                new Filme("A Origem", "Ficção Científica", 110),
                new Filme("Forrest Gump", "Drama", 90),
                new Filme("Clube da Luta", "Drama", 95),
                new Filme("O Cavaleiro das Trevas", "Ação", 130),
                new Filme("Pulp Fiction", "Crime", 85),
                new Filme("O Senhor dos Anéis: A Sociedade do Anel", "Fantasia", 150),
                new Filme("Vingadores: Ultimato", "Aventura", 140)
        ));
    }

    public Filme buscarFilme(UUID id){
        Filme filme = filmes.stream()
                .filter(f -> f.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Filme não encontrado."));

        return filme;
    }

    public List<Filme> listarFilmes(){
        return filmes;
    }

    public List<Ingresso> listarIngressos(){
        return ingressos;
    }

    public Filme criarFilme(String titulo, String genero, int capacidade){
        Filme f = new Filme(titulo, genero, capacidade);

        filmes.add(f);

        return f;
    }

    public Ingresso comprarIngresso(UUID id, int assento){
        Filme filme = buscarFilme(id);

        if(filme.getAssentosOcupados().contains(assento) || assento < 0 || assento > filme.getCapacidade()){
            throw new RuntimeException("Assento solicitado não esta disponível ou não é válido");
        }

        filme.reservarAssento(assento);
        Ingresso ingresso = new Ingresso(id, assento);
        ingressos.add(ingresso);

        return ingresso;
    }

    public Filme editarFilme(UUID id, FilmeUpdateDTO dto){
        Filme filme = buscarFilme(id);

        if(dto.getCapacidade() != null){filme.setCapacidade(dto.getCapacidade());}
        if(dto.getTitulo() != null){filme.setTitulo(dto.getTitulo());}
        if(dto.getGenero() != null){filme.setGenero(dto.getGenero());}

        return filme;
    }

    public Filme deletarFilme(UUID id){
        Filme filme = buscarFilme(id);

        filmes.remove(filme);

        return filme;
    }

    public Ingresso deletarIngresso(UUID id, UUID ingressoId){
        Filme filme = buscarFilme(id);

        Ingresso ingresso = ingressos.stream()
                .filter(i -> i.getIngressoId().equals(ingressoId))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Ingresso não econtrado"));

        filme.liberarAssento(ingresso.getAssentoNumero());

        ingressos.remove(ingresso);

        return ingresso;
    }
}
