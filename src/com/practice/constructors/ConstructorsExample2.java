package com.practice.constructors;

public class ConstructorsExample2 {

    public static void main(String[] args) {
        Abc a = new Abc(15,"abcd");
        System.out.println(a.age+ " "+ a.name);

        Abc b = new Abc("abcd");

        Abc c = new Abc(15);

    }
}
class Abc{
    int age;
    String name;
    Abc(int age, String name){
        this.name = name;
        this.age = age;
    }
    Abc(String name){
        this.name = name;
        System.out.println(name);
    }
    Abc(int age){
        this.age=age;
        System.out.println(age);
    }
}
