package org.example.refactorcode;

public class Rectangle implements Shape {

    private double width;
    private double height;

    @Override
    public double calculateArea() {
        return width * height;
    }

}
