package com.practice.stringMethods;

public class StringTrim {
    public static void main(String[] args) {
        // example();
        example2();
    }
    public static void example() {
        String s1="  hello string   ";
        System.out.println(s1+"javatpoint");//without trim()
        System.out.println(s1.trim()+"javatpoint");//with trim()
    }

    public static void example2() {
        String s1 ="  hello java string   ";
        System.out.println(s1.length());
        System.out.println(s1); //Without trim()
        String tr = s1.trim();
        System.out.println(tr.length());
        System.out.println(tr); //With trim()
    }
}
