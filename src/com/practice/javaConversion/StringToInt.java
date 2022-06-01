package com.practice.javaConversion;

public class StringToInt {
    public static void main(String[] args) {
        // example1();
        // example2();
        // example3();
        // example4();
    }

    public static void example1() {
        //Declaring String variable
        String s = "200";
//Converting String into int using Integer.parseInt()
        int i = Integer.parseInt(s);
//Printing value of i
        System.out.println(i);
    }

    public static void example2() {
        //Declaring String variable
        String s = "200";
//Converting String into int using Integer.parseInt()
        int i = Integer.parseInt(s);
        System.out.println(s + 100);//200100, because "200"+100, here + is a string concatenation operator
        System.out.println(i + 100);//300, because 200+100, here + is a binary plus operator
    }

    public static void example3() {
        //Declaring a string
        String s = "200";
//converting String into Integer using Integer.valueOf() method
        Integer i = Integer.valueOf(s);
        System.out.println(i);
    }

    public static void example4() {
            String s = "hello";
            int i = Integer.parseInt(s);
            System.out.println(i);
    }
}