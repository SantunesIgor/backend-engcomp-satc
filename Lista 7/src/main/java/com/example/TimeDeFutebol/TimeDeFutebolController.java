package com.example.TimeDeFutebol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TimeDeFutebolController {
    @Autowired
    private TimeDeFutebolService timeDeFutebolService;

    @GetMapping("/principal")
    public List<Jogador> listarPrincipais(){
        return timeDeFutebolService.listarPrincipais();
    }

    @GetMapping("/reservas")
    public List<Jogador> listarReservas(){
        return timeDeFutebolService.listarReservas();
    }

    @PutMapping("/jogador/{posicao}")
    public String substituicao(Jogador r, @PathVariable int posicao){
        return timeDeFutebolService.substituicao(r, posicao);
    }

}
