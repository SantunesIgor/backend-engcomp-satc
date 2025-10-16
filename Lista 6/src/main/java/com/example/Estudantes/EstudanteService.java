package com.example.Estudantes;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EstudanteService {
    private final ArrayList<Estudante> estudantes = new ArrayList<>();

    public Estudante adicionarEstudante(Estudante estudante){
        estudantes.add(estudante);
        return estudante;
    }

    public ArrayList<Estudante> listarEstudantes(){
        return estudantes;
    }

    public Estudante buscarPorCodigo(int codigo){
        for(Estudante e: estudantes){
            if(e.getCodigo() == codigo){
                return e;
            }
        }
        return null;
    }
}
