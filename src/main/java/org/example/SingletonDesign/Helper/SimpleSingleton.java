package org.example.SingletonDesign.Helper;

//Helper class
public class SimpleSingleton {

    //static variable reference of single_instance of type Singleton
    private static SimpleSingleton single_instance = null;

    //declaring a variable of type String
    public String s;

    //constructor
    //private construcctor restricting usage to this class only
    private SimpleSingleton() {
        s = "Hello I am a string part of Singleton Class";
    }

    //static method to create instance of Singleton Class
    public static synchronized SimpleSingleton getInstance() {
        if (single_instance == null)
            single_instance = new SimpleSingleton();

        return single_instance;
    }

}
