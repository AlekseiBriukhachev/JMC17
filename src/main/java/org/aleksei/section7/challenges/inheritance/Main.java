package org.aleksei.section7.challenges.inheritance;

public class Main {
    public static void main(String[] args) {

        Employee alex = new Employee("Alex", "27/01/1983", "01/01/2020");
        System.out.println(alex);
        System.out.println("Age = " + alex.getAge());
        System.out.println("Pay = " + alex.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990",
                "03/03/2020", 35000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension check = $" + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970",
                "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
    }
}
