package org.aleksei.codingexercises;

public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
        printConversion(95.75);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round (kilometersPerHour * 0.6215);
    }
    public static void printConversion(double kilometersPerHour) {
        System.out.println(toMilesPerHour(kilometersPerHour) != -1 ? kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h" : "Invalid Value");
    }
}
