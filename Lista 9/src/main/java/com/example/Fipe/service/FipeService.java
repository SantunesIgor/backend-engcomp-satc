package com.example.Fipe.service;

import com.example.Fipe.dto.CarRequest;
import com.example.Fipe.dto.FipeResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Service
public class FipeService {
    private final String BASE_URL = "https://parallelum.com.br/fipe/api/v1/carros";
    private final RestTemplate restTemplate = new RestTemplate();

    public FipeResponse buscarCarro(CarRequest carro){
        List<Map<String, Object>> marcas = restTemplate.getForObject(
                BASE_URL + "/marcas",
                List.class);

        String codigoMarca = marcas.stream()
                .filter(m -> m.get("nome").equals(carro.getMarca()))
                .map(m -> String.valueOf(m.get("codigo")))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Marca não encontrado."));

        Map<String, Object> modelosLista = restTemplate.getForObject(
                BASE_URL + "/marcas/" + codigoMarca + "/modelos",
                Map.class
        );

        List<Map<String, Object>> modelos = (List<Map<String, Object>>) modelosLista.get("modelos");

        String codigoModelo = modelos.stream()
                .filter(m -> m.get("nome").equals(carro.getModelo()))
                .map(m -> String.valueOf(m.get("codigo")))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Modelo não encontrado."));

        List<Map<String, Object>> anos = restTemplate.getForObject(
                BASE_URL + "/marcas/" + codigoMarca + "/modelos/" + codigoModelo + "/anos",
                List.class);

        String codigoAno = anos.stream()
                .filter(a -> a.get("nome").equals(carro.getAno()))
                .map(a -> String.valueOf(a.get("codigo")))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Ano não encontrado."));

        Map<String, Object> response = restTemplate.getForObject(
                BASE_URL + "/marcas/" + codigoMarca + "/modelos/" + codigoModelo + "/anos/" + codigoAno,
                Map.class);

        String valor = (String) response.get("Valor");
        String mesReferencia = (String) response.get("MesReferencia");

        return new FipeResponse(valor, mesReferencia);
    }
}
