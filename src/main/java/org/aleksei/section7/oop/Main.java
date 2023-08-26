package org.aleksei.section7.oop;

public class Main {
    public static void main(String[] args) {

//        Car car = new Car();
//        car.describeCar();
//        car.setMake("Porsche");
//        car.setModel("Carrera");
//        car.setDoors(2);
//        car.setConvertible(true);
//        car.setColor("black");
//        System.out.println("make = " + car.getMake());
//        System.out.println("model = " + car.getModel());
//        car.describeCar();
//
//        Car targa = new Car();
//        targa.setMake("Porsche");
//        targa.setModel("Targa");
//        targa.setDoors(2);
//        targa.setConvertible(false);
//        targa.setColor("red");
//        targa.describeCar();
//        Account bobsAccount = new Account("12345", 500.00,
//                "Bob Brown", "myemail@bob.com",
//                "(087) 123-4567");
        Account bobsAccount = new Account();
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());
//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(1000.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmail("myemail@bob.com");
//        bobsAccount.setCustomerPhone("(087) 123-4567");


        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);

        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);
        bobsAccount.withdrawFunds(54.45);

        Account alexAccount = new Account("Alex", "Alex@email.com", "12345");
        System.out.println("AccountNo: " + alexAccount.getNumber() +
                "; name " + alexAccount.getCustomerName());
    }
}
