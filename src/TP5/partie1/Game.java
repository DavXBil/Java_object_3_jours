package TP5.partie1;

import java.util.Scanner;

public class Game {

    private final Scanner scan = new Scanner(System.in);
    private int difficulty;
    private int allowedTries = 10;
    private boolean gameOver = false;


    public void start() {
        System.out.println("Choisissez un mode de difficulté:");
        System.out.println("1 - Facile");
        System.out.println("2 - Moyen");
        System.out.println("3 - Difficile");

    }


    public Scanner getScan() {
        return scan;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getAllowedTries() {
        return allowedTries;
    }

    public void setAllowedTries(int allowedTries) {
        this.allowedTries = allowedTries;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }
}
