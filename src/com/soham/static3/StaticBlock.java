package com.soham.static3;

public class StaticBlock {
    static int a = 2;
    static int b;

    static {
        System.out.println("I am in static block");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();

        System.out.println(StaticBlock.a);
        System.out.println(StaticBlock.b);

        StaticBlock.b += 5;
        System.out.println(StaticBlock.a);
        System.out.println(StaticBlock.b);
    }
}
