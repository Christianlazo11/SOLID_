package org.SOLID.SRP;

public class Rectangle {

    double width;
    double height;

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public double calArea() {
        return width * height;
    }


}
