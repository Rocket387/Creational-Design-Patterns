package org.example.CarFactoryPattern.ConcreteProductsForCar;

import org.example.CarFactoryPattern.Car;

public class Sedan implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling Sedan");
    }
}
