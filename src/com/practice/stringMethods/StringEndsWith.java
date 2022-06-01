package com.practice.stringMethods;

public class StringEndsWith {
    public static void main(String[] args) {
        // endsWith();
        // endsWith2();
        // endsWith3();
        endsWith4();
    }
        public static void endsWith(){
            String s1="java by javatpoint";
            System.out.println(s1.endsWith("t"));
            System.out.println(s1.endsWith("point"));

        }
    public static void endsWith2(){
        String str = "Welcome to Javatpoint.com";
        System.out.println(str.endsWith("point"));
        if(str.endsWith(".com")) {
            System.out.println("String ends with .com");
        }else System.out.println("It does not end with .com");
    }
    public static void endsWith3(){
        String str = "Welcome to JavaTpoint";

        System.out.println(str.endsWith("javaTpoint")); // false because J and j are different
        System.out.println(str.endsWith("Javatpoint")); // false because T and t are different
        System.out.println(str.endsWith("JavaTpoint")); // true because every character is same
    }
    public static void endsWith4(){
        String str = "Welcome to JavaTpoint";
        System.out.println(str.endsWith(""));
        System.out.println(str.endsWith(" "));
    }
    }
