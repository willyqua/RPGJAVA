package com.Rpg;

import java.util.Scanner;

public class Monde extends Personnage {

    public Monde() {
        super();
    }

    public Monde(int poinDeVie, int degats, String nom) {
        super(poinDeVie, degats, nom);
    }


    //méthode qui demande au joueur de renseigner un nom et récupère les informations
    //du constructeur afin  d'instancier son personnage.

    public static Personnage personnageFactory() {


        System.out.println("Renseigner un nom pour votre caractère: ");
        Scanner scan = new Scanner(System.in);
        Personnage hero = new Personnage(100, 50,null);
        String nomRecuper = scan.nextLine();
        hero.setNom(nomRecuper);
        System.out.print(hero);

        return hero;
    }


}
