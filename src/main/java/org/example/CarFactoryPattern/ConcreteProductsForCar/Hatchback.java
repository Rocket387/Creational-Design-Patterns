package org.example.CarFactoryPattern.ConcreteProductsForCar;

import org.example.CarFactoryPattern.Car;

public class Hatchback implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling Hatchback car");
    }
}
