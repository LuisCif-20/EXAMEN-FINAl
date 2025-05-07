package org.example.refactorcode;

public class Circle implements Shape {

    private double ratio;


    @Override
    public double calculateArea() {
        return Math.PI * ratio * ratio;
    }

}
