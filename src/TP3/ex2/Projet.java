package TP3.ex2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Projet {

    private String nom;
    private LocalDate debut;
    private LocalDate fin;
    private float prixFactureMO;
    private ArrayList<Mission> missions = new ArrayList<>();



    public Projet(String nom, LocalDate debut, LocalDate fin, float prixFactureMO, ArrayList<Mission> missions) {
        this.nom = nom;
        this.debut = debut;
        this.fin = fin;
        this.prixFactureMO = prixFactureMO;
        this.missions = missions;
    }

    public double cumulCoutMO() {
        double cout = 0;
        for (Mission mission : missions) {
            cout += mission.getExecutant().getTauxHoraire() * mission.getNbrHeureEffectues();
        }
        return cout;
    }

    public double margeBruteCourante() {
        return  prixFactureMO - this.cumulCoutMO();
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDebut() {
        return debut;
    }

    public void setDebut(LocalDate debut) {
        this.debut = debut;
    }

    public LocalDate getFin() {
        return fin;
    }

    public void setFin(LocalDate fin) {
        this.fin = fin;
    }

    public float getPrixFactureMO() {
        return prixFactureMO;
    }

    public void setPrixFactureMO(float prixFactureMO) {
        this.prixFactureMO = prixFactureMO;
    }
}
