package com.practice.javaConversion;

public class StringToChar {
    public static void main(String[] args) {
        // example1();
        // example2();
    }

    public static void example1() {
        String s = "hello";
        char c = s.charAt(0);//returns h
        System.out.println("1st character is: " + c);
    }

    public static void example2() {
        String s = "hello";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println("char at " + i + " index is: " + c);
        }
    }
}
