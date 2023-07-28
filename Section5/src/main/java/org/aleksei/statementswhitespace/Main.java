package org.aleksei.statementswhitespace;

public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = checkAndPrint(gameOver, score, levelCompleted, bonus);
        System.out.println("The high score is " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        System.out.println("The next high score is " + checkAndPrint(gameOver, score, levelCompleted, bonus));

    }

    private static int checkAndPrint(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
        }
        return finalScore;
    }
}
