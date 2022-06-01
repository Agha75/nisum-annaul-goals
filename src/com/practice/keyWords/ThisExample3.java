package com.practice.keyWords;

public class ThisExample3 {
    void display()
    {
        // calling function show()
        this.show();

        System.out.println("Inside display function");
    }

    void show() {
        System.out.println("Inside show function");
    }
    public static void main(String[] args) {
        ThisExample3 t1 = new ThisExample3();
        t1.display();
    }
}
