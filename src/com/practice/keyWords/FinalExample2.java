package com.practice.keyWords;

public class FinalExample2 {
    // Declaring and customly initializing static final
    // variable
    static final int CAPACITY = 4;
    public static void main(String[] args) {
        // Re-assigning final variable
        // will throw compile-time error
        // CAPACITY = 5;
    }
}
class FinalExample3{
    public static void example3(){
        // Declaring local final variable
        final int i;

        // Now initializing it with integer value
        i = 20;

        // Printing the value on console
        System.out.println(i);
    }
}
