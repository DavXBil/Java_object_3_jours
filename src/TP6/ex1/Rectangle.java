package TP6.ex1;

public class Rectangle implements Forme {

    private double longueur;
    private double largeur;


    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double calculAire() {
        return longueur * largeur;
    }

    @Override
    public double calculPerimetre() {
        return 2 * (largeur + longueur);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rectangle{");
        sb.append("longueur=").append(longueur);
        sb.append(", largeur=").append(largeur);
        sb.append('}');
        return sb.toString();
    }
}
