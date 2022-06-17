package TP6.ex1;

public class Losange implements Forme {

    private double Gdiagonale;
    private double Pdiagonale;

    public Losange(double gdiagonale, double pdiagonale) {
        Gdiagonale = gdiagonale;
        Pdiagonale = pdiagonale;
    }

    @Override
    public double calculAire() {
        return Gdiagonale * Pdiagonale / 2;
    }

    @Override
    public double calculPerimetre() {
        return 2 * Math.sqrt(Pdiagonale * Pdiagonale + Gdiagonale * Gdiagonale);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Losange{");
        sb.append("Gdiagonale=").append(Gdiagonale);
        sb.append(", Pdiagonale=").append(Pdiagonale);
        sb.append('}');
        return sb.toString();
    }
}
