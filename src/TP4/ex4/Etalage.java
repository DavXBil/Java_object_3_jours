package TP4.ex4;


public class Etalage extends Emplacement {

    public Etalage(int couleur, int xCentre, int yCentre) {
        super(couleur, xCentre, yCentre);
    }

    @Override
    String affiche() {
        return "Etalage: " + getCouleur() + ", " + getxCentre() + ", " + getyCentre();
    }
}
