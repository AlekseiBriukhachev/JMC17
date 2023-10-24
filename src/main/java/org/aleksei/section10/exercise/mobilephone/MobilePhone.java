package org.aleksei.section10.exercise.mobilephone;

import java.util.ArrayList;

public class MobilePhone {
    private final String myNumber;
    private final ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) < 0) {
            myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if (position >= 0) {
            myContacts.set(position, newContact);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact contact) {
        return myContacts.contains(contact) && myContacts.remove(contact);
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1; // Contact not found
    }

    public Contact queryContact(String name) {
//        return contacts.stream()
//                .filter(contact -> contact.getName().equals(name))
//                .findFirst()
//                .orElse(null);
        for (Contact contact : myContacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    public void printContacts() {

        System.out.println("Contact List:");
        for (Contact contact : myContacts) {
            int position = myContacts.indexOf(contact) + 1;
            System.out.printf("%d. %s -> %s\n", position, contact.getName(), contact.getPhoneNumber());
        }
    }
}
