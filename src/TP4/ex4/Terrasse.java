package TP4.ex4;

public class Terrasse extends Emplacement{

    public Terrasse(int couleur, int xCentre, int yCentre) {
        super(couleur, xCentre, yCentre);
    }

    @Override
    public String affiche() {

        return "Terrasse: " + getCouleur() + ", " + getxCentre() + ", " + getyCentre();
    }
}
