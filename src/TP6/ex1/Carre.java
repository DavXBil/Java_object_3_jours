package TP6.ex1;

public class Carre implements  Forme{

    private double cote;

    public Carre(double cote) {
        this.cote = cote;
    }

    @Override
    public double calculAire() {
        return cote * cote;
    }

    @Override
    public double calculPerimetre() {
        return 4 * cote;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Carre{");
        sb.append("cote=").append(cote);
        sb.append('}');
        return sb.toString();
    }
}
