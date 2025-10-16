package com.example.RecomendadorDeViagem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controller {
    String[] cidade = {
            "Cairns, Austrália",
            "Vancouver, Canadá",
            "Reykjavik, Islândia",
            "Sevilha, Espanha",
            "Florença, Itália",
            "São Petersburgo, Rússia",
            "Rishikesh, Índia",
            "Kyoto, Japão",
            "Lhasa, Tibete"
    };

    @GetMapping("/")
    public String pricipal(){
        return "Estilos disponíveis:<br>- Natureza<br>- Cultura<br>- Espiritual<br>Climas Disponíveis:<br>- Calor<br>- Ameno<br>- Frio";
    }

    @GetMapping("/consultar")
    public String consultor(@RequestParam String clima, @RequestParam String estilo){
        int c = 0;
        int e = 0;

        switch (clima.toLowerCase()){
            case "calor": c = 0; break;
            case "ameno": c = 1; break;
            case "frio": c = 2; break;
        }

        switch (estilo.toLowerCase()){
            case "natureza": e = 0; break;
            case "cultura": e = 3; break;
            case "espiritual": e = 6; break;
        }

        return cidade[c+e];
    }
}
