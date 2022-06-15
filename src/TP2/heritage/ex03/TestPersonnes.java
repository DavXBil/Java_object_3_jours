package TP2.heritage.ex03;

public class TestPersonnes {


    public static void main(String[] args) {
        Formateur form1 = new Formateur("Jean", "Test", "0202020202", "02/02/2022");
        Formateur form2 = new Formateur("Jean", "Test2", "0202020202", "02/02/2022");

        Stagiaire st1 = new Stagiaire("Aupif", "Billy", "0202020202", "02/02/1992", "rue du pif", 56000, "Melun");

        System.out.println(form1);
        System.out.println(form2);
        System.out.println(st1);


    }

}
