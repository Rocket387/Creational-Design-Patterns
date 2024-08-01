package org.example.FactoryMethod;

public class ConcreteFactoryA implements Factory{
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
