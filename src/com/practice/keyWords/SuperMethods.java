package com.practice.keyWords;

class Person
{
    void message()
    {
        System.out.println("This is person class");
    }
}

class Student extends Person
{
    void message()
    {
        System.out.println("This is student class");
    }

    void display()
    {
        message();
        super.message();
    }
}
public class SuperMethods {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
