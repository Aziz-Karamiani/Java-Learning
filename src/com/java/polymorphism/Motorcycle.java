package com.java.polymorphism;

public class Motorcycle extends Car {
    public Motorcycle(Integer numberOfDoors, Integer numberOfWheel, Integer fuelTankCapacity, String type) {
        super(numberOfDoors, numberOfWheel, fuelTankCapacity, type);
        System.out.println("Motorcycle");
    }
}
