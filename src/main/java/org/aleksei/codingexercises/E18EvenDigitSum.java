package org.aleksei.codingexercises;

public class E18EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
    public static int getEvenDigitSum(int number) {
        int sum = 0;
        if (number < 0) {
            return -1;
        }
        int digit = 0;
        while (number != 0) {
            digit = number % 10;
            number /= 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
        }
        return sum;
    }
}
