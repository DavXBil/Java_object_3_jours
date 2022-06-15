package TP3.ex1;

import java.awt.*;

public class Voiture {

    double num_serie;
    String immatriculation;
    String marque;
    Color couleur;
    int annee;

    Individu proprietaire;


    public Voiture(double num_serie, String immatriculation, String marque, Color couleur, int annee) {
        this.num_serie = num_serie;
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.couleur = couleur;
        this.annee = annee;

    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Voiture{");
        sb.append("num_serie=").append(num_serie);
        sb.append(", immatriculation='").append(immatriculation).append('\'');
        sb.append(", marque='").append(marque).append('\'');
        sb.append(", couleur=").append(couleur);
        sb.append(", annee=").append(annee);
        sb.append(", proprietaire=").append(proprietaire);
        sb.append('}');
        return sb.toString();
    }

    public void demarrer() {
        System.out.println("Démarré!");
    }

    public void klaxonner() {
        System.out.println("tut tut");
    }

    public void conduire() {
        System.out.println("vroom vroom");
    }

    public void arrêter() {
        System.out.println("stop!");
    }

    public double getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(double num_serie) {
        this.num_serie = num_serie;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }


    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public Individu getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Individu proprietaire) {
        this.proprietaire = proprietaire;
    }
}
