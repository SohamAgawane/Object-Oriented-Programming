package com.soham.polymorphism6;

public class Triangle extends Shapes{
    int base = 4;
    int height = 5;

    @Override  // this is called annotation
    void area() {
        System.out.println("Area of triangle: " + 0.5 * base * height);
    }
}
