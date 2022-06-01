package com.practice.javaConversion;

public class ObjToString {
    public static void main(String[] args) {
        // example1();
        example2();
    }
    public static void example1() {
        Emp e=new Emp();
        String s=e.toString();
        String s2=String.valueOf(e);
        System.out.println(s);
        System.out.println(s2);
    }

    public static void example2() {
        String s="hello";
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String rev=sb.toString();//converting StringBuilder to String
        System.out.println("String is: "+s);
        System.out.println("Reverse String is: "+rev);
    }
}
class Emp{

}