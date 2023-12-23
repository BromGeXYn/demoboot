package com.example.demoboot.service.impl;

import com.example.demoboot.domain.FilmEntity;
import com.example.demoboot.repository.FilmRepository;
import com.example.demoboot.service.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class FilmServiceImpl implements FilmService {
    private final FilmRepository repository;
    @Override
    public List<FilmEntity> findAll() {
        return repository.findAll();
    }
    @Override
    public Optional<FilmEntity> findById(Integer id) {

        return repository.findById(id);
    }
    @Override
    public void save(FilmEntity film) {
        repository.save(film);
    }
}
