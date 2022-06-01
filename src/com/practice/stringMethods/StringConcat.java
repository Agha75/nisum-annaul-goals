package com.practice.stringMethods;

public class StringConcat {
    public static void main(String[] args) {
        // concat();
        // concat2();
        // concat3();
        concat4();
    }
    public static void concat(){
        String s1="java string";
        s1.concat("is immutable");
        System.out.println(s1);
        s1=s1.concat(" is immutable so assign it explicitly");
        System.out.println(s1);
    }

    public static void concat2(){
        String str1 = "Hello";
        String str2 = "Javatpoint";
        String str3 = "Reader";
        // Concatenating one string
        String str4 = str1.concat(str2);
        System.out.println(str4);
        // Concatenating multiple strings
        String str5 = str1.concat(str2).concat(str3);
        System.out.println(str5);
    }
    public static void concat3(){
        String str1 = "Hello";
        String str2 = "Javatpoint";
        String str3 = "Reader";
        // Concatenating Space among strings
        String str4 = str1.concat(" ").concat(str2).concat(" ").concat(str3);
        System.out.println(str4);
        // Concatenating Special Chars
        String str5 = str1.concat("!!!");
        System.out.println(str5);
        String str6 = str1.concat("@").concat(str2);
        System.out.println(str6);
    }

    public static void concat4(){
        String str = "Country";
        String s = "Pak is my ".concat(str);
        System.out.println(s);
    }
}
