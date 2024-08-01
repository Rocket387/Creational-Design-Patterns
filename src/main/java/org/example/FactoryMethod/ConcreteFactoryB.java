package org.example.FactoryMethod;

public class ConcreteFactoryB implements Factory{
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
