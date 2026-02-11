package com.soham.polymorphism6;

public class Circle extends Shapes{
    int r = 4;

    @Override
    void area() {
        System.out.println("Area of circle: " + 3.14 * r * r);
    }
}
