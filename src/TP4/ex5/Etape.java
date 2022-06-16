package TP4.ex5;

import java.time.LocalTime;

public class Etape {

    private int numEtape;
    private String description;
    private int dureePrevue;

    private static int nbrEtape;

    public Etape(String description, int dureePrevue) {
        nbrEtape++;
        this.numEtape = nbrEtape;
        this.description = description;
        this.dureePrevue = dureePrevue;
    }

    public int getNumEtape() {
        return numEtape;
    }

    public String getDescriptionPrevue() {
        return description;
    }

    public void setDureePrevue(int dureePrevue) {
        this.dureePrevue = dureePrevue;
    }

    public int getDureePrevue() {
        return dureePrevue;
    }

    public LocalTime donneDureePrevueHHMM() {


        int heure = dureePrevue / 60;
        int minutes = dureePrevue % 60;

        LocalTime duree = LocalTime.of(heure, minutes);

        return duree;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
