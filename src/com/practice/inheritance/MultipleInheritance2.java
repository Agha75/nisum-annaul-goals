package com.practice.inheritance;// Java program to demonstrate Multiple Inheritance

interface PI1 {

    default void show()
    {
        System.out.println("Default PI1");
    }
}


interface PI2 {

    default void show()
    {

        System.out.println("Default PI2");
    }
}

class MultipleInheritance2 implements PI1, PI2 {

    public void show()
    {

        // Using super keyword to call the show
        // method of PI1 interface
        PI1.super.show();

        // Using super keyword to call the show
        // method of PI2 interface
        PI2.super.show();
    }

    public static void main(String args[])
    {
        MultipleInheritance2 d = new MultipleInheritance2();
        d.show();
    }
}

/*
Note: If we remove the implementation of default method from “TestClass”,
        we get a compiler error. If there is a diamond through interfaces,
        then there is no issue if none of the middle interfaces provide implementation of root interface.
        If they provide implementation, then implementation can be accessed as above using super keyword.*/
