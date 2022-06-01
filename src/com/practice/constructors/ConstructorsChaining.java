package com.practice.constructors;

public class ConstructorsChaining {
        /*Constructor chaining can be done in two ways:
        Within same class: It can be done using this() keyword for constructors in same class
        From base class: by using super() keyword to call constructor from the base class.*/

    /*
    Rules of constructor chaining :

    The this() expression should always be the first line of the constructor.
    There should be at-least be one constructor without the this() keyword (constructor 3 in above example).
    Constructor chaining can be achieved in any order.*/

    ConstructorsChaining(){
        // move to second constructor
        this(5);
        System.out.println("default constructor called");
    }

    ConstructorsChaining(int num){
        // move to third constructor
        this(5,5);
        System.out.println(num);
    }

    ConstructorsChaining(int x, int y){
        // execution starts
        System.out.println(x*y);
    }
    public static void main(String[] args) {
        // invokes default constructor first
        new ConstructorsChaining();
    }
}
