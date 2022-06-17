package TP6.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class TestFormes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean isOver = false;
        List<Forme> formes = new ArrayList<Forme>();

        do {
            System.out.println("Quelle forme voulez-vous?");
            System.out.println("1 - Triangle");
            System.out.println("2 - Carré");
            System.out.println("3 - Rectangle");
            System.out.println("4 - Cercle");
            System.out.println("5 - Losange");

            int input = scan.nextInt();

            switch (input) {

                case 1:
                    System.out.println("Entrez la longueur de la base");
                    int base = scan.nextInt();
                    System.out.println("Entrez la hauteur");
                    int hauteur = scan.nextInt();

                    formes.add(new Triangle(base, hauteur));

                    break;

                case 2:
                    System.out.println("Entrez la longueur des cotés");
                    int cotes = scan.nextInt();

                    formes.add(new Carre(cotes));

                    break;


                case 3:
                    System.out.println("Entrez la longueur");
                    int longueur = scan.nextInt();
                    System.out.println("Entrez la largeur");
                    int largeur = scan.nextInt();

                    formes.add(new Rectangle(longueur, largeur));

                    break;


                case 4:
                    System.out.println("Entrez le rayon");
                    int rayon = scan.nextInt();

                    formes.add(new Cercle(rayon));

                    break;

                case 5:
                    System.out.println("Entrez la longueur de la grande diagonale");
                    int gDiagonale = scan.nextInt();
                    System.out.println("Entrez la largeur de la grande diagonale");
                    int pdiagonale = scan.nextInt();

                    formes.add(new Losange(gDiagonale, pdiagonale));

                    break;

            }

            System.out.println("Une autre forme? oui/non");
            String bool = scan.next();

            if (Objects.equals(bool, "non")) {
                isOver = true;
            }

        } while (!isOver);

        for (Forme forme: formes) {
            System.out.println(forme);
            System.out.println("Aire =" + forme.calculAire());

        }

    }

}
