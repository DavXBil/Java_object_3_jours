package TP2.heritage.ex03;

public class Stagiaire extends Personne{

     private String dateNaissance;
    private String adresse;
    private double codePostal;
    private String ville;

    public Stagiaire(String nom, String prenom, String telephone, String dateNaissance, String adresse, double codePostal, String ville) {
        super(nom, prenom, telephone);
        setDateNaissance(dateNaissance);
        setAdresse(adresse);
        setCodePostal(codePostal);
        setVille(ville);
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(double codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
