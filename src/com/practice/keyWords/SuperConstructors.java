package com.practice.keyWords;

class Person1
{
    Person1()
    {
        System.out.println("Person class Constructor");
    }
}

class Student1 extends Person1
{
    Student1()
    {
        super();
        System.out.println("Student class Constructor");
    }
}
public class SuperConstructors {
    public static void main(String[] args) {
        Student1 s = new Student1();
    }
}
