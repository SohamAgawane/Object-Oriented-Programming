package com.soham.interfaces12;

interface Football {
    static final int TOTAL_EQUIPMENTS = 1;
    void playFootball();
}

interface Cricket {
    static final int TOTAL_EQUIPMENTS = 2;
    void playCricket();
}

class Player implements Football, Cricket {
    @Override
    public void playFootball() {
        System.out.println("I like to play Football");
    }

    @Override
    public void playCricket() {
        System.out.println("I like to play Cricket");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        System.out.println("Football total equipments: " + Football.TOTAL_EQUIPMENTS);
        System.out.println("Cricket total equipments: " + Cricket.TOTAL_EQUIPMENTS);

        Player Soham = new Player();
        Soham.playFootball();
        Soham.playCricket();
    }
}
