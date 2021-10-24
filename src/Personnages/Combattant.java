package Personnages;

/* class abtraitre qui permet de créer mon combattant*/

public abstract class Combattant {

    private int pointDeVie;
    private int degats;
    private String nom;

    public Combattant() {
    }

    public Combattant(int pointDeVie, int degats, String nom) {
        this.pointDeVie = pointDeVie;
        this.degats = degats;
        this.nom = nom;
    }

    public int getPointDeVie() {
        return pointDeVie;
    }

    public void setPointDeVie(int pointDeVie) {
        this.pointDeVie = pointDeVie;
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
                "poinDeVie=" + pointDeVie +
                ", degats=" + degats +
                ", nom=" + nom +
                '}';


    }
}