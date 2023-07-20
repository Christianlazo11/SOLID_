package org.SOLID.SRP;

public class Main {

    public static void main(String[] args) {

        double width = 20;
        double heigth = 50;
        double areaPrice = 5;

        Rectangle rectangle = new Rectangle(width, heigth);
        Mirror mirror = new Mirror(rectangle);

        mirror.getMirrorPrice(areaPrice);
    }
}
