package org.aleksei.codingexercises;

public class E17FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println("Sum of first and last digits = " + sumFirstAndLastDigit(252));
        System.out.println("Sum of first and last digits = " + sumFirstAndLastDigit(257));
        System.out.println("Sum of first and last digits = " + sumFirstAndLastDigit(0));
        System.out.println("Sum of first and last digits = " + sumFirstAndLastDigit(5));
        System.out.println("Sum of first and last digits = " + sumFirstAndLastDigit(-5));
        System.out.println("Sum of first and last digits = " + sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {

        int checkedNumber = number;
        int firstDigit = 0;
        int lastDigit = 0;
        lastDigit = checkedNumber % 10;
        while (checkedNumber != 0) {
            firstDigit = checkedNumber % 10;
            checkedNumber /= 10;
        }
        return number < 0 ? -1 : firstDigit + lastDigit;
    }
}
