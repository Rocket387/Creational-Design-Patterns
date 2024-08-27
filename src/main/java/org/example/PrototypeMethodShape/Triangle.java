package org.example.PrototypeMethodShape;

public class Triangle implements Shape{

    private String sides;

    public Triangle(String sides) {
        this.sides = sides;
    }
    @Override
    public Shape clone() {
        return new Triangle(this.sides);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle with " + sides + " sides");
    }
}
