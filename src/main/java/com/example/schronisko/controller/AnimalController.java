package com.example.schronisko.controller;

import com.example.schronisko.model.Animal;
import com.example.schronisko.repozytorium.AnimalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AnimalController {

    private AnimalRepo repo ;

    @Autowired
    public AnimalController(AnimalRepo repo) {
        this.repo = repo;
    }


    @GetMapping("/")
    public String animalList(Model model){
        model.addAttribute("animalList", repo.getAnimals());
        return "index";
    }


    @GetMapping("/add")
    public String addAnimal(Model model){
        model.addAttribute("animal", new Animal());
        return "addAnimal";
    }


    @PostMapping("/save")
    public String saveAnimal (Animal animal){
        repo.addAnimal(animal);
        return "redirect:/";
    }

    @GetMapping("/show")
    public String showAnimal(Model model, String imie){
        model.addAttribute("animal", repo.showAnimal("Felek"));
        return "animal";
    }



}
