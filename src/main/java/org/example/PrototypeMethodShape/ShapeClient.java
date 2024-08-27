package org.example.PrototypeMethodShape;

public class ShapeClient {

    private final Shape shapePrototype;

    //always give the client a prototype (in this case a shape)
    public ShapeClient(Shape shapePrototype) {
        this.shapePrototype = shapePrototype;
    }

    //method creates a new shape using (cloning) the prototype
    public Shape createShape() {
        return shapePrototype.clone();
    }
}
