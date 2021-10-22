package com.Rpg;

import java.util.Scanner;

// creation class personnage humain pour le jeux rpg
public class Personnage {
    private int poinDeVie;
    private int degats;
    private String nom;

    // constructeur vide
    public Personnage() {
        super();
    }

    // constructeur plein
    public Personnage(int poinDeVie, int degats, String nom) {
        super();
        this.poinDeVie = poinDeVie;
        this.degats = degats;
        this.nom = nom;
    }






// getter et setter to string de point de vie,degats et nom
    public int getPoinDeVie() {
        return poinDeVie;
    }

    public void setPoinDeVie(int poinDeVie) {
        this.poinDeVie = poinDeVie;
    }

    public int getDegats() {
        return degats;
    }

    public void setDegats(int degats) {
        this.degats = degats;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "poinDeVie=" + poinDeVie +
                ", degats=" + degats +
                ", nom=" + nom +
                '}';
    }
}