package com.example.Biblioteca.controller;

import com.example.Biblioteca.model.Emprestimo;
import com.example.Biblioteca.model.Livro;
import com.example.Biblioteca.service.BibliotecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/")
public class BibliotecaController {
    @Autowired
    private BibliotecaService service;

    @GetMapping("livros")
    public List<Livro> listarLivros(){
        return service.listarLivros();
    }

    @GetMapping("emprestados")
    public List<Emprestimo> listarEmprestimos(){
        return service.listarEmprestimos();
    }

    @PostMapping("emprestados")
    public List<Emprestimo> novoEmprestimo(@RequestParam UUID livroId, @RequestParam String userId){
        return service.novoEmprestimo(livroId, userId);
    }

    @DeleteMapping("emprestados/{emprestimoId}")
    public List<Livro> devolverLivro(@PathVariable UUID emprestimoId){
        return service.devolverLivro(emprestimoId);
    }
}
