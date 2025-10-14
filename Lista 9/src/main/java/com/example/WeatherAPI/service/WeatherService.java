package com.example.WeatherAPI.service;

import com.example.WeatherAPI.dto.WeatherResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Service
public class WeatherService {
    private final String API_URL = "http://api.weatherapi.com/v1/current.json?key=";
    private final String API_KEY = "d32fbac353b14837bdd15258251410";

    private final RestTemplate restTemplate = new RestTemplate();

    public WeatherResponse buscarCidade(String cidade){
        String URL = API_URL + API_KEY + "&q=" + cidade + "&aqi=no";

        Map<String, Object> dados = restTemplate.getForObject(
                URL,
                Map.class
        );

        Map<String, Object> location = (Map<String, Object>) dados.get("location");
        Map<String, Object> current = (Map<String, Object>) dados.get("current");

        String nome = (String) location.get("name");
        float temperatura = ((Number) current.get("heatindex_c")).floatValue();
        float umidade = ((Number) current.get("humidity")).floatValue();

        return new WeatherResponse(nome, temperatura, umidade);
    }
}
