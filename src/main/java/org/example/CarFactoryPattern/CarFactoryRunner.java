package org.example.CarFactoryPattern;

import org.example.CarFactoryPattern.ConcreteFactory.EuropeanCarFactory;
import org.example.CarFactoryPattern.ConcreteFactory.NorthAmericaCarFactory;

public class CarFactoryRunner {

    public static void main(String[] args) {
        CarFactory northAmericaFactory = new NorthAmericaCarFactory();
        Car northAmericaCar = northAmericaFactory.createCar();
        CarSpecification northAmericaSpec = northAmericaFactory.createSpecification();

        northAmericaCar.assemble();
        northAmericaSpec.display();

        CarFactory europeFactory = new EuropeanCarFactory();
        Car europeCar = europeFactory.createCar();
        CarSpecification europeSpec = europeFactory.createSpecification();

        europeCar.assemble();
        europeSpec.display();
    }
}
