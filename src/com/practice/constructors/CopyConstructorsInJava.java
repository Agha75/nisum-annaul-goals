package com.practice.constructors;

public class CopyConstructorsInJava {
    // Like C++, Java also supports copy constructor. But, unlike C++, Java doesn’t create a default copy constructor if you don’t write your own.
    public static void main(String[] args) {
        A a=new A(10,15);
        System.out.println(a);

        A b=new A(a);
        System.out.println(b);

    }
}

class A{
    private double re, im;
    public A(double ree, double imm){
        this.re = ree;
        this.im = imm;
    }

    A(A a){
        System.out.println("copy constructor called");
        re = a.re;
        im = a.im;
    }

    @Override
    public String toString() {
        return "("+re+" + "+im+")";
    }
}
