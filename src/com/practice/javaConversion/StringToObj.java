package com.practice.javaConversion;

public class StringToObj {
    public static void main(String[] args) throws ClassNotFoundException {
        // example1();
        // example2();
    }
    public static void example1() {
        String s="hello";
        Object obj=s;
        System.out.println(obj);
    }

    public static void example2() throws ClassNotFoundException {
        Class c=Class.forName("java.lang.String");
        System.out.println("class name: "+c.getName());
        System.out.println("super class name: "+c.getSuperclass().getName());
    }
}
