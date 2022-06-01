package com.practice.polymorphism;

class A{
    public void example(){
        System.out.println("example in A");
    }
}
class B extends A{
    @Override
    public void example() {
        super.example();
        System.out.println("example in B");
    }
}
class C extends B{
    public void example(){
        System.out.println("example in C");
    }
}
public class Overriding {
    public static void main(String[] args) {
        A a=new A();
        a.example();

        A b=new B();
        b.example();

        A c=new C();
        c.example();
    }
}
