package org.aleksei.section5.exercises;

public class E5LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }

    public static boolean isLeapYear(int year) {
        return year >= 1 && year <= 9999 && ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
    }
}
