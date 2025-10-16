package com.example.controller;

import com.example.service.MusicStreamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MusicStreamController {
    @Autowired
    private MusicStreamService service;
}
