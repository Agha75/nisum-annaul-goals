package com.practice.stringMethods;

import java.util.ArrayList;

public class StringSpilt {
    public static void main(String[] args) {
        // example();
        example2();
    }
    public static void example() {
        String s1="java string split method by javatpoint";
        String[] words=s1.split("\\s");//splits the string based on whitespace
        //using java foreach loop to print elements of string array
        for(String w:words){
            System.out.println(w);
        }
    }

    public static void example2() {
        String s1="welcome to split world";
        System.out.println("returning words:");
        for(String w:s1.split("\\s",0)){
            System.out.println(w);
        }
        System.out.println("returning words:");
        for(String w:s1.split("\\s",1)){
            System.out.println(w);
        }
        System.out.println("returning words:");
        for(String w:s1.split("\\s",2)){
            System.out.println(w);
        }
    }
}
