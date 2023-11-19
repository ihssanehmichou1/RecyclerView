package com.example.recyclerviewapp;

public class PaysS {
    private String nom;
    private String capital;
     public PaysS(String nom,String capital){
         this.nom = nom;
         this.capital = capital;
     }

    public String getNom() {
        return nom;
    }

    public String getCapital() {
        return capital;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }


}
