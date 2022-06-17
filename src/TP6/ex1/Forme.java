package TP6.ex1;

import java.util.ArrayList;
import java.util.List;

public interface Forme {

    static List<Forme> formes = new ArrayList<Forme>();

    public static  void ajoutForme(Forme forme) {
        formes.add(forme);
    }

    abstract double calculAire();
    abstract double calculPerimetre();




}
