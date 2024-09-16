package org.example.SingletonDesign;

import org.example.SingletonDesign.Helper.SimpleSingleton;

public class SingletonMain {

    public static void main(String[] args) {

        //Instantiating Singleton Class with variable x
        SimpleSingleton x = SimpleSingleton.getInstance();

        //Instantiating Singleton Class with variable y
        SimpleSingleton y = SimpleSingleton.getInstance();

        //Instantiating Singleton Class with variable x
        SimpleSingleton z = SimpleSingleton.getInstance();


        //printing hash code for above variables
        System.out.println("Hashcode of x is: " + x.hashCode());
        System.out.println("Hashcode of y is: " + y.hashCode());
        System.out.println("Hashcode of z is: " + z.hashCode());

        //condition check
        if (x == y && y == z) {
            System.out.println("Three objects point to the same memory location on the heap i.e to the same object");
        } else {
            System.out.println("Three objects DO NOT point to the same memory location on the heap");
        }

        //changing variable of instance x using to upper method
        x.s = (x.s).toUpperCase();

        System.out.println("String from x is " + x.s);
    }
}
