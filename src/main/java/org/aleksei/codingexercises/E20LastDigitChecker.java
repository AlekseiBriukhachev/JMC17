package org.aleksei.codingexercises;

public class E20LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit (41, 22, 71));// → should return true since 1 is the rightmost digit in numbers 41 and 71
        System.out.println(hasSameLastDigit (43, 22, 71));// → should return true since 1 is the rightmost digit in numbers 41 and 71
        System.out.println(hasSameLastDigit (23, 32, 42));// → should return true since 2 is the rightmost digit in numbers 32 and 42
        System.out.println(hasSameLastDigit (23, 33, 42));// → should return true since 2 is the rightmost digit in numbers 32 and 42
        System.out.println(hasSameLastDigit (9, 99, 999));// → should return false since 9 is not within the range of 10-1000

        System.out.println("*".repeat(15));

        System.out.println(isValid(10));// → should return true since 10 is within the range of 10-1000
        System.out.println(isValid(468));// → should return true since 468 is within the range of 10-1000
        System.out.println(isValid(1051));// → should return false since 1051 is not within the range of 10-1000
    }
    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        if (isValid(firstNumber) && (isValid(secondNumber)) && (isValid(thirdNumber))) {
            int lastDigitFirstNumber = firstNumber % 10;
            int lastDigitSecondNumber = secondNumber % 10;
            int lastDigitThirdNumber = thirdNumber % 10;
            return lastDigitFirstNumber == lastDigitSecondNumber ||
                    lastDigitFirstNumber == lastDigitThirdNumber ||
                    lastDigitSecondNumber == lastDigitThirdNumber;
        }
        return false;
    }
    public static boolean isValid(int number) {
        return  (number >= 10 && number <= 1000);
    }
}
