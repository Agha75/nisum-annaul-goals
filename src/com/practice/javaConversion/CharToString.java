package com.practice.javaConversion;

public class CharToString {
    public static void main(String[] args) {
        example1();
        example2();
    }

    public static void example1() {
        char c = 'S';
        String s = String.valueOf(c);
        System.out.println("String is: " + s);
    }

    public static void example2() {
        char c = 'M';
        String s = Character.toString(c);
        System.out.println("String is: " + s);
    }
}

