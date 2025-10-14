package com.example.Fipe.controller;

import com.example.Fipe.FipeApplication;
import com.example.Fipe.dto.CarRequest;
import com.example.Fipe.dto.FipeResponse;
import com.example.Fipe.service.FipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FipeController {
    @Autowired
    private FipeService service;

    @PostMapping("fipe/valor")
    public FipeResponse buscarCarro(@RequestBody CarRequest carro){
        return service.buscarCarro(carro);
    }
}
