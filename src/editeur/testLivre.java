package editeur;

public class testLivre {

    public static void main(String[] args) {

        Livre livre = new Livre("L'appel de Cthulhu", 420,"Hp Lovecraft" );

        Livre livre2 = new Livre("Le sms de Cthulhu",  "Hp Lovecraft", 4, 40,"2-7654-1005-4", 2004 );

        System.out.println(livre);

        System.out.println(livre2);

    }
}
