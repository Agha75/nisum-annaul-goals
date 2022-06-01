package com.practice.polymorphism;

class Parent1 {
    void show()
    {
        System.out.println("Parent's show()");
    }
}

// Inherited class
class Child1 extends Parent1 {
    // This method overrides show() of Parent
    @Override
    void show()
    {
        super.show();
        System.out.println("Child's show()");
    }
}
public class Overriding3 {
    public static void main(String[] args) {
        Parent1 p=new Child1();
        p.show();
    }
}
