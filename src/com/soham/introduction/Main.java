package com.soham.introduction;

public class Main {
    public static void main(String[] args) {
        // Identity of the object
        Student student1 = new Student();

        // Before initializing the values (Default values)
        System.out.println(student1.rno);  // 0
        System.out.println(student1.name);  // null
        System.out.println(student1.marks);  // 0.0
        System.out.println(student1.age);  // 18

        // State of the object
        student1.rno = 7;
        student1.name = "Soham";
        student1.marks = 87.9f;
        student1.age = 22;

        // Behavior of the object
        student1.study();  // Student is studying

        // After initializing the values (Updated values)
        System.out.println(student1.rno);  // 7
        System.out.println(student1.name);  // Soham
        System.out.println(student1.marks);  // 87.9
        System.out.println(student1.age);  // 22

        // Constructor -
        Student student2 = new Student(13,"Kunal",92.5f,24);

        System.out.println(student2.rno);  // 13
        System.out.println(student2.name);  // Kunal

        // Default Constructor -
        Student student3 = new Student();
        System.out.println(student3.rno);  // 0
        System.out.println(student3.name);  // Ram

        student1.greetings();  // Hello! My name is Soham

        Student student4 = new Student();
        System.out.println(student4.rno); // 25

        Student student5 = new Student(10);

        Student student6 = new Student(32, "Rohit");


        Student student7 = new Student(student1);
        System.out.println(student7.rno);  // 7
        System.out.println(student7.name);  // Soham
        System.out.println(student7.marks);  // 87.9
        System.out.println(student7.age);  // 22

        // Example of calling a constructor from another constructor
        Student student8 = new Student();
        System.out.println(student8.rno);  // 13
        System.out.println(student8.name);  // Ishan
        System.out.println(student8.marks);  // 78.2

    }
}

// create a class -
class Student {
    int rno;
    String name;
    float marks;
    int age = 18;  // if value is not assigned use this as default value

    void study() {
        System.out.println("Student is studying");
    }

    // Constructor -
    Student(int rno, String name, float marks, int age) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
        this.age = age;
    }

    // Uses 'this' to access the current object's data
    void greetings() {
        System.out.println("Hello! My name is " + this.name);
    }

    // Default Constructor -
//    Student(){
//        this.rno = 25;
//        this.name = "Ram";
//        this.marks = 84.2f;
//    }

    Student(int rno) {
        this.rno = rno;
    }

    Student(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }

    // Therefore, this is also known as constructor overloading.
    // We have multiple constructors in same class, just with different parameters.

    // Constructor that takes value from another object -
    Student(Student other) {
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
        this.age = other.age;
    }

    // Calling a constructor from another constructor -
    Student() {
        // this is how you call another constructor from another constructor
        this(13,"Ishan", 78.2f, 34);
    }

}
