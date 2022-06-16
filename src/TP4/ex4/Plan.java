package TP4.ex4;

import java.util.ArrayList;
import java.util.List;

public class Plan {

    int echelle;
    String nomFichier;

    List<Emplacement> emplacements = new ArrayList<Emplacement>();

    public Plan(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    public void ajouteEmplacement(Emplacement newEmplacement) {

        emplacements.add(newEmplacement);

    }

    public void supprimeEmplacement(Emplacement newEmplacement) {

        emplacements.remove(newEmplacement);

    }

    public String affiche() {
        String str = "Nom:\n\r " + this.nomFichier;

        for (Emplacement emplacement: this.emplacements ) {
            str+= emplacement.affiche() + ";\n\r";
        }
        
        return str;
    }


}
