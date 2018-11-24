package com.example.schronisko.controller;

import com.example.schronisko.model.Animal;
import com.example.schronisko.repozytorium.AnimalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AnimalController {

    private AnimalRepo repo ;

    @Autowired
    public AnimalController(AnimalRepo repo) {
        this.repo = repo;
    }


    @GetMapping("/")
    public String animalList(Model model ){
        model.addAttribute("animalList", repo.getAnimals("All", "All"));
        model.addAttribute("animalNameList", repo.zbiorImie());
        model.addAttribute("animalTypList", repo.zbiorTyp());
        return "index";
    }

    @GetMapping("/filtr")
    public String animalListfiltr(Model model, @RequestParam String typ, @RequestParam String imie ){
        model.addAttribute("animalList", repo.getAnimals(typ, imie));
        model.addAttribute("animalNameList", repo.zbiorImie());
        model.addAttribute("animalTypList", repo.zbiorTyp());
        return "index";
    }



    @GetMapping("/add")
    public String addAnimal(Model model){
        model.addAttribute("animal", new Animal());
        return "addAnimal";
    }

    @GetMapping("/help")
    public String helpAnimal(Model model){
        return "help";
    }

    @PostMapping("/save")
    public String saveAnimal (Animal animal){
        repo.addAnimal(animal);
        return "redirect:/";
    }

    @GetMapping("/show")
    public String showAnimal(Model model, @RequestParam String imie){
        model.addAttribute("animal", repo.showAnimal(imie));
        return "animal";
    }



}
