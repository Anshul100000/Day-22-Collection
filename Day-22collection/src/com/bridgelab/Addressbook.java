package com.bridgelab;

import java.util.ArrayList;

public class Addressbook {
    private ArrayList<Person> addressBook = new ArrayList<Person>();

    public ArrayList<Person> addPerson(Person person) {
        this.addressBook.add(person);
        return this.addressBook;
    }

    public ArrayList<Person> getAddressBook() {
        return addressBook;
    }

    public void setAddressBook(ArrayList<Person> addressBook) {
        this.addressBook = addressBook;
    }

    public void printAddressBook() {
        for (Person person : this.addressBook) {
            System.out.println("First name = " + person.getFirstName());
            System.out.println("last name = " + person.getLastName());
            System.out.println("address = " + person.getAddress());
            System.out.println("city = " + person.getCity());
            System.out.println("state = " + person.getState());
            System.out.println("zip = " + person.getZip());
            System.out.println("phone number = " + person.getPhoneNumber());
            System.out.println("-----------------------------------------------------");
        }
    }
}
