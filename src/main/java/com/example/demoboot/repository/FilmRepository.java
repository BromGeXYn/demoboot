package com.example.demoboot.repository;

import com.example.demoboot.domain.FilmEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


public interface FilmRepository extends JpaRepository <FilmEntity, Integer> {



}
