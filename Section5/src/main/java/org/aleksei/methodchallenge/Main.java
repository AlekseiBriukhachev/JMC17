package org.aleksei.methodchallenge;

public class Main {
    public static void main(String[] args) {
        displayHighScorePosition("Aleksei", calculateHighScorePosition(1500));
        displayHighScorePosition("Tim", calculateHighScorePosition(999));
        displayHighScorePosition("Bob", calculateHighScorePosition(499));
        displayHighScorePosition("Rob", calculateHighScorePosition(99));
        displayHighScorePosition("Red", calculateHighScorePosition(25));

    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " maneged to get into position " + playerPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;
    }
}
