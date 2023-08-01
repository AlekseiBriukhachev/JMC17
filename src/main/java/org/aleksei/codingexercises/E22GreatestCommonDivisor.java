package org.aleksei.codingexercises;

public class E22GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first >= 10 && second >= 10) {
            int minNumber = Math.min(first, second);
            for (int maxCommonDiveder = minNumber; maxCommonDiveder > 0; maxCommonDiveder--) {
                if ((first % maxCommonDiveder == 0) && (second % maxCommonDiveder == 0)) {
                    return maxCommonDiveder;
                }
            }
        }
        return -1;
    }
}
