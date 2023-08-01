package org.aleksei.codingexercises;

public class E21AllFactors {
    public static void main(String[] args) {
        printFactors(6);// → should print 1 2 3 6
        printFactors(32);// → should print 1 2 4 8 16 32
        printFactors(10);// → should print 1 2 5 10
        printFactors(-1);// → should print "Invalid Value" since number is < 1
    }
    public static void printFactors(int number) {
        if (number >= 1) {
            int factor = 1;
            while (factor <= number) {
                if (number % factor == 0) {
                    System.out.println(factor);
                }
                factor++;
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
}
