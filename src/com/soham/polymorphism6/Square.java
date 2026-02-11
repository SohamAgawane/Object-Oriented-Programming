package com.soham.polymorphism6;

public class Square extends Shapes{
    int side = 4;

    @Override
    void area() {
        System.out.println("Area of square: " + side * side);
    }
}
