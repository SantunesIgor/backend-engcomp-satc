package com.example.service;

import com.example.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicaService {
    @Autowired
    private MusicaRepository repository;
}
