package com.example.demoboot.web;

import com.example.demoboot.repository.FilmRepository;
import com.example.demoboot.domain.FilmEntity;
import com.example.demoboot.service.FilmService;
import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final FilmService service;

    @GetMapping(value = "/home", produces = MediaType.TEXT_HTML_VALUE)
    public String homePage() {
        return "home";
    }


    @PostMapping("/save")
    public String save(FilmEntity film) {
        service.save(film);

        return "home";
    }
    @GetMapping("/get")
    public ModelAndView getById (@RequestParam(name = "id", required = false) Integer id) {
        ModelAndView view = new ModelAndView("home");


        if(id == null) {
            view.addObject("films", service.findAll());
        } else {
            service.findById(id)
                    .ifPresent(film -> view.addObject("film", film));
        }

        return view;
    }

}
