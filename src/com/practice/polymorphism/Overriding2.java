package com.practice.polymorphism;

class Parent {
    // private methods are not overridden
    private void m1()
    {
        System.out.println("From parent m1()");
    }

    protected void m2()
    {
        System.out.println("From parent m2()");
    }
    static void m3(){
        System.out.println("Static from parent");
    }
}

class Child extends Parent {
    // new m1() method
    // unique to Child class
    private void m1()
    {
        System.out.println("From child m1()");
    }

    // overriding method
    // with more accessibility
    @Override
    public void m2()
    {
        System.out.println("From child m2()");
    }
    static void m3(){
        System.out.println("Static from child");
    }
}
public class Overriding2 {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.m2();
        Parent obj2 = new Child();
        obj2.m2();
        Parent obj3 = new Child();
        obj3.m3();
        Child obj4 = new Child();
        obj4.m3();
    }
}

//Note : Private methods cannot be overridden
//Protected can overridden but in subclass it will public
//Final methods can also be not ridden
//static methods hides parent methods
