package org.aleksei.section7.challenges;

public class ConstructorChallenge {
    public static void main(String[] args) {
        Customer firstCustomer = new Customer();
        System.out.println(firstCustomer.getName());
        System.out.println(firstCustomer.getLimit());
        System.out.println(firstCustomer.getEmail());
        System.out.println("*".repeat(15));

        Customer secondCustomer = new Customer("Alex", "Alex@email.com");
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getLimit());
        System.out.println(secondCustomer.getEmail());
        System.out.println("*".repeat(15));

        Customer thirdCustomer = new Customer("AlexTT",1500.00, "AlexTTT@email.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getLimit());
        System.out.println(thirdCustomer.getEmail());
        System.out.println("*".repeat(15));
    }
}
