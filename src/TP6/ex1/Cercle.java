package TP6.ex1;

public class Cercle implements Forme {

    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double calculAire() {
        return Math.PI * Math.pow(rayon, 2);
    }

    @Override
    public double calculPerimetre() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cercle{");
        sb.append("rayon=").append(rayon);
        sb.append('}');
        return sb.toString();
    }
}
