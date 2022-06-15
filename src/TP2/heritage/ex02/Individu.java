package TP2.heritage.ex02;

public class Individu {

    protected String prenom;
    protected String nom;

    public Individu(String prenom, String nom) {
        setNom(nom);
        setPrenom(prenom);
    }

    @Override public String toString() {
        return"prénom= " + getPrenom()+", nom= " + getNom();
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
