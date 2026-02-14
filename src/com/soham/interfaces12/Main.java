package com.soham.interfaces12;

interface Animal {
    void sound();
}

class Dog implements Animal {
    @Override
    public final void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
    }
}
