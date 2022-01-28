package com.marcelkatz;

public class Main {
    public static void main (String[] args) {
        User u1 = new User("Omar", "Gomez", "12345678901");
        System.out.println("User1: " + u1.getFirstName() + " " + u1.getLastName() + " " + u1.getPhoneNumber());
        User u2 = new User("Jamil", "Jamil", "32145678901");
        System.out.println("User1: " + u2.getFirstName() + " " + u2.getLastName() + " " + u2.getPhoneNumber());
    }
}
