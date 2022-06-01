package com.practice.stringMethods;

public class StringMethods {
    public static void main(String[] args) {
        // charAt();
        // length();
        // example();
        // example2();
    }
    public static void example2() {
        //count of letter exist
        String str = "Syed Rozeuddin Agha";
        int count = 0;
        for (int i=0; i<=str.length()-1; i++) {
            if(str.charAt(i) == 'd') {
                count++;
            }
        }
        System.out.println("Frequency of d is: "+count);
    }
    public static void example(){
        //odd index characters
        String name="Syed Rozeuddin Agha";
        for (int i=0; i<name.length(); i++)
            if (i%2!=0)
                System.out.println("Odd "+i+ "  "+name.charAt(i));
    }
    public static void length(){
        String name="Syed Rozeuddin Agha";
        int abc=name.length();
        System.out.println(abc);
    }
    public static void charAt(){
        String name="Syed Rozeuddin Agha";
        char abc=name.charAt(5);
        System.out.println(abc);
    }
}
