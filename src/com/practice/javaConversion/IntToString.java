package com.practice.javaConversion;

public class IntToString {
    public static void main(String[] args) {
        // example1();
        // example2();
        // example3();
    }
    public static void example1() {
        int i=200;
        String s=String.valueOf(i);
        System.out.println(i+100);//300 because + is binary plus operator
        System.out.println(s+100);//200100 because + is string concatenation operator
    }

    public static void example2() {
        int i=200;
        String s=Integer.toString(i);
        System.out.println(i+100);//300 because + is binary plus operator
        System.out.println(s+100);//200100 because + is string concatenation operator
    }

    public static void example3() {
        int i=200;
        String s=String.format("%d",i);
        System.out.println(s);
    }
}
