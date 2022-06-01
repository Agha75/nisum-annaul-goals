package com.practice.exceptionHandling;

public class ExampleTwo {
    public static void main(String[] args) {
        try {
            // array of size 4.
            int[] arr = new int[4];

            // this statement causes an exception
            int i = arr[4];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getCause());
        }

        // the following statement will never execute
        System.out.println("Hi, I want to execute");
    }
}
