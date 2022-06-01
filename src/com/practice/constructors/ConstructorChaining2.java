package com.practice.constructors;

public class ConstructorChaining2 {
    ConstructorChaining2(){
        // execution starts
        System.out.println("default constructor called");
    }

    ConstructorChaining2(int num){
        // moves to first
        this();
        System.out.println(num);
    }

    ConstructorChaining2(int x, int y){
        // moves to second
        this(5);
        System.out.println(x*y);
    }

        public static void main(String[] args) {
            // invokes default constructor first
            new ConstructorChaining2(1,2);
        }
    }
