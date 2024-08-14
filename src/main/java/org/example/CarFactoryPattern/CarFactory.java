package org.example.CarFactoryPattern;

public interface CarFactory {
    Car createCar();
    CarSpecification createSpecification();
}
