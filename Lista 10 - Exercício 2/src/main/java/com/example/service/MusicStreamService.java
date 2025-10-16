package com.example.service;

import com.example.repository.MusicStreamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicStreamService {
    @Autowired
    private MusicStreamRepository repository;
}
