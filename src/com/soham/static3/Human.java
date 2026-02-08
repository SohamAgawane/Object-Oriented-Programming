package com.soham.static3;

import java.util.function.DoubleToIntFunction;

public class Human {
    String name;
    int age;
    char gender;
    static String country = "India";

    static void show(Human h) {
        System.out.println("Name : " + h.name);
        System.out.println("Age : " + h.age);
        System.out.println("Gender " + h.gender);
    }

    public Human(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
