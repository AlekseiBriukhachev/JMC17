package org.aleksei.section5.exercises;

public class E14NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));// →  should return false since the parameter is not in the range (1-9999)

        System.out.println(isLeapYear(1600));// → should return true since 1600 is a leap year

        System.out.println(isLeapYear(2017));// → should return false since 2017 is not a leap year

        System.out.println(isLeapYear(2000));// → should return true because 2000 is a leap year
    }

    public static boolean isLeapYear(int year) {
        return year >= 1 && year <= 9999 && ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return -1;
        }
    }
}
