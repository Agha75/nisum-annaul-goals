package com.practice.asbtraction;

abstract class Base3{
    Base3() {
        System.out.println("base3 cons called");
    }
    abstract void fun();

}
class Derived3 extends Base3{
    Derived3() {
        super();
        System.out.println("Derived3 cons called");
    }

    @Override
    void fun() {
        System.out.println("Derived fun called");
    }
}
public class Example3 {
    public static void main(String[] args) {
        Derived3 b=new Derived3();
        b.fun();

    }
}
