package TP5.partie1;

public class RandomNumber {

    private final int number;

    public RandomNumber(int min, int max) {
        this.number = (int)(Math.random() * (max - min + 1) + min );
    }

    public int getNumber() {
        return number;
    }

}
