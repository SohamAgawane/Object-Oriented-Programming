package com.soham.static3;

public class Main {
    public static void main(String[] args) {
        Human person1 = new Human("Soham", 22, 'M');
        Human person2 = new Human("Kunal", 25, 'M');

        System.out.println(Human.country);  // India

        Human.show(person1);
    }


}
