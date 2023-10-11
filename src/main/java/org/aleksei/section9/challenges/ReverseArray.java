package org.aleksei.section9.challenges;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(reverseArray(new int[]{1, 2, 3, 4, 5})));
        System.out.println("*".repeat(20));
        reverse(new int[]{1, 2, 3, 4, 5});

    }

    private static int[] reverseArray(int[] sArray) {
        int[] temp = new int[sArray.length];
        for (int i = 0; i < sArray.length; i++) {
            temp[i] = sArray[sArray.length - i - 1];
            System.out.println(Arrays.toString(temp));
            System.out.println("*".repeat(20));
        }
        return Arrays.copyOf(temp, sArray.length);
    }

    private static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
            System.out.println("--> " + Arrays.toString(array));
        }
    }
}
