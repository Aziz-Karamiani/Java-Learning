package com.java.polymorphism;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Car> cars = new HashSet<>();
        Car lamborghini = new Car(2, 4, 50, "lamborghini");
        cars.add(lamborghini);
        Car ferrari = new Car(4, 4, 50, "ferrari");
        cars.add(ferrari);
        Motorcycle honda = new Motorcycle(0, 2, 15, "honda");
        cars.add(honda);

        for (Car c: cars) {
            System.out.println(c);
        }

    }
}
