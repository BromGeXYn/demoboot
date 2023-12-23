package com.example.demoboot.service;

import com.example.demoboot.domain.FilmEntity;

import java.util.List;
import java.util.Optional;

public interface FilmService {
    List<FilmEntity> findAll();
    Optional<FilmEntity> findById(Integer id);
    void save (FilmEntity film);

}
