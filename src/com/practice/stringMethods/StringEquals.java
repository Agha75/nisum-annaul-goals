package com.practice.stringMethods;

import java.util.ArrayList;

public class StringEquals {
    public static void main(String[] args) {
        // example();
        example2();
    }
    public static void example(){
        String s1 = "javatpoint";
        String s2 = "javatpoint";
        String s3 = "Javatpoint";
        System.out.println(s1.equals(s2));
        if (s1.equals(s3)) {
            System.out.println("both strings are equal");
        }else System.out.println("both strings are unequal");
    }

    public static void example2(){
        String str1 = "tiger";
        ArrayList<String> list = new ArrayList<>();
        list.add("cat");
        list.add("elephant");
        list.add("tiger");
        list.add("rabbit");
        for (String str : list) {
            if (str.equals(str1)) {
                System.out.println("tiger is present");
            }
        }
    }
}

