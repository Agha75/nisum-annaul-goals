package com.practice.asbtraction;

abstract class Base4{
    void fun(){
        System.out.println("base fun called");
    }
    final void fun1(){
        System.out.println("base final fun1 called");
    }
    // Similar to the interface we can define static methods in an abstract class that can be called independently without an object.
    static void fun2(){
        System.out.println("base static fun2 called");
    }
}
class Derived4 extends Base4{
    @Override
    void fun() {
        super.fun();
        System.out.println("Derived fun called");
    }
    //final cannot be override
}
public class Example4 {
    public static void main(String[] args) {
        Derived4 derived4=new Derived4();
        derived4.fun();
        derived4.fun1();
        Base4.fun2();
    }
}
