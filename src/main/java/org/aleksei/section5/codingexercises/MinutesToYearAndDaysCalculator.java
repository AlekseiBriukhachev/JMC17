package org.aleksei.section5.codingexercises;

public class MinutesToYearAndDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);  //should print "525600 min = 1 y and 0 d"

        printYearsAndDays(1051200); //should print "1051200 min = 2 y and 0 d"

        printYearsAndDays(-561600); //should print "561600 min = 1 y and 25 d"
    }
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;

            long days = hours / 24;

            long year = days / 365;

            long remainingDays = days % 365;

            System.out.println(minutes + " min = " + year + " y and " + remainingDays + " d");
        }
    }
}
