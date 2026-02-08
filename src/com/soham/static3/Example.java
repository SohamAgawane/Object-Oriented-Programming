package com.soham.static3;

public class Example {
    public static void main(String[] args) {
        Example fun2 = new Example();
        fun2.fun();
    }

    void fun() {
        greeting();
    }

    static void greeting() {
        System.out.println("Hello");
    }
}
