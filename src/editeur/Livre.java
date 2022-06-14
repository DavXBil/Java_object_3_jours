package editeur;

public class Livre {

    String titre;
    String auteur;
    int prix;
    double nb_pages;
    String isbn;
    int annee;

    public Livre() {
    }

    public Livre(String titre, double nb_pages, String isbn) {
        this.titre = titre;
        this.nb_pages = nb_pages;
        this.isbn = isbn;
    }

    public Livre(String titre, String auteur, int prix, double nb_pages, String isbn) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.nb_pages = nb_pages;
        this.isbn = isbn;
    }

    public Livre(String titre, String auteur, int prix, double nb_pages, String isbn, int annee) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.nb_pages = nb_pages;
        this.isbn = isbn;
        this.annee = annee;
    }

    public Livre(Livre livre) {
        this.titre = livre.titre;
        this.auteur = livre.auteur;
        this.prix = livre.prix;
        this.nb_pages = livre.nb_pages;
        this.isbn = livre.isbn;
        this.annee = livre.annee;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public double getNb_pages() {
        return nb_pages;
    }

    public void setNb_pages(double nb_pages) {
        this.nb_pages = nb_pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", prix=" + prix +
                ", nb_pages=" + nb_pages +
                ", isbn='" + isbn + '\'' +
                ", annee=" + annee +
                '}';
    }
}
