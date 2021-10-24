package Personnages;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Monstre extends Combattant {

    public Monstre() {
        super();
    }

    public Monstre(int pointDeVie, int degats, String nom) {
        super();
    }


    /**
     * Création d'une méthode qui permet de générer un nom aléatoire à partir de deux tableaux
     *
     *
     * @return listFinaleRandom
     */


    public static String genererNom() {
        Monstre monstre = new Monstre();
        Random random = new Random();
        ArrayList<String> debutNom = new ArrayList(List.of("crodis","elgo","aruine","arakine","gaia"));
        ArrayList<String> finNom = new ArrayList(List.of(" de feu"," de glace"," de foude"," de mort"," le gris"));
        int randomDebutNom = random.nextInt(debutNom.size());
        String randListe = debutNom.get(randomDebutNom);
        int liste2 = random.nextInt(finNom.size());
        String randomFinNom = finNom.get(liste2);
        String genereNomAleatoire = randListe + randomFinNom;
        System.out.println(genereNomAleatoire);
        monstre.setNom(genereNomAleatoire);
        System.out.println(monstre.getNom());


        return genereNomAleatoire;
    }
}
