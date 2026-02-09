package com.soham.inheritance5;

// Base Class
class Mammal {
    void breathe() {
        System.out.println("Mammals breathe oxygen");
    }

    void giveBirth() {
        System.out.println("Mammals give birth to live young");
    }

    void sound() {
        System.out.println("Mammals make sound");
    }
}

// Child class 1
class Human extends Mammal {
    void speak() {
        System.out.println("Humans can speak");
    }
}

// Child class 2
class Dog extends Mammal {
    void bark() {
        System.out.println("Dogs bark");
    }
}

class Sport {
    String object = "Ball";
}

class Cricket extends Sport {
    String object = "Bat";
    void show() {
        System.out.println(object);
        System.out.println(super.object);
    }
}

public class Main {
    public static void main(String[] args) {
        Human h = new Human();
        h.breathe();  // inherited
        h.giveBirth();  // inherited
        h.speak();  // own

        Dog d = new Dog();
        d.breathe();  // inherited
        d.giveBirth();  // inherited
        d.bark();  // own

        Cricket c = new Cricket();
        c.show();
    }
}
