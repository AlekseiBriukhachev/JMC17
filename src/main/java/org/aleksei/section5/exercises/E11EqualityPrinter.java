package org.aleksei.section5.exercises;

public class E11EqualityPrinter {
    public static void main(String[] args) {
        printEqual(1, 1, 1); // should print text All numbers are equal

        printEqual(1, 1, 2); // should print text Neither all are equal or different

        printEqual(-1, -1, -1); // should print text Invalid Value

        printEqual(1, 2, 3); // should print text All numbers are different

        printEqual(2,1,1);
    }
    public static void printEqual(int value1, int value2, int value3) {
        if (value1 < 0 || value2 < 0 || value3 < 0) {
            System.out.println("Invalid Value");
        } else if (value1 == value2 && value1 == value3) {
            System.out.println("All numbers are equal");
        } else if (value1 != value2 && value1 != value3 && value2 != value3){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
