package org.example.CarFactoryPattern.ConcreteProductForCarSpecification;

import org.example.CarFactoryPattern.CarSpecification;

public class NorthAmericaSpecification implements CarSpecification {
    @Override
    public void display() {
        System.out.println("North America Car Specification: Safety features compliant with local regulations");
    }
}
