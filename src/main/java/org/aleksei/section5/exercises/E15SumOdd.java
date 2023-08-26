package org.aleksei.section5.exercises;

public class E15SumOdd {
    public static void main(String[] args) {
//        System.out.println(isOdd(2));
//        System.out.println(isOdd(-2));
//        System.out.println(isOdd(4));
//        System.out.println(isOdd(67));

        System.out.println(sumOdd(1, 100));// → should return 2500
        System.out.println(sumOdd(-1, 100));// → should return -1
        System.out.println(sumOdd(100, 100));// → should return 0
        System.out.println(sumOdd(13, 13));// → should return 13 (This set contains one number, 13, and it is odd)
        System.out.println(sumOdd(100, -100));// → should return -1
        System.out.println(sumOdd(100, 1000));// → should return 247500
        System.out.println(sumOdd(10, 5));
    }
    public static boolean isOdd(int number) {
        return number > 0 && number % 2 != 0;
    }
    public static int sumOdd(int start, int end){
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return (start <= 0 || end <= 0 || start > end) ? -1 : sum;
    }
}
