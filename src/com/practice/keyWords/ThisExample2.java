package com.practice.keyWords;

public class ThisExample2 {
    int a;
    int b;
    void display(){
        System.out.println("value of a ="+a+" and b = "+b);
    }
    //Default constructor
    ThisExample2()
    {
        this(10, 20);
        System.out.println("Inside  default constructor \n");
    }

    //Parameterized constructor
    ThisExample2(int a, int b)
    {
        this.a = a;
        this.b = b;
        System.out.println("Inside parameterized constructor");
    }
    public static void main(String[] args) {
        ThisExample2 object = new ThisExample2();
        object.display();
    }
}
