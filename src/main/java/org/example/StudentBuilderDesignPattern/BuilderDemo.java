package org.example.StudentBuilderDesignPattern;

public class BuilderDemo {

    public static void main(String[] args) {
        StudentReceiver sr = new StudentReceiver();
        System.out.println(sr.getStudent());
    }
}
