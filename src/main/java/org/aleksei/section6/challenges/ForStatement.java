package org.aleksei.section6.challenges;

public class ForStatement {
    public static void main(String[] args) {
        for (double i = 7.5; i <= 10; i+=0.25) {
            double interestAmount = calculateInterest(100.00, i);
            System.out.println("$100.00 at " + i + "% interest = $" + interestAmount);
        }
    }
    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }
}
