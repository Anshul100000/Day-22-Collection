package com.bridgelab;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Addressbook addressBook = new Addressbook();
        System.out.println("add details of a person");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide first name");
        String firstName = scanner.next();

        System.out.println("Please provide Last name");
        String lastName = scanner.next();

        System.out.println("Please provide address");
        String address = scanner.next();

        System.out.println("Please provide city");
        String city = scanner.next();

        System.out.println("Please provide state");
        String state = scanner.next();

        System.out.println("Please provide zip");
        int zip = scanner.nextInt();

        System.out.println("Please provide phone number");
        String phoneNumber = scanner.next();

        Person person = new Person(firstName, lastName, address, city, state, zip, phoneNumber);
        addressBook.addPerson(person);
        addressBook.printAddressBook();
        scanner.close();
    }
}
