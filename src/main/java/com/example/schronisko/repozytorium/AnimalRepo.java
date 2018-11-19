package com.example.schronisko.repozytorium;

import com.example.schronisko.model.Animal;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AnimalRepo {

    private List<Animal> lista = new ArrayList<>();


    public AnimalRepo() {
        lista.add(new Animal("Pies", "M", "Felek", 2, 20, true));
        lista.add(new Animal("Kot", "F", "Balbinka", 1, 5, true));
        lista.add(new Animal("Kot", "M", "Bolek", 2, 7, true));
    }


    public List<Animal> getAnimals() {
        return lista;
    }


    public void addAnimal(Animal zwierz) {
        lista.add(zwierz);
    }


    public Animal showAnimal(String imie) {
        for (Animal zwierz : lista) {
            if (zwierz.getImie().equals(imie)) {
                return zwierz;
            }
        }
        return null;
    }

}

