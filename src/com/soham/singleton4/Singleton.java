package com.soham.singleton4;

public class Singleton {
    private Singleton() {}

    private static Singleton instance;

    public static Singleton getInstance() {
        // check if only 1 obj is created or not
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
