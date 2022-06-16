package TP4.ex5;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class MiniExcursion {

    private int numExcursion;
    private static int nbreExcursion;
    private String libelleMiniExcursion;
    private int nbrePlace;
    private List<Etape> lesEtapes = new ArrayList<Etape>();

    public MiniExcursion(String libelleMiniExcursion, int nbrePlace, List<Etape> lesEtapes) {
        nbreExcursion++;
        this.numExcursion = nbreExcursion;
        this.libelleMiniExcursion = libelleMiniExcursion;
        this.nbrePlace = nbrePlace;
        this.lesEtapes = lesEtapes;
    }

    public String getLibelleMiniExcursion() {
        return libelleMiniExcursion;
    }

    public void setLibelleMiniExcursion(String libelleMiniExcursion) {
        this.libelleMiniExcursion = libelleMiniExcursion;
    }

    public int getNbrePlace() {
        return nbrePlace;
    }

    public void setNbrePlace(int nbrePlace) {
        this.nbrePlace = nbrePlace;
    }

    public int donneDureePrevue() {

        int duree = 0;

        for (Etape etape: lesEtapes) {
            duree += etape.getDureePrevue();
        }

        return duree;
    }

    public LocalTime donneDureePrevueHHMM() {

        int duree = 0;


        for (Etape etape: lesEtapes) {
            duree += etape.getDureePrevue();
        }

        int heure = duree / 60;
        int minutes = duree % 60;

        LocalTime dureeHHMM = LocalTime.of(heure, minutes);

        return dureeHHMM;
    }

}
