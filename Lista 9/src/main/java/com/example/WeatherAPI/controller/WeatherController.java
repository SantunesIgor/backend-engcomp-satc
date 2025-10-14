package com.example.WeatherAPI.controller;

import com.example.WeatherAPI.dto.WeatherResponse;
import com.example.WeatherAPI.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class WeatherController {
    @Autowired
    private WeatherService service;

    @PostMapping("/{cidade}")
    public WeatherResponse buscarCidade(@PathVariable String cidade){
        return service.buscarCidade(cidade);
    }
}
