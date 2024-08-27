package org.example.PrototypeMethodShape;

public class PrototypeExample {

    public static void main(String[] args) {

        Shape circlePrototype = new Circle("red");

        ShapeClient client = new ShapeClient(circlePrototype);

        Shape redCircle = client.createShape();
        redCircle.draw();

        Shape trianglePrototype = new Triangle("three");
        ShapeClient client2 = new ShapeClient(trianglePrototype);

        Shape triangle = client2.createShape();
        triangle.draw();
    }
}
