package com.soham.abstractClass11;

public class Son extends Parent{
    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I'm going to be a Engineer");
    }

    @Override
    void partner() {
        System.out.println("I love Ronaldo");
    }

    @Override
    void normal() {
        super.normal();
    }
}
