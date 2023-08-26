package org.aleksei.section7.challenges;

public class Customer {
    private String name;
    private double limit;
    private String email;

    public Customer() {
        this("No name",  "no email");
    }
    public Customer(String name, String email) {
        this(name, 500.00, email);
    }

    public Customer(String name, double limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }
}
