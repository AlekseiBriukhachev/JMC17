package org.aleksei.section9.exercise;

import java.util.Scanner;

public class MinimumElement {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(findMin(readElements(readInteger())));
    }
    private static int readInteger() {
        System.out.println("Enter the number of elements:");
        return Integer.parseInt(scanner.nextLine());
    }
    private static int[] readElements(int counter) {
        int[] sArray = new int[counter];
        System.out.printf("Please enter %d numbers, after each number please pres Enter:\n", counter);
        for (int i = 0; i < counter; i++) {
            sArray[i] = Integer.parseInt(scanner.nextLine().trim());
        }
        return sArray;
    }
    private static int findMin(int[] sArray) {
        int min = Integer.MAX_VALUE;
        for (int el : sArray) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }
}
