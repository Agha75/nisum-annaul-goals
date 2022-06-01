package com.practice.stringMethods;

public class StringContains {
    public static void main(String[] args) {
        // contains();
        // contains2();
        contains3();
    }
    public static void contains(){
        String name="what do you know about me";
        System.out.println(name.contains("do you know"));
        System.out.println(name.contains("about"));
        System.out.println(name.contains("hello"));
    }

    public static void contains2(){
        String str = "Hello Javatpoint readers";
        boolean isContains = str.contains("Javatpoint");
        System.out.println(isContains);
        // Case Sensitive
        System.out.println(str.contains("javatpoint")); // false
    }
    public static void contains3(){
        String str = "To learn Java visit Javatpoint.com";
        if(str.contains("Javatpoint.com")) {
            System.out.println("This string contains javatpoint.com");
        }else
            System.out.println("Result not found");
    }
}

