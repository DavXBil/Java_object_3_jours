package TP4.ex5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class MiniExcursionPlanifiee {

    private LocalDateTime heureDepart;
    private int nbreInscrits;
    private MiniExcursion laMiniExcursion;

    public MiniExcursionPlanifiee(String heureDepart, int nbreInscrits, MiniExcursion laMiniExcursion) {
        setHeureDepart(heureDepart);
        setNbreInscrits(nbreInscrits);
        setLaMiniExcursion(laMiniExcursion);
    }

    public MiniExcursionPlanifiee(LocalDate heureDepart, int nbreInscrits, MiniExcursion laMiniExcursion) {
        setHeureDepartLocalDateFormat(heureDepart);
        setNbreInscrits(nbreInscrits);
        setLaMiniExcursion(laMiniExcursion);
    }

    public boolean estComplete() {
        return nbreInscrits == this.laMiniExcursion.getNbrePlace();
    }

    public LocalDateTime getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(String heureDepart) {
        this.heureDepart = LocalDateTime.of(LocalDate.now(),LocalTime.parse(heureDepart));
    }

    public void setHeureDepartLocalDateFormat(LocalDate heureDepart) {
        this.heureDepart = heureDepart.atTime(23,0,0);
    }

    public int getNbreInscrits() {
        return nbreInscrits;
    }

    public void setNbreInscrits(int nbreInscrits) {
        this.nbreInscrits = nbreInscrits;
    }

    public MiniExcursion getLaminiExcursion() {
        return laMiniExcursion;
    }

    public void setLaMiniExcursion(MiniExcursion laMiniExcursion) {
        this.laMiniExcursion = laMiniExcursion;
    }
}
