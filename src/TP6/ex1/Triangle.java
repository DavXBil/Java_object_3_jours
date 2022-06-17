package TP6.ex1;

public class Triangle implements  Forme{

    private double base;
    private double hauteur;

    public Triangle(double base, double hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }

    @Override
    public double calculAire() {
        return (base * hauteur) / 2;
    }

    @Override
    public double calculPerimetre() {
        return base + hauteur + Math.sqrt(base * base + hauteur * hauteur);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Triangle{");
        sb.append("base=").append(base);
        sb.append(", hauteur=").append(hauteur);
        sb.append('}');
        return sb.toString();
    }
}
