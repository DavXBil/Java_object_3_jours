package TP2.heritage.ex04.mesMachines;

import java.time.LocalDate;

public class PompeAGravitation extends Machine {

    int debit;
    boolean eauOperationelle;

    public PompeAGravitation(LocalDate dateAchat, String marque, String modele, int debit, boolean eauOperationelle) {
        super(dateAchat, marque, modele);
        this.debit = debit;
        this.eauOperationelle = eauOperationelle;
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public boolean isEauOperationelle() {
        return eauOperationelle;
    }

    public void setEauOperationelle(boolean eauOperationelle) {
        this.eauOperationelle = eauOperationelle;
    }
}
