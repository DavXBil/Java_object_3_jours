package TP4.ex5;

import java.util.List;

public class MiniExcursionPayante extends MiniExcursion {

    float tarif;

    public MiniExcursionPayante(String libelleMiniExcursion, int nbrePlace, List<Etape> lesEtapes, float tarif) {
        super(libelleMiniExcursion, nbrePlace, lesEtapes);
        this.tarif = tarif;
    }

    public float getTarif() {
        return tarif;
    }

    public void setTarif(float tarif) {
        this.tarif = tarif;
    }
}
