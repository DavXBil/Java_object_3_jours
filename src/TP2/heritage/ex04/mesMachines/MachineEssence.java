package TP2.heritage.ex04.mesMachines;

import java.time.LocalDate;

public class MachineEssence extends Machine{

    int puissanceCv;

    public MachineEssence(LocalDate dateAchat, String marque, String modele, int puissanceCv) {
        super(dateAchat, marque, modele);
        this.puissanceCv = puissanceCv;
    }

    public int getPuissanceCv() {
        return puissanceCv;
    }

    public void setPuissanceCv(int puissanceCv) {
        this.puissanceCv = puissanceCv;
    }


}
