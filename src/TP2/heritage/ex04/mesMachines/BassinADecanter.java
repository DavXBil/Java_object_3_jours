package TP2.heritage.ex04.mesMachines;

import java.time.LocalDate;

public class BassinADecanter extends Machine {

    int capaciteHl;

    public BassinADecanter(LocalDate dateAchat, String marque, String modele, int capaciteHl) {
        super(dateAchat, marque, modele);
        this.capaciteHl = capaciteHl;
    }

    public int getCapaciteHl() {
        return capaciteHl;
    }

    public void setCapaciteHl(int capaciteHl) {
        this.capaciteHl = capaciteHl;
    }
}
