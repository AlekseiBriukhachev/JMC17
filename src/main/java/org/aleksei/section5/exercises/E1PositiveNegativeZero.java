package org.aleksei.section5.exercises;

public class E1PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-10);
        checkNumber(0);
    }

    private static void checkNumber(int number) {
        System.out.println((number > 0) ? "positive" : (number < 0) ? "negative" : "zero");
    }
}
