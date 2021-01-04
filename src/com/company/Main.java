package com.company;

public class Main {

    public static void main(String[] args) {
        DropPoint destination = new DropPoint("Yerevanska", 3);
        Package SomeFood = new Package("Some Food", 250, destination);

        System.out.println("Designation: " + SomeFood.getName());
        System.out.println("Id: " + SomeFood.getCost());
        System.out.println("Destination street: " + SomeFood.getDestination().getStreet());
        System.out.println("Destination building number: " + SomeFood.getDestination().getNumber());

        destination.setStreet("Hoholivska");
        destination.setNumber(1);

        System.out.println();

        System.out.println("Designation: " + SomeFood.getName());
        System.out.println("Id: " + SomeFood.getCost());
        System.out.println("Destination street: " + SomeFood.getDestination().getStreet());
        System.out.println("Destination building number: " + SomeFood.getDestination().getNumber());
    }
}
