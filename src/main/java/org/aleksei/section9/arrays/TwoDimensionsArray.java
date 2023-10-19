package org.aleksei.section9.arrays;

import java.util.Arrays;

public class TwoDimensionsArray {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        System.out.println(Arrays.toString(array));
        System.out.println("array.length = " + array.length);

        for (int[] outer : array) {
            System.out.println(Arrays.toString(outer));
        }

        for (int i = 0; i < array.length; i++) {
            var innerArray = array[i];
            for (int j = 0; j < innerArray.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
