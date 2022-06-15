package TP2.heritage.ex03;

public class Formateur extends Personne{

    protected double numeroIntervenant;
    protected String dateDeCreation;
    protected static int nombreIntervenant = 0;

    public Formateur(String nom, String prenom, String telephone, String dateDeCreation) {
        super(nom, prenom, telephone);
        nombreIntervenant++;
        this.numeroIntervenant = nombreIntervenant;
        setDateDeCreation(dateDeCreation);
    }

    public double getNumeroIntervenant() {
        return numeroIntervenant;
    }

    public String getDateDeCreation() {
        return dateDeCreation;
    }

    public void setDateDeCreation(String dateDeCreation) {
        this.dateDeCreation = dateDeCreation;
    }

    public int getNombreIntervenant() {
        return nombreIntervenant;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Formateur{");
        sb.append("numeroIntervenant=").append(numeroIntervenant);
        sb.append(", dateDeCreation='").append(dateDeCreation).append('\'');
        sb.append(", nombreIntervenant=").append(nombreIntervenant);
        sb.append(", nom='").append(getNom()).append('\'');
        sb.append(", prenom='").append(getPrenom()).append('\'');
        sb.append(", telephone='").append(getTelephone()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
