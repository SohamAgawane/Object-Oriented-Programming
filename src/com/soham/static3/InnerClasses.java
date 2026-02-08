package com.soham.static3;

// Outside classes cannot be static only inner classes can be static

public class InnerClasses {
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test A = new Test("Soham");
        Test B = new Test("Virat");

        System.out.println(A.name);
        System.out.println(B.name);
    }
}