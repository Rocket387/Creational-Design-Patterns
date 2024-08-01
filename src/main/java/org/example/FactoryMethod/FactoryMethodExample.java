package org.example.FactoryMethod;

/*
Factory Method Design Pattern define an interface for creating an object,
but let subclass decide which class to instantiate.
Factory Method lets a class defer instantiation to subclass.
 */
public class FactoryMethodExample {

    public static void main(String[] args){
        Factory factoryA = new ConcreteFactoryA();
        Product productA = factoryA.factoryMethod();
        productA.display();

        Factory factoryB = new ConcreteFactoryB();
        Product productB = factoryB.factoryMethod();
        productB.display();

    }
}
