package org.example.FactoryMethod;

/*
The Factory pattern deals with
creating objects of a single type
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
