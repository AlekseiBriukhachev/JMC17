package org.aleksei.section7.oop.stringmethods;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        printInformation("Hello World");
        printReverse("Hello World");
        printInformation("");
        printInformation("\t   \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));
        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l'));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l', 3));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l', 8));
        System.out.println("*".repeat(25));

        String helloWorldLower = helloWorld.toLowerCase();
        if (helloWorld.equals(helloWorldLower)) {
            System.out.println("Values match exactly");
        }
        if (helloWorld.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values match ignoring case");
        }

        if (helloWorld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }
        if (helloWorld.endsWith("World")) {
            System.out.println("String ends with World");
        }
        if (helloWorld.contains("World")) {
            System.out.println("String contains World");
        }
        System.out.println("*".repeat(25));
        if (helloWorld.contentEquals("Hello World")) {
            System.out.println("Values match exactly");
        }


    }

    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length = %d%n", length);

        if (string.isEmpty()) {
            System.out.println("String is Empty");
            return;
        }
        if (string.isBlank()) {
            System.out.println("String is blank");
        }

        System.out.printf("First char = %c %n", string.charAt(0));

        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }

    public static void printReverse(String string) {
        for (int i = string.length() - 1; i >= 0; i--) {
            System.out.print(string.charAt(i));
        }
        System.out.println();
        IntStream.iterate(string.length() - 1, i -> i >= 0, i -> i - 1)
                        .forEachOrdered(i -> System.out.print(string.charAt(i)));
        System.out.println();
    }
}
