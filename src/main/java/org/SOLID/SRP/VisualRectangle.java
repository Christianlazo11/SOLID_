package org.SOLID.SRP;

public class VisualRectangle extends Rectangle{

    double x , y;

    public VisualRectangle(double width, double height, double x , double y) {
        super(width, height);
        this.x = x;
        this.y = y;
    }

    public void draw() {

    }
}
