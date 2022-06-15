package TP3.ex2;

public class Intervenant {

    private String nom;
    private float tauxHoraire;

    public Intervenant(String nom, float tauxHoraire) {
        this.nom = nom;
        this.tauxHoraire = tauxHoraire;
    }

    public float getTauxHoraire() {
        return tauxHoraire;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Intervenant{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", tauxHoraire=").append(tauxHoraire);
        sb.append('}');
        return sb.toString();
    }
}
