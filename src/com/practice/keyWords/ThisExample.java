package com.practice.keyWords;

public class ThisExample {

    int a;
    int b;

    // Parameterized constructor
    ThisExample(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    void display()
    {
        //Displaying value of variables a and b
        System.out.println("a = " + a + "  b = " + b);
    }
    public static void main(String[] args) {
        ThisExample object = new ThisExample(10, 20);
        object.display();
    }
}
