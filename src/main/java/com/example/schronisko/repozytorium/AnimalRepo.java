package com.example.schronisko.repozytorium;

import com.example.schronisko.model.Animal;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

@Repository
public class AnimalRepo {

    private List<Animal> lista = new ArrayList<>();


    public AnimalRepo() {
        lista.add(new Animal("Pies", "M", "Felek", 2, 20, true));
        lista.add(new Animal("Kot", "F", "Balbinka", 1, 5, true));
        lista.add(new Animal("Kot", "M", "Bolek", 2, 7, true));
    }


    public List<Animal> getAnimals(String typ, String imie) {
        List<Animal> nowaLista = new ArrayList<>();
        if(typ.equals("All") && imie.equals("All")){
            return lista;
        } else if( typ.equals("All") && !(imie.equals("All")) ){
            for(int i = 0 ; i < lista.size();i++){
                if(lista.get(i).getImie().equals(imie)){
                    nowaLista.add(lista.get(i));
                    System.out.println("przpadek 2");
                }
            }
            return nowaLista;
        } else if( !(typ.equals("All")) && imie.equals("All")){
            for(int i = 0 ; i < lista.size();i++){
                if(lista.get(i).getTyp().equals(typ)){
                    nowaLista.add(lista.get(i));
                    System.out.println("przypadek3");
                }
            }
            return nowaLista;
        } else {
            for(int i = 0 ; i < lista.size();i++){
                if(lista.get(i).getImie().equals(imie) && lista.get(i).getTyp().equals(typ) ){
                    nowaLista.add(lista.get(i));
                    System.out.println("przypadek4");
                }
            }
            return nowaLista;
        }
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


    public TreeSet<String> zbiorTyp() {
        TreeSet<String> zbior = new TreeSet<>();
        for(int i = 0;i<lista.size();i++){
            zbior.add(lista.get(i).getTyp());
        }
            zbior.add("All");
        return zbior;
    }



    public TreeSet<String> zbiorImie() {
        TreeSet<String> zbior = new TreeSet<>();
        for(int i = 0;i<lista.size();i++){
            zbior.add(lista.get(i).getImie());
        }
        zbior.add("All");
        return zbior;
    }

    public List<Animal> filtrByTyp(String typ) {
        ArrayList<Animal> listaFiltr = new ArrayList<>();
        for(int i = 0;i<lista.size();i++){
            if(lista.get(i).getTyp().equals(typ)){
            listaFiltr.add(lista.get(i));
            }
        }
        return listaFiltr;
    }



    public List<Animal> filtrByImie(String imie) {
        ArrayList<Animal> listaFiltr = new ArrayList<>();
        for(int i = 0;i<lista.size();i++){
            if(lista.get(i).getImie().equals(imie)){
                listaFiltr.add(lista.get(i));
            }
        }
        return listaFiltr;
    }



}

