package TP4.ex5;

import java.time.LocalDate;
import java.util.List;

public class PlanningJournee {

    private LocalDate date;
    List<MiniExcursionPlanifiee> lesMiniExcursionsPlanifiee;

    public PlanningJournee(LocalDate date, List<MiniExcursionPlanifiee> lesMiniExcursionsPlanifiee) {
        this.date = date;
        this.lesMiniExcursionsPlanifiee = lesMiniExcursionsPlanifiee;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<MiniExcursionPlanifiee> getLesMiniExcursionsPlanifiees() {
        return lesMiniExcursionsPlanifiee;
    }

    public void setLesMiniExcursionsPlanifiee(List<MiniExcursionPlanifiee> lesMiniExcursionsPlanifiee) {
        this.lesMiniExcursionsPlanifiee = lesMiniExcursionsPlanifiee;
    }
}
