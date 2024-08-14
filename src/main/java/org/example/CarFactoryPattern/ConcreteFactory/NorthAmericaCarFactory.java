package org.example.CarFactoryPattern.ConcreteFactory;

import org.example.CarFactoryPattern.Car;
import org.example.CarFactoryPattern.CarFactory;
import org.example.CarFactoryPattern.CarSpecification;
import org.example.CarFactoryPattern.ConcreteProductForCarSpecification.NorthAmericaSpecification;
import org.example.CarFactoryPattern.ConcreteProductsForCar.Sedan;

public class NorthAmericaCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public CarSpecification createSpecification() {
        return new NorthAmericaSpecification();
    }
}
