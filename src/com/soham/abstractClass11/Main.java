package com.soham.abstractClass11;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(21);
        son.career();
        son.partner();

        Daughter daughter = new Daughter(19);
        daughter.career();

        Parent.Hello();

        son.normal();
    }
}
