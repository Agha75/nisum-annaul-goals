package com.practice.interfaces;

interface A{
    final int a=10;
    void display();
}
class B implements A{

    @Override
    public void display() {
        System.out.println("Here is the value of "+a);
    }
}
public class Example1 {
    public static void main(String[] args) {
        B b=new B();
        b.display();
    }
}
