package org.aleksei.codingexercises;

public class E8TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }
    public static boolean hasTeen(int v1, int v2, int v3) {
        return isTeen(v1) || isTeen(v2) || isTeen(v3);
    }
    public static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }
}
