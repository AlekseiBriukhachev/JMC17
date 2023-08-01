package org.aleksei.codingexercises;

public class E19SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 90));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(12, 93));
        System.out.println(hasSharedDigit(77, 17));
        System.out.println(hasSharedDigit(12, 42));
    }
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {

        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            return false;
        }

        int firstDigitFirstNumber = firstNumber / 10;
        int firstDigitSecondNumber = secondNumber / 10;
        int secondDigitFirstNumber = firstNumber % 10;
        int secondDigitSecondNumber = secondNumber % 10;
        if (firstDigitFirstNumber == firstDigitSecondNumber
                || firstDigitFirstNumber == secondDigitSecondNumber
                || firstDigitSecondNumber == secondDigitFirstNumber
                || secondDigitFirstNumber == secondDigitSecondNumber) {
            return true;
        }

        return false;
    }
}
