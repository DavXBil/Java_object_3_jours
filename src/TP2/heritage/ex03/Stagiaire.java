package TP2.heritage.ex03;

public class Stagiaire extends Personne{

     protected String dateNaissance;
     protected String adresse;
     protected double codePostal;
     protected String ville;

    public Stagiaire(String nom, String prenom, String telephone, String dateNaissance, String adresse, double codePostal, String ville) {
        super(nom, prenom, telephone);
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
    }
}
