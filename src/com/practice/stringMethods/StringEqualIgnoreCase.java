package com.practice.stringMethods;

import java.util.ArrayList;

public class StringEqualIgnoreCase {
    public static void main(String[] args) {
        // example();
        example2();
    }

    public static void example() {
        String s1="javatpoint";
        String s2="javatpoint";
        String s3="JAVATPOINT";
        String s4="python";
        System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same
        System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored
        System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same
    }

    public static void example2() {
        String str1 = "Tiger";
        ArrayList<String> list = new ArrayList<>();
        list.add("cat");
        list.add("elephant");
        list.add("tiger");
        list.add("rabbit");
        for (String str : list) {
            if (str.equalsIgnoreCase(str1)) {
                System.out.println("tiger is present");
            }
        }
    }
}
