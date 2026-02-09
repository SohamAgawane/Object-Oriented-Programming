package com.soham.inheritance5;

import org.w3c.dom.ls.LSOutput;

class A {
    int a;
    A() {
        this.a = 10;
        System.out.println("--------------------------------------");
        System.out.println("Inside Parent Class A " + this.a);
    }
}


// Single Inheritance
class B extends A {
    int a;
    B() {
        this.a = 20;
        System.out.println();
        System.out.println("Inside Single Inheritance " + this.a);
        System.out.println(super.a);  // 10
        System.out.println(this.a);  // 20
    }
}


// Multilevel Inheritance
class C extends B {
    int a;
    C() {
        this.a = 30;
        System.out.println();
        System.out.println("Inside Multilevel Inheritance " + this.a);
        System.out.println(super.a);
        System.out.println(this.a);
    }
}


// Hierarchical Inheritance
class D {
    int x;
    D() {
        this.x = 25;
    }
}

class E extends D {
    int x;
    E() {
        this.x = 35;
        System.out.println();
        System.out.println("Inside Hierarchical Inheritance");
        System.out.println(super.x);
        System.out.println(this.x);
    }
}

class F extends D {
    int x;
    F() {
        this.x = 45;
        System.out.println(super.x);
        System.out.println(this.x);
    }
}


public class types {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        E e = new E();
    }
}
