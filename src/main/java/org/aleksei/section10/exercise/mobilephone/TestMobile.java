package org.aleksei.section10.exercise.mobilephone;

public class TestMobile {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("1234");
        mobilePhone.addNewContact(Contact.createContact("Bob", "31415926"));
        mobilePhone.addNewContact(Contact.createContact("Alice", "16180339"));
        mobilePhone.addNewContact(Contact.createContact("Tom", "11235813"));
        mobilePhone.addNewContact(Contact.createContact("Jane", "23571113"));
        mobilePhone.addNewContact(Contact.createContact("Jane", "1234566"));

        mobilePhone.printContacts();

    }

}
