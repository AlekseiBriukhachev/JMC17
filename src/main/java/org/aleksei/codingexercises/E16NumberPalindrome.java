package org.aleksei.codingexercises;

public class E16NumberPalindrome {
    public static void main(String[] args) {
        System.out.println("Number is palindrome = " + isPalindrome(-1221));
        System.out.println("Number is palindrome = " + isPalindrome(707));
        System.out.println("Number is palindrome = " + isPalindrome(11212));
    }
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int lastDigit = 0;
        int checkNumber = number;

        while (checkNumber != 0) {
            lastDigit = checkNumber % 10;
            checkNumber /= 10;
            reverse *= 10;
            reverse += lastDigit;
        }

        return reverse == number;
    }
}
