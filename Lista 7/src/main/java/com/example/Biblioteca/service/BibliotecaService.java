package com.example.Biblioteca.service;

import com.example.Biblioteca.model.Emprestimo;
import com.example.Biblioteca.model.Livro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class BibliotecaService {
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Livro> livrosDisponiveis = new ArrayList<>();
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public BibliotecaService(){
        livros.addAll(List.of(
                new Livro("A Revolução dos Bichos", "George Orwell"),
                new Livro("1984", "George Orwell"),
                new Livro("O Hobbit", "J.R.R. Tolkien"),
                new Livro("O Senhor dos Anéis: A Sociedade do Anel", "J.R.R. Tolkien"),
                new Livro("Dom Casmurro", "Machado de Assis"),
                new Livro("O Cortiço", "Aluísio Azevedo"),
                new Livro("Capitães da Areia", "Jorge Amado"),
                new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling"),
                new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry"),
                new Livro("A Metamorfose", "Franz Kafka")
        ));

        livrosDisponiveis.addAll(List.of(
                livros.get(0),
                livros.get(1),
                livros.get(2),
                livros.get(3),
                livros.get(4),
                livros.get(5),
                livros.get(6)
        ));

        emprestimos.addAll(List.of(
                new Emprestimo(livros.get(7).getId(), "user1"),
                new Emprestimo(livros.get(8).getId(), "user2"),
                new Emprestimo(livros.get(9).getId(), "user3")
        ));
    }

    public List<Livro> listarLivros(){
        return livrosDisponiveis;
    }

    public List<Emprestimo> listarEmprestimos(){
        return emprestimos;
    }

    public List<Emprestimo> novoEmprestimo(UUID livroId, String usuarioId){
        for(Livro l: livrosDisponiveis){
            if(l.getId().equals(livroId)){
                livrosDisponiveis.remove(l);
                emprestimos.add(new Emprestimo(livroId, usuarioId));
                return emprestimos;
            }
        }
        throw new RuntimeException("Livro não encontrado ou já emprestado");
    }

    public List<Livro> devolverLivro(UUID emprestimoId){
        for(Emprestimo e: emprestimos){
            if(e.getEmprestimoId().equals(emprestimoId)){
                emprestimos.remove(e);
                for(Livro l: livros){
                    if(l.getId().equals(e.getLivroId())){
                        livrosDisponiveis.add(l);
                        return livrosDisponiveis;
                    }
                }
            }
        }
        throw new RuntimeException("Empréstimo não encontrado");
    }
}
