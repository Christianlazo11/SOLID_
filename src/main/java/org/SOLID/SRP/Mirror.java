package org.SOLID.SRP;

public class Mirror {

    private Rectangle rectangle;

    public Mirror(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public double getMirrorPrice(double areaPrice) {
        return rectangle.calArea() * areaPrice;
    }
}
