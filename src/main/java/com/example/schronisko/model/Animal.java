package com.example.schronisko.model;

public class Animal {
    private String typ;
    private String plec;
    private String imie;
    private int wiek;
    private int masa;
    private boolean czySzczepiony;
    private String foto;

//KONSTRUKTORY
    public Animal(String typ, String plec, String imie, int wiek, int masa, boolean czySzczepiony) {
        this.typ = typ;
        this.plec = plec;
        this.imie = imie;
        this.wiek = wiek;
        this.masa = masa;
        this.czySzczepiony = czySzczepiony;
    }

    public Animal() {
    }


//METODY
    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public boolean isCzySzczepiony() {
        return czySzczepiony;
    }

    public void setCzySzczepiony(boolean czySzczepiony) {
        this.czySzczepiony = czySzczepiony;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "typ='" + typ + '\'' +
                ", imie='" + imie + '\'' +
                '}';
    }
}
