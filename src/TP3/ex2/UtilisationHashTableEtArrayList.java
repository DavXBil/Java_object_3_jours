package TP3.ex2;

import java.time.LocalDate;
import java.util.ArrayList;


public class UtilisationHashTableEtArrayList {

    public static void main(String[] args) {
        Intervenant am= new Intervenant("Martineau",888.80f);
        Intervenant gb= new Intervenant("Block",2.18f);
        Mission mission=new Mission("Prog objet","C'est un truc de fou",35, am);
        mission.ajoutReleve(LocalDate.of(2015, 12,5),3);
        mission.ajoutReleve(LocalDate.of(2015, 12,6),20);
        mission.ajoutReleve(LocalDate.of(2015, 12,7),18);
        Mission mission2=new Mission("Javascript","C'est un truc de fou",35, gb);
        mission2.ajoutReleve(LocalDate.of(2015, 12,15),30);
        mission2.ajoutReleve(LocalDate.of(2015, 12,16),18);
        mission2.ajoutReleve(LocalDate.of(2015, 12,17),12);
        ArrayList<Mission> tabMissions = new ArrayList<Mission>();
        tabMissions.add(mission);
        tabMissions.add(mission2);
        Projet formationDl=new Projet("Formation DL",LocalDate.of(2015, 5, 12), LocalDate.of(2015, 12,17),38000,tabMissions);
        System.out.println("La marge brute courante du projet est de :"+formationDl.margeBruteCourante()+"€");
    }
}
