package com.java.polymorphism;

import java.util.Objects;

public class Car {
    private Integer numberOfDoors;
    private Integer numberOfWheel;
    private Integer fuelTankCapacity;
    private String type;

    public Car() {
    }

    public Car(Integer numberOfDoors, Integer numberOfWheel, Integer fuelTankCapacity, String type) {
        this.numberOfDoors = numberOfDoors;
        this.numberOfWheel = numberOfWheel;
        this.fuelTankCapacity = fuelTankCapacity;
        this.type = type;
    }

    public Integer getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(Integer numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Integer getNumberOfWheel() {
        return numberOfWheel;
    }

    public void setNumberOfWheel(Integer numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
    }

    public Integer getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(Integer fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getNumberOfDoors().equals(car.getNumberOfDoors()) &&
                getNumberOfWheel().equals(car.getNumberOfWheel()) &&
                getFuelTankCapacity().equals(car.getFuelTankCapacity()) &&
                getType().equals(car.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumberOfDoors(), getNumberOfWheel(), getFuelTankCapacity(), getType());
    }

    @Override
    public String toString() {
        return  this.getClass().getSimpleName() + "{" +
                "numberOfDoors=" + numberOfDoors +
                ", numberOfWheel=" + numberOfWheel +
                ", fuelTankCapacity=" + fuelTankCapacity +
                ", type='" + type + '\'' +
                '}';
    }
}
