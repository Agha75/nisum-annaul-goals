package com.practice.polymorphism;

class Maths{
    public static int multiply(int a, int b){
        return a*b;
    }

    public static double multiply(double a, double b){
        return (a*b);
    }

        };
public class Overloading {
    public static void main(String[] args) {
        System.out.println(Maths.multiply(2,3));
        System.out.println(Maths.multiply(2.2,3.2));

    }
}
