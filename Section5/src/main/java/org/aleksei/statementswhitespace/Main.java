package org.aleksei.statementswhitespace;

public class Main {
    public static void main(String[] args) {

        checkAndPrint(true, 800, 5, 100);

        checkAndPrint(true, 10000, 8, 200);
    }

    private static void checkAndPrint(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score: " + finalScore);
        }
    }
}
