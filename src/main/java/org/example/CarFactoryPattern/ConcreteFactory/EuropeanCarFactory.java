package org.example.CarFactoryPattern.ConcreteFactory;

import org.example.CarFactoryPattern.Car;
import org.example.CarFactoryPattern.CarFactory;
import org.example.CarFactoryPattern.CarSpecification;
import org.example.CarFactoryPattern.ConcreteProductForCarSpecification.EuropeSpecification;
import org.example.CarFactoryPattern.ConcreteProductsForCar.Hatchback;


public class EuropeanCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Hatchback();
    }

    @Override
    public CarSpecification createSpecification() {
        return new EuropeSpecification();
    }
}
