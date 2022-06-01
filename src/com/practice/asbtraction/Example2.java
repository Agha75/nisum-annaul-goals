package com.practice.asbtraction;

abstract class Base{
    abstract void fun();
}
class Derived extends Base{

    @Override
    void fun() {
        System.out.println("Derived fun called");
    }
}
public class Example2 {
    public static void main(String[] args) {
        Base b=new Derived();
        b.fun();
    }
}
