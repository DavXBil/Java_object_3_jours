package TP3.ex2;

import java.util.ArrayList;
import java.util.Date;

public class Projet {

    private String nom;
    private Date debut;
    private Date fin;
    private float prixFactureMO;
    private ArrayList<Mission> missions = new ArrayList<>();



    public Projet(String nom, Date debut, Date fin, float prixFactureMO, ArrayList<Mission> missions) {
        this.nom = nom;
        this.debut = debut;
        this.fin = fin;
        this.prixFactureMO = prixFactureMO;
        this.missions = missions;
    }

    public double cumulCoutMO() {
        Intervenant intervenant = new Intervenant("test", 11);
        double cout = 0;
        for (Mission mission : missions) {
            cout += intervenant.getTauxHoraire() * mission.getNbrHeureEffectues();
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

    public Date getDebut() {
        return debut;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public float getPrixFactureMO() {
        return prixFactureMO;
    }

    public void setPrixFactureMO(float prixFactureMO) {
        this.prixFactureMO = prixFactureMO;
    }
}
