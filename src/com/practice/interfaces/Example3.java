package com.practice.interfaces;

interface In1
{
    final int a = 10;
    // the interface could not define the implementation. We can now add default implementation for interface methods.
    default void display()
    {
        System.out.println("hello display");
    }

    // Another feature that was added in JDK 8 is that we can now define static methods in interfaces that can be called independently without an object.
    // Note: these methods are not inherited
    static void displayNew()
    {
        System.out.println("hello static");
    }
}
public class Example3 implements In1 {
    public void show()
    {
        In1.super.display();
    }
    public static void main(String[] args) {
        Example3 t = new Example3();
        t.display();
        t.show();
        In1.displayNew();


    }
}
