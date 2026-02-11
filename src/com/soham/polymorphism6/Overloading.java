package com.soham.polymorphism6;

public class Overloading {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.sum(2,3);
        obj.sum(2,3,4);
    }
}
