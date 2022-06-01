package com.practice.keyWords;

// Note: final variable --> To create constant variable
// final Methods -->Prevent Method overriding
// final class --> prevent Inheritance

class GFG {

    // a final variable
    // direct initialize
    final int THRESHOLD = 5;

    // a blank final variable
    final int CAPACITY;

    // another blank final variable
    final int MINIMUM;

    // a final static variable PI
    // direct initialize
    static final double PI = 3.141592653589793;

    // a  blank final static  variable
    static final double EULERCONSTANT;

    // instance initializer block for
    // initializing CAPACITY
    {
        CAPACITY = 25;
    }

    // static initializer block for
    // initializing EULERCONSTANT
    static {
        EULERCONSTANT = 2.3;
    }

    // constructor for initializing MINIMUM
    // Note that if there are more than one
    // constructor, you must initialize MINIMUM
    // in them also
    public GFG() {
        MINIMUM = -1;
    }
}
public class FinalExample1 {
    public static void main(String[] args) {
        // Creating sn object of StringBuilder class
        // Final reference variable
        final StringBuilder sb = new StringBuilder("Geeks");

        // Printing the element in StringBuilder object
        System.out.println(sb);

        // changing internal state of object reference by
        //  final reference variable sb
        sb.append("ForGeeks");

        // Again printing the element in StringBuilder
        // object after appending above element in it
        System.out.println(sb);
    }
}
