package com.practice.keyWords;

public class ThisExample4 {
    int a;
    int b;

    //Default constructor
    ThisExample4()
    {
        a = 10;
        b = 20;
    }

    //Method that returns current class instance
    ThisExample4 get()
    {
        return this;
    }

    //Displaying value of variables a and b
    void display()
    {
        System.out.println("a = " + a + "  b = " + b);
    }
    public static void main(String[] args) {
        ThisExample4 object = new ThisExample4();
        object.get().display();

    }
}
