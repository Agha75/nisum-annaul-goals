package com.practice.stringMethods;

public class StringCompareTo {
    // if s1 > s2, it returns positive number
    // if s1 < s2, it returns negative number
    // if s1 == s2, it returns 0
    public static void main(String[] args) {
        // example();
        // example2();
        example3();

    }

    public static void example(){
        String s1="hello";
        String s2="hello";
        String s3="meklo";
        String s4="hemlo";
        String s5="flag";
        System.out.println(s1.compareTo(s2));//0 because both are equal
        System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"
        System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"
        System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"
    }
    public static void example2(){
        String s1="hello";
        String s2="";
        String s3="me";
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));
        System.out.println(s3.compareTo(s2));
    }
    public static void example3(){
        //compareTo takes care of case sensitive
        String st1 = new String("PAK IS MY COUNTRY");
        String st2 = new String("pak is my country");
        System.out.println(st1.compareTo(st2));
        System.out.println(st2.compareTo(st1));
    }
}
