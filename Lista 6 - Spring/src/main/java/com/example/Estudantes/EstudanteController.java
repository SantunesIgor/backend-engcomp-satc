package com.example.Estudantes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/estudantes")
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @PostMapping
    public Estudante adicionar(@RequestBody Estudante estudante){
        return estudanteService.adicionarEstudante(estudante);
    }

    @GetMapping
    public ArrayList<Estudante> listar(){
        return estudanteService.listarEstudantes();
    }

    @GetMapping("/{codigo}")
    public Estudante buscar(@PathVariable int codigo){
        Estudante estudante = estudanteService.buscarPorCodigo(codigo);
        if (estudante == null){
            throw new RuntimeException("Estudante não encontrado!");
        }
        return estudante;
    }
}
