package org.aleksei.section5.overloadmethodchallenge;

public class OverloadMethod {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(5, 8) + " cm");
    }
    public static double convertToCentimeters(int inches) {
        return inches * 2.54d;
    }
    public static double convertToCentimeters(int feet, int inches) {
        return convertToCentimeters(inches + feet * 12);
    }
}
