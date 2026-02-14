package com.soham.abstractClass11;

public abstract class Parent {
    static int age;

    public Parent(int age) {
        this.age = age;
    }

    static void Hello() {
        System.out.println("Hello from Parent class");
    }

    void normal() {
        System.out.println("i'm normal");
    }

    abstract void career();
    abstract void partner();
}
