package org.aleksei.section6.challenges;

public class SwitchStatement {
    public static void main(String[] args) {
        char letter = 'X';
        switch (letter) {
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;
            default:
                System.out.println("Letter " + letter + " is not found in the switch statement");
                break;
        }
    }
}
